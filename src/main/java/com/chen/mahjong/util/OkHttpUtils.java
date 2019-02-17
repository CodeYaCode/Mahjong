package com.chen.mahjong.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.util.Map;

/**
 * @author LiuChen
 * @create 2019-02-17-22:54
 */
public class OkHttpUtils {

    /**
     * get request
     *
     * @param url    url
     * @param params params
     * @return string
     * @throws IOException
     */
    public static String get(String url, Map<String, Object> params) throws IOException {
        return get(parseUrl(url, params));
    }

    /**
     * get request
     *
     * @param url    url
     * @return string
     * @throws IOException IOException
     */
    public static String get(String url) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        try (Response response = client.newCall(request).execute()) {
            if (null != response.body()) {
                return response.body().string();
            }
            return null;
        }
    }

    /**
     * 拼接 get url
     *
     * @param url    url
     * @param params params
     * @return string
     */
    private static String parseUrl(String url, Map<String, Object> params) {
        if (!CollectionUtils.isEmpty(params)) {
            StringBuilder sb = new StringBuilder();
            sb.append(url).append("?");
            params.forEach((key, value) -> {
                sb.append(key).append("=").append(value).append("&");
            });
            url = sb.toString();
            // 删除最后一个 &
            return url.substring(0, url.length() - 1);
        }
        return url;
    }
}
