package cn.itcast.error;

import java.util.HashMap;
import java.util.Map;

public class ServerError {

    public static Map<Integer, String> httpError = new HashMap<>();

    public static final int SUCCESS = 0;
    public static final int PARAM_ERROR = -1000;
    public static final int LOGIN_FAILURE = -1001;

    static {
        httpError.put(SUCCESS, "success");
        httpError.put(PARAM_ERROR, "param error");
        httpError.put(LOGIN_FAILURE, "login failure");
    }


    public static String getErrorMsg(int errorCode) {
        if (httpError.containsKey(errorCode)) {
            return httpError.get(errorCode);
        } else {
            return "server undefined error";
        }
    }


}
