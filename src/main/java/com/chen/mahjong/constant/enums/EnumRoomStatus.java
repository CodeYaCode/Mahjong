package com.chen.mahjong.constant.enums;

/**
 * @author LiuChen
 * @create 2019-02-17-17:49
 */
public enum EnumRoomStatus {
    /**
     * 开放状态
     */
    OPENING(1),
    /**
     * 正在打
     */
    PLAYING(2),
    /**
     * 关闭状态
     */
    CLOSED(3),
    ;
    private int code;

    EnumRoomStatus(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }
}
