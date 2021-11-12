package com.qijianguo.crawler.miao.service;

import com.alibaba.fastjson.JSON;
import com.qijianguo.crawler.miao.bean.*;
import com.qijianguo.crawler.miao.util.HttpUtils;
import org.omg.CORBA.portable.UnknownException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qijianguo
 */
public class ZmyyApiService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ZmyyApiService.class);

    private Map<String, String> headers;

    private final String BASE_URL = "https://cloud.cn2030.com/sc/wx/HandlerSubscribe.ashx";

    /**
     * 获取用户信息
     * @throws Exception
     */
    public User userInfo() {
        User user = null;
        try {
            Map<String, String> params = new HashMap<>(1);
            params.put("act", "User");
            String result = HttpUtils.getInstance().executeGetWithJsonAndHeaders(BASE_URL, params, buildHeaders());
            user = JSON.parseObject(result, User.class);
        } catch (Exception e) {
            LOGGER.error("用户信息获取失败: {}", e.getMessage());
        }
        return user;
    }

    /**
     * 获取客户订阅日期详细信息
     * @param pid 九价1， 四价2
     * @param bookingDate 预定时间 yyyy-MM-dd
     */
    public SubscribeDateDetail getCustSubscribeDateDetail(String pid, String bookingDate) {
        SubscribeDateDetail subscribeDateDetail = null;
        try {
            Map<String, String> params = new HashMap<>(4);
            params.put("act", "GetCustSubscribeDateDetail");
            params.put("pid", pid);
            params.put("id", "243");
            params.put("scdate", bookingDate);
            String result = HttpUtils.getInstance().executeGetWithJsonAndHeaders(BASE_URL, params, buildHeaders());
            subscribeDateDetail = JSON.parseObject(result, SubscribeDateDetail.class);
        } catch (Exception e) {
            LOGGER.error("获取客户订阅日期详细信息失败: {}", e.getMessage());
        }
        return subscribeDateDetail;
    }

    /**
     *
     */
    public Captcha getCaptcha() {
        Captcha subscribeDateDetail = null;
        try {
            Map<String, String> params = new HashMap<>(4);
            params.put("act", "GetCaptcha");
            String result = HttpUtils.getInstance().executeGetWithJsonAndHeaders(BASE_URL, params, buildHeaders());
            subscribeDateDetail = JSON.parseObject(result, Captcha.class);
        } catch (Exception e) {
            LOGGER.error("获取客户订阅日期详细信息失败: {}", e.getMessage());
        }
        return subscribeDateDetail;
    }


    public CaptchaVerify captchaVerify(String code) {
        CaptchaVerify captchaVerify = null;
        try {
            Map<String, String> params = new HashMap<>(4);
            params.put("act", "CaptchaVerify");
            params.put("token", "");
            params.put("x", code);
            params.put("y", "5");
            String result = HttpUtils.getInstance().executeGetWithJsonAndHeaders(BASE_URL, params, buildHeaders());
            captchaVerify = JSON.parseObject(result, CaptchaVerify.class);
        } catch (Exception e) {
            LOGGER.error("验证码验证失败: {}", e.getMessage());
        }
        return captchaVerify;
    }

    public Save20 save20(User user, String mxid, String times, String pid, String guid) {
        User.UserBean userInfo = user.getUser();
        Save20 save = null;
        try {
            Map<String, String> params = new HashMap<>(4);
            params.put("act", "Save20");
            params.put("birthday", userInfo.getBirthday());
            params.put("tel", userInfo.getTel());
            params.put("sex", String.valueOf(userInfo.getSex()));
            params.put("cname", userInfo.getCname());
            params.put("doctype", String.valueOf(userInfo.getDoctype()));
            params.put("idcard", "5");
            params.put("mxid", mxid);
            params.put("date", times);
            params.put("pid", pid);
            params.put("Ftime", "1");
            params.put("guid", guid);
            String result = HttpUtils.getInstance().executeGetWithJsonAndHeaders(BASE_URL, params, buildHeaders());
            save = JSON.parseObject(result, Save20.class);
        } catch (Exception e) {
            LOGGER.error("预约信息提交失败: {}", e.getMessage());
        }
        return save;
    }

    private boolean querySuccess(Result result) {
        if (result == null || result.getStatus() != 200) {
            return false;
        }
        return true;
    }

    private Map<String, String> buildHeaders() {
        if (headers != null) {
            return headers;
        }
        return headers = reverse();
    }

    private Map<String, String> reverse() {
        String headers = "Host:cloud.cn2030.com\n" +
                "Content-Type:application/json\n" +
                "zftsl:7c52f5c574f90fa980a779f1337b6ed3\n" +
                "Accept:*/*\n" +
                "Connection:keep-alive\n" +
                "Cookie:ASP.NET_SessionId=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MzY3MDkxMTIuMjkxMjM5LCJleHAiOjE2MzY3MTI3MTIuMjkxMjM5LCJzdWIiOiJZTlcuVklQIiwianRpIjoiMjAyMTExMTIwNTI1MTIiLCJVc2VyaWQiOjE0NTA5Mzc0LCJDYXQiOjIsIktleSI6IjU0ZDYzY2NhZGY0YTc3ZTUiLCJPcGVuaWQiOiJvcXI1bzVLZ3M4SW5FN2ljWnhJZUNGbHA1NXRzIiwiSXNibGFjayI6ZmFsc2UsIlVuaW9uaWQiOiJvVTI2WHQ4QUd0SXZXLWkzUlZLbWlHVzh4TV9NIiwiSXAiOiIxMTQuODQuMTQ2LjEzNCIsIkd1aWQiOm51bGwsIk14aWQiOm51bGwsImlnbm9yZSI6ZmFsc2UsIngiOjB9.2s2c_G5AIT_drrWImCWyFZ9f0-YPXyaryX6ylA1S6MY\n" +
                "User-Agent:Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E217 MicroMessenger/6.8.0(0x16080000) NetType/WIFI Language/en Branch/Br_trunk MiniProgramEnv/Mac\n" +
                "Referer:https://servicewechat.com/wx2c7f0f3c30d99445/91/page-frame.html\n" +
                "Accept-Language:zh-cn\n" +
                "Accept-Encoding:gzip, deflate, br";
        String[] items = headers.split("\\n");
        Map<String, String> map = new HashMap<>();
        for (String item : items) {
            if (item.contains(":")) {
                int i = item.indexOf(":");
                map.put(item.substring(0, i), item.substring(i + 1));
            }
        }
        return map;
    }

    public static void main(String[] args) {
        ZmyyApiService api = new ZmyyApiService();
        /*Map<String, String> reverse = api.reverse();
        System.out.println(reverse);*/

        System.out.println(api.userInfo());

        boolean success = false;
        SubscribeDateDetail custSubscribeDateDetail = null;
        while (null == custSubscribeDateDetail) {
            SubscribeDateDetail local = api.getCustSubscribeDateDetail("1", "2021-11-12");
            if (local != null) {
                if (local.success()) {
                    custSubscribeDateDetail = local;
                    break;
                } else if (CollectionUtils.isEmpty(local.getList())) {
                    LOGGER.warn("订阅日期详细信息列表为空...");
                }
            }
        }

        Captcha captcha = null;
        String code = "33";
        while (null == captcha) {
            Captcha c = api.getCaptcha();
            if (c != null && c.getStatus() == 200) {
                CaptchaVerify verify = api.captchaVerify("");
            } else {

            }
        }


    }

}
