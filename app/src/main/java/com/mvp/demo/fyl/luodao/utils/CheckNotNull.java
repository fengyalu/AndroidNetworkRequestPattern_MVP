package com.mvp.demo.fyl.luodao.utils;

/**
 * Created by fyl on 18-7-12.
 */

public class CheckNotNull {

    public static <T> T checkNotNull(T object, String message) {
        if (object == null) {
            throw new NullPointerException(message);
        }
        return object;
    }
}
