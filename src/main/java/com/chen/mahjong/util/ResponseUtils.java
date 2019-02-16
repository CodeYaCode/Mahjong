package com.chen.mahjong.util;

import com.chen.mahjong.common.Response;

public class ResponseUtils {

    /**
     * 成功
     * @return response
     */
    public static Response success() {
        return new Response(true);
    }

    /**
     * 失败
     * @return response
     */
    public static Response fail() {
        return new Response(false);
    }
}
