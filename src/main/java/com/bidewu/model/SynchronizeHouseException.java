package com.bidewu.model;

import lombok.Data;

/**
 * @author : zym
 * @date : 2018/11/27 17:40
 * @desc :
 */
@Data
public class SynchronizeHouseException extends RuntimeException{
    private String message;
    private Integer code;

    public SynchronizeHouseException(Integer code, String mesage) {

        super(mesage);
        this.setCode(code);
        this.setMessage(mesage);
    }
}
