package com.test.http.req;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.List;

/**
 * 返回数据的封装对象
 * `
 *
 * @author Li fangtao
 */
@ToString
@Getter
@Setter
public class BaseRespBO  {

    /**
     * 消息代码，由RespCode中的code和subCode组成，分别是3位
     **/
    private String code;


    /**
     * 数据对象
     **/
    private List<List<String>>  data;


    public BaseRespBO() {
    }

}
