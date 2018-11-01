package com.jiangyuqin.controller;

import com.jiangyuqin.constance.Constance;
import com.jiangyuqin.model.UsrAdmin;
import com.jiangyuqin.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    private IUserService userService;
    Logger log = LoggerFactory.getLogger(UserController.class);
    /*@Resource
    private IBaseService baseService;*/

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
    @ResponseBody
    public Object insertUser(String name){
        userService.insertUser(name);
        return "OK";
    }

    @RequestMapping("selectAll")
    @ResponseBody
    public List<UsrAdmin> selectAll(){
        if (Constance.valueOf("SYSDEBUGE").booleanValue){
            log.info("发起全量查询请求！");
        }
        return userService.selectAll();
    }

    @RequestMapping("update")
    public Object update(){
        return userService.update();
    }

}
