package com.chen.mahjong.common;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LiuChen
 * @create 2019-02-17-1:35
 */
@Data
public class Response {
    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 编码
     */
    private int code;

    /**
     * 信息
     */
    private String message;

    /**
     * 返回数据
     */
    private Map<String, Object> data = new HashMap<>(16);

    public Response(boolean success) {
        this.code = 200;
        this.success = success;
    }

    public Response data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public Response message(String message) {
        this.message = message;
        return this;
    }

    public String toJson() {
        return JSON.toJSONString(this);
    }
}
