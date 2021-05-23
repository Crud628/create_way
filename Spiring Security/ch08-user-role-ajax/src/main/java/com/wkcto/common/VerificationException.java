package com.wkcto.common;

import org.springframework.security.core.AuthenticationException;

public class VerificationException extends AuthenticationException {


    public VerificationException(String msg, Throwable t) {
        super(msg, t);
    }

    public VerificationException(String msg) {
        super(msg);
    }

    public VerificationException() {
        super("验证错误，请重新输入");
    }
}
