package com.liudegui.utils;



import org.apache.tomcat.util.codec.binary.Base64;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Util {
    public static String encode(String pwd) {
        try {
            //生产一个MD5的加密方法
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            return Base64.encodeBase64String(messageDigest.digest(pwd.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args){
        System.out.println(encode("111"));
    }
}