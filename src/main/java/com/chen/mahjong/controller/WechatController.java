package com.chen.mahjong.controller;

import com.chen.mahjong.service.IWechatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author LiuChen
 * @create 2019-02-17-22:28
 */
@RestController
@RequestMapping("/api/wechat")
public class WechatController {

    @Resource
    private IWechatService wechatService;

    @GetMapping("/login")
    public String login(@RequestParam("code") String code) {

        return wechatService.login(code).toJson();
    }
}
