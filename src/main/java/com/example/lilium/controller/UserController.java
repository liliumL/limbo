package com.example.lilium.controller;

/*
 * @author Lijunbiao
 * @create 2019/7/8 008 15:53
 */


import com.example.lilium.model.User;
import com.example.lilium.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/User")
@Api(tags="用户api")
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ApiOperation(value = "返回Hello", notes = "返回Hello")
    @ResponseBody
    public String hello() {
        return "Hello World !!!";
    }

    @RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
    @ApiOperation(value = "查询所有用户", notes = "查询所有用户")
    @ResponseBody
    public List<User>getAllUser(){

        return userService.getAllUser();
    }

}
