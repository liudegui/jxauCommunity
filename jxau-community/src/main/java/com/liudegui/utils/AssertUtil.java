package com.liudegui.utils;


import com.liudegui.base.exceptions.ParamsException;

public class AssertUtil {
    public static void isTrue(boolean flag,String msg){
        if(flag){
            throw new ParamsException(300,msg);
        }
    }
    public static void isTrue(boolean flag,Integer code,String msg){
        if(flag){
            throw new ParamsException(code,msg);
        }
    }
}