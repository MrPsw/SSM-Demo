package cn.itcast.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.lang.NonNull;

import javax.servlet.http.HttpServletRequest;

public class Tools {


    @NonNull
    public static String s(HttpServletRequest request, String key) {
        String param = request.getParameter(key);
        return null == param ? "" : param;
    }

    @NonNull
    public static int i(HttpServletRequest request, String key) {
        String param = request.getParameter(key);
        if (null == param) {
            return 0;
        }
        try {
            return Integer.parseInt(param);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    @NonNull
    public static double d(HttpServletRequest request, String key) {
        String param = request.getParameter(key);
        if (null == param) {
            return 0;
        }
        try {
            return Double.parseDouble(param);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    @NonNull
    public static float f(HttpServletRequest request, String key) {
        String param = request.getParameter(key);
        if (null == param) {
            return 0f;
        }
        try {
            return Float.parseFloat(param);
        } catch (NumberFormatException e) {
            return 0f;
        }
    }


    @NonNull
    public static long l(HttpServletRequest request, String key) {
        String param = request.getParameter(key);
        if (null == param) {
            return 0L;
        }
        try {
            return Long.parseLong(param);
        } catch (NumberFormatException e) {
            return 0L;
        }
    }



}
