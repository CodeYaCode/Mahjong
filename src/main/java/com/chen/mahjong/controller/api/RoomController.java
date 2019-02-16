package com.chen.mahjong.controller.api;

import com.chen.mahjong.util.ResponseUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author LiuChen
 * @create 2019-02-17-1:35
 */
@RestController
@RequestMapping("/api/room")
public class RoomController {

    @PostMapping("/create")
    public String create() {
        return ResponseUtils.success().toJson();
    }

    @GetMapping("/list")
    public String listAll() {
        return ResponseUtils.success().toJson();
    }
}
