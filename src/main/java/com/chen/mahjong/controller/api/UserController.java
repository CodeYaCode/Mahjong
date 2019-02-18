package com.chen.mahjong.controller.api;

import com.chen.mahjong.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author LiuChen
 * @create 2019-02-17-1:35
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    private IUserService userService;

    @PostMapping("/create")
    public String create(@RequestParam("username") String username) {
        return userService.create(username).toJson();
    }

    @GetMapping("/list")
    public String listAll() {
        return userService.listAll().toJson();
    }

//    @GetMapping("/login")
//    public String login(@RequestParam("username") String username) {
//        return userService.login(username).toJson();
//    }

    @GetMapping("/logout")
    public String logout() {
        return userService.logout().toJson();
    }
}
