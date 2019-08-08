//package com.slots.sdp.start;
//
//import com.github.pagehelper.PageInfo;
//import UserDomain;
//import UserService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.core.annotation.Order;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.stereotype.Component;
//
//import java.io.Serializable;
//
///**
// * @Auther: SK
// * @Date: 2019/8/3 22:29
// * @Description:
// */
//
//@Component
//@Order(1) //越小越先执行
//public class InitializeRedisRunner implements ApplicationRunner {
//    private Logger logger = LoggerFactory.getLogger(InitializeRedisRunner.class);
//    @Autowired
//    private UserService userService;
//    @Autowired
//    private StringRedisTemplate  StringRedisTemplate;
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        String[] strs = args.getSourceArgs();
//        for (String str : strs){
//            System.out.print("xxxx----"+str);
//        }
//        PageInfo<UserDomain> pageInfo = userService.findAllUser(0, 10);
//        pageInfo.getList().stream().forEach(userDomain -> {
//            System.out.println("启动执行代码："+userDomain.getPhone());
//        });
//        String key = "user:1";
//        StringRedisTemplate.opsForValue().set(key, "ssssssss");
//        logger.info("uesr: "+StringRedisTemplate.opsForValue().get("user:1"));
//        logger.info("~~~~~~~~~~~~启动结束~~~~~~~~~~~~");
//    }
//
//}
