package com.ruanjianwei.base64;

import sun.misc.BASE64Encoder;

import java.util.Base64;

/**
 * created by Savage
 * 2019/7/25 current system date
 */
public class Base64Util {

    //基本加密算法
    /**
     * base64  基本加密
     */
    public static String encryptBase64(byte[] key){

        String base = (new BASE64Encoder()).encodeBuffer(key);
        return base;

    }

    /**
     * base64 基本解密
     */
    public static String oncryptBase64(byte[] key){

        String base = (new BASE64Encoder()).encodeBuffer(key);
        return base;

    }

    public static void main(String[] args) {
        String str = "1234567";
        String result01 = Base64Util.encryptBase64(str.getBytes());
        String result02 = Base64Util.oncryptBase64(result01.getBytes());
        System.out.println(result01);
        System.out.println(result02);
    }




}
