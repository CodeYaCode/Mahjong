package com.chen.mahjong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LiuChen
 * @create 2019-02-17-1:35
 */
@Controller
public class IndexController {

    @RequestMapping
    public String index() {
        return "login";
    }
}
