package com.test.http.req;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@ToString
public class McEunexRespBO  {

    /**
     * 开盘价
     */
    private List<BigDecimal> o;
    /**
     * 收盘价
     */
    private List<BigDecimal> c;
    /**
     * 最高价
     */
    private List<BigDecimal> h;
    /**
     * 最低价
     */
    private List<BigDecimal> l;
    /**
     * 最后成交时间
     */
    private List<Long> t;
    /**
     * 成交量
     */
    private List<BigDecimal> v;
    /**
     * 下一次时间
     */
    private Integer nextTime;
    /**
     * 是否有数据
     */
    private Boolean noData;
    /**
     * 是否成功
     */
    private String s;
}
