package com.qijianguo.crawler.miao.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户信息
 * @author qijianguo
 */
@NoArgsConstructor
@Data
public class User extends Result {

    private UserBean user;

    @NoArgsConstructor
    @Data
    public static class UserBean {
        /**
         * birthday : 生日信息
         * tel : 手机号
         * cname : 姓名
         * sex : 性别：女2，男1
         * idcard : 身份证
         * doctype : 1
         */
        private String birthday;
        private String tel;
        private String cname;
        private int sex;
        private String idcard;
        private int doctype;
    }

    @Override
    public String toString() {
        return "User{" +
                "status=" + status +
                ", user=" + user +
                '}';
    }
}
