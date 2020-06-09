package com.albert.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: <公用返回结果对象>
 *
 * @auther: cyq
 * @create: 22:21 2020/6/8
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
