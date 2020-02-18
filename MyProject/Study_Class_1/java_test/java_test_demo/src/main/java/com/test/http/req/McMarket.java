package com.test.http.req;


import lombok.ToString;

import java.math.BigDecimal;

/**
 * @author
 */
@ToString
public class McMarket  {
    /**
     * 主键
     */
//    private Long id;
    /**
     * 交易时间戳
     */
    private Long timestamp;

    /**
     * 交易数量
     */
    private BigDecimal volume;

    /**
     * 收盘价
     */
    private BigDecimal close;

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


    private String currency;

    private String legalCurrency;

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public BigDecimal getClose() {
        return close;
    }

    public void setClose(BigDecimal close) {
        this.close = close;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLegalCurrency() {
        return legalCurrency;
    }

    public void setLegalCurrency(String legalCurrency) {
        this.legalCurrency = legalCurrency;
    }

}