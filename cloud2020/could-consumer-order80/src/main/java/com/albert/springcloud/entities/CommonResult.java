package com.albert.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther cyq
 * @create 22:52 2020/6/7
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String  message;
    private T       data;

    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
