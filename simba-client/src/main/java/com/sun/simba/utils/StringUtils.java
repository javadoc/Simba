package com.sun.simba.utils;

/**
 * Created by sunxin on 2017/11/9.
 */
public class StringUtils {

    public static boolean isEmpty(String value){
        return value==null || value.length()<=0;
    }

    public static boolean isBlank(String value){
        return value==null || value.length()<=0 || value.trim().length()<=0;
    }

    public static void main(String[] args){
        System.out.println(isBlank(" "));
    }
}
