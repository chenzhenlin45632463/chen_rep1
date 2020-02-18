package com.java.enumtest;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum Count {
    /**
     * 比特币
     **/
    BTC("BTC", "比特币"),

    /**
     * 比特币现金
     **/
    BCH("BCH", "比特币现金"),

    /**
     * 以太经典
     **/
    ETC("ETC", "以太经典"),

    /**
     * 莱特币
     **/
    LTC("LTC", "莱特币"),

    /**
     * 以太坊
     **/
    ETH("ETH", "以太坊"),

    /**
     * 最美
     **/
    ZM("ZM", "最美"),

    /**
     * 最美token
     **/
    ZMTK("ZMTK", "最美token"),

    /**
     * 稳定币 USD
     **/
    USDT("USDT", "稳定币"),

    /**
     * 法币 人民币
     **/
    CNY("CNY", "人民币"),
    ;

    Count(String code, String description) {
        this.code = code;
        this.description = description;
    }

    private String code;
    private String description;

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
