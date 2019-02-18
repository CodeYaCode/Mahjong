package com.chen.mahjong.service;

import com.chen.mahjong.common.Response;
import org.apache.ibatis.annotations.Param;

/**
 * @author LiuChen
 * @create 2019-02-17-16:37
 */
public interface IRoomService {

    /**
     * 创建房间
     * @param nickname nickname
     * @return response
     */
    Response create(String nickname);

    /**
     * 列出所有的房间
     * @return response
     */
    Response list();
}
