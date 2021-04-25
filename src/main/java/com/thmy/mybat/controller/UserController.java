package com.thmy.mybat.controller;

import com.thmy.mybat.mapper.UserMapper;
import com.thmy.mybat.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/zhenghe")
    public String test(Model model){
        model.addAttribute("name",userMapper.selectById(1));
        return "zhenghe";
    }
    @GetMapping("/addMsg")
    @ResponseBody
    public String insert(){
        //Mapper里的insert接口
        userMapper.insert(new User(4, "杨树", "baiyang", "17895010212"));

        return "ok";
    }


}
