/**
 * CopyRight (C)  2017-2018  武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/05/22 11:17
 * ProjectName : multimodule
 * Description : UserController
 * Version : V1.0
 */
package com.dwyanewang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getUserById/{id}")
    public User getUseById(@PathVariable("id") Long id){
        System.out.println("id = [" + id + "]");
        return userService.getUserById(id);
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
