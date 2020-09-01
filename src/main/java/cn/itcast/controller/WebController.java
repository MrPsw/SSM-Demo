package cn.itcast.controller;

import cn.itcast.result.BaseResult;
import cn.itcast.entity.User;
import cn.itcast.error.ServerError;
import cn.itcast.utils.StringTools;
import cn.itcast.utils.Tools;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Controller
@RequestMapping(value = "/v1")
public class WebController extends BaseController {

    @RequestMapping(value = "/Servlet")
    public String handel(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("请求携带参数：" + Tools.i(request, "param"));
        return "primeval_servlet";
    }


    @RequestMapping(value = "/testString")
    public String handel(Model model) {
        User user = new User();
        user.setAge(30);
        user.setDate(new Date());
        user.setName("彭正华");
        model.addAttribute("attribute_user", user);

        return "primeval_servlet";
    }


    @RequestMapping(value = "/testString2")
    @ResponseBody  //直接输出到响应内容
    public BaseResult handel2(HttpServletRequest request, HttpServletResponse response) {
        BaseResult result;

        int param_type = i(request, "type");
        if (param_type == 1) {
            result = new BaseResult(0, new User("彭正华", 27, new Date()));
            System.out.println(JSON.toJSONString(result));
        } else {
            result = new BaseResult<User>(-1);
        }

        return result;

    }


    @RequestMapping(value = "/testString3")
    @ResponseBody  //直接输出到响应内容
    public User handel3(HttpServletRequest request, HttpServletResponse response) {
        if (Tools.i(request, "type") == 1) {
            return new User("彭正华", 27, new Date());
        } else {
            return new User("彭树文", 27, new Date());
        }
    }


    @RequestMapping(value = "/login")
    @ResponseBody
    public BaseResult<User> login(HttpServletRequest request, HttpServletResponse response) {
        String account = s(request, "account");
        String password = s(request, "password");
        if (StringTools.isEmpty(account)
                || StringTools.isEmpty(password)
                || !"13661783921".equals(account)
                || !"199312".equals(password)) {
            return new BaseResult(ServerError.LOGIN_FAILURE);
        } else {
            User userInfo = new User();
            userInfo.setAge(27);
            userInfo.setDate(new Date());
            userInfo.setName("黄正元");
            return new BaseResult(userInfo);
        }
    }


}
