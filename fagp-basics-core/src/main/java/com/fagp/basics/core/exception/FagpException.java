package com.fagp.basics.core.exception;


import com.fagp.basics.core.enm.ResponseCode;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

/**
 * @Auther: King.Song
 * @Description:
 */
public class FagpException extends RuntimeException {
    private static final long serialVersionUID = 8182815460722287938L;
    private ResponseCode responseCode;
    private String message;

    /**
     *
     * @param responseCode 异常状态码
     */
    public FagpException(final ResponseCode responseCode) {
        super(String.valueOf(responseCode.code()));
        this.responseCode = responseCode;
        this.message = responseCode.desc();
    }

    public FagpException(final ResponseCode responseCode, Object... objects) {
        super(String.valueOf(responseCode.code()));
        this.responseCode = responseCode;
        message = ArrayUtils.isEmpty(objects) || StringUtils.isBlank(responseCode.template())
                ? responseCode.desc()  : String.format(this.responseCode.template(), objects);
    }

    /**
     *
     * @param msg 异常信息
     */
    public FagpException(final String msg) {
        super(msg);
    }

    /**
     *
     * @param msg 异常信息
     * @param ex  异常根源
     */
    public FagpException(final String msg, final Throwable ex) {
        super(msg, ex);
    }

    public ResponseCode getResponseCode() {
        return responseCode;
    }

    @Override
    public String getMessage() {
        return Optional.ofNullable(message).orElse(super.getMessage());
    }
}
