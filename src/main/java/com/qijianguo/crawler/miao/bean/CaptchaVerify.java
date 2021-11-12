package com.qijianguo.crawler.miao.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qijianguo
 */
@NoArgsConstructor
@Data
public class CaptchaVerify extends Result {

    private Bean bean;

    @NoArgsConstructor
    @Data
    public class Bean {
        private int status;

        private String guid;

    }

}
