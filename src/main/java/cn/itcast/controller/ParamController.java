package cn.itcast.controller;


import cn.itcast.entity.Account;
import cn.itcast.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping(value = "testParam")
    public String testParam(String username){
        System.out.println("执行了param" +username);
        return "success";
    }

    @RequestMapping(value = "saveAccount")
    public String testParam(Account account){
        System.out.println("执行了param" +account.toString());
        return "success";
    }

    @RequestMapping(value = "saveUser")
    public String testParam2(User user){
        System.out.println("执行了param" +user.toString());
        return "success";
    }

}
