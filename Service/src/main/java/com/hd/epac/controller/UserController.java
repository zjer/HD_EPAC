package com.hd.epac.controller;

import com.hd.epac.entity.User;
import com.hd.epac.service.UserService;
import com.hd.epac.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: epac
 * @description:
 * @author: Mr.Shi
 * @create: 2019-03-19 00:45
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @PostMapping("/login")
    public ResultUtil login(@RequestBody User user) {
        return userService.login(user);
    }
}
