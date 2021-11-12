package com.qijianguo.crawler.miao.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.CollectionUtils;

import java.util.List;

@NoArgsConstructor
@Data
public class SubscribeDateDetail extends Result {

    private List<Subscribe> list;

    public boolean success() {
        if (status == 200 && !CollectionUtils.isEmpty(list)) {
            return true;
        }
        return false;
    }

    @NoArgsConstructor
    @Data
    public class Subscribe {
        private String mxid;
    }


}
