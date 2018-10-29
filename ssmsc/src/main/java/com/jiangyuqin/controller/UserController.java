package com.jiangyuqin.controller;

import com.jiangyuqin.model.UsrAdmin;
import com.jiangyuqin.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;
    Logger log = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("select")
    @ResponseBody
    public List<UsrAdmin> userTest(String dacc){
        System.out.println("测试成功~~"+dacc);
        List<UsrAdmin> user = userService.getUser(dacc);
        System.out.println(user.toString());
        if (user.size()>0)
            log.info(user.get(0).toString());
        return user;
    }
    @RequestMapping("addUser")
    public Object insertUser(int id,String name,int age,String sex){
        userService.insertUser(id,name,age,sex);
        return "OK";
    }

    @RequestMapping("selectAll")
    @ResponseBody
    public List<UsrAdmin> selectAll(){
        log.info("发起全量查询请求！");
        return userService.selectAll();
    }
    @RequestMapping("update")
    public Object update(){
        return userService.update();
    }

}
