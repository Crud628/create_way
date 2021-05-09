package com.bdu.tmanager.exception;


import com.bdu.tmanager.bean.ResultCode;

import lombok.Getter;

/**
 * 自定义异常
 * @author lan
 * @date 2021/4/10 - 18:58
 */
@Getter
public class CommonException extends Exception {

    private ResultCode resultCode;

    public CommonException(ResultCode resultCode){
        this.resultCode = resultCode;
    }
}
