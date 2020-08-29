package cn.itcast.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/user")
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("Hello SpringMvc");
        return "success";
    }

    @RequestMapping(value = "/testRequestMapping",params = {"username"})
    public String testRequestMapping(){
        System.out.println("测试 RequestMapping");
        return "success";
    }


}
