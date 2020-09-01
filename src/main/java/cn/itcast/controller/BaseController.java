package cn.itcast.controller;

import cn.itcast.utils.Tools;

import javax.servlet.http.HttpServletRequest;

public class BaseController {

    int i(HttpServletRequest request, String paramKey) {
        return Tools.i(request, paramKey);
    }

    String s(HttpServletRequest request, String paramKey) {
        return Tools.s(request, paramKey);
    }

    double d(HttpServletRequest request, String paramKey) {
        return Tools.d(request, paramKey);
    }

    float f(HttpServletRequest request, String paramKey) {
        return Tools.f(request, paramKey);
    }


    long l(HttpServletRequest request, String paramKey) {
        return Tools.l(request, paramKey);
    }


}
