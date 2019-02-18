package com.chen.mahjong.controller.api;

import com.chen.mahjong.service.IRoomService;
import com.chen.mahjong.util.ResponseUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author LiuChen
 * @create 2019-02-17-1:35
 */
@RestController
@RequestMapping("/api/room")
public class RoomController {

    @Resource
    private IRoomService roomService;

    @PostMapping("/create")
    public String create(@RequestParam("nickname") String nickname) {
        return roomService.create(nickname).toJson();
    }

    @GetMapping("/list")
    public String listAll() {
        return roomService.list().toJson();
    }
}
