package com.test.http.req;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@ToString
@Getter
@Setter
/*[0] 时间戳 [1] 交易量 [2] 收盘价 [3] 最高价 [4] 最低价 [5] 开盘价*/
public class MarketExchange {
    /**
     * 主键
     */
    private Long id;

    /**
     * 交易数量
     */
    private BigDecimal volume;

    /**
     * 最高价
     */
    private BigDecimal high;

    /**
     * 最低价
     */
    private BigDecimal low;

    /**
     * 开盘价
     */
    private BigDecimal open;

    /**
     * 收盘价
     */
    private BigDecimal close;

    /**
     * 交易时间戳
     */
    private Long timestamp;
}
