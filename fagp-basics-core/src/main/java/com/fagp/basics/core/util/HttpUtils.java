package com.fagp.basics.core.util;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * H5微信支付配置
 *
 * @author zhengrj
 * @since 2017-07-12
 */
public class HttpUtils {
    private static Logger logger = LoggerFactory.getLogger(HttpUtils.class);
    public static final Gson gson = new GsonBuilder()
            .enableComplexMapKeySerialization()
            .create();

    /**
     * 发起请求操作
     *
     * @param requestUrl
     * @param requestMethod
     * @param data
     * @return
     */
    public static String httpsRequest(String requestUrl, String requestMethod, String data) {
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);

            // 设置请求方式（GET/POST）
            conn.setRequestMethod(requestMethod);
            conn.setRequestProperty("content-type", "application/x-www-form-urlencoded");

            // 当outputStr不为null时向输出流写数据
            if (null != data) {
                OutputStream outputStream = conn.getOutputStream();
                // 注意编码格式
                outputStream.write(data.getBytes("UTF-8"));
                outputStream.close();
            }

            // 从输入流读取返回内容
            InputStream inputStream = conn.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String str;
            StringBuffer buffer = new StringBuffer();
            while ((str = bufferedReader.readLine()) != null) {
                buffer.append(str);
            }
            // 释放资源
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
            conn.disconnect();
            return buffer.toString();
        } catch (ConnectException ex) {
            logger.error(ex.getMessage());
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }

    public static String httpsRequest(String requestUrl, String requestMethod, Map<String, Object> header, String data) {
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);

            // 设置请求方式（GET/POST）
            conn.setRequestMethod(requestMethod);
            conn.setRequestProperty("content-type", "application/json");

            //设置请求头信息
            if (header != null && !header.isEmpty()) {
                for (Map.Entry<String, Object> entry : header.entrySet()) {
                    conn.setRequestProperty(Optional.ofNullable(entry.getKey()).orElse(StringUtils.EMPTY), Optional.ofNullable(entry.getValue()).orElse(StringUtils.EMPTY).toString());
                }
            }

            // 当outputStr不为null时向输出流写数据
            if (null != data) {
                OutputStream outputStream = conn.getOutputStream();
                // 注意编码格式
                outputStream.write(data.getBytes("UTF-8"));
                outputStream.close();
            }

            // 从输入流读取返回内容
            InputStream inputStream = conn.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String str;
            StringBuffer buffer = new StringBuffer();
            while ((str = bufferedReader.readLine()) != null) {
                buffer.append(str);
            }
            // 释放资源
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
            conn.disconnect();
            return buffer.toString();
        } catch (ConnectException ex) {
            logger.error(ex.getMessage());
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }

    public static void main(String[] arg){
        String url = "http://127.0.0.1:8080/user/all";
        Map<String, String> map = new HashMap<>();
        map.put("pageNum", "0");
        map.put("pageSize", "10");
       String json = httpsRequest(url, "GET", null,  new Gson().toJson(map));
       System.out.println(json);


    }

}
