package com.test.http.req;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import java.util.Map;

@Getter
@Setter
@ToString
public class SendReq {
    public SendReq(String phone, String areaCode, String templateCode, Map<String, String> map, Integer sign) {
        this.phone = phone;
        this.areaCode = areaCode;
        this.templateCode = templateCode;
        this.map = map;
        this.sign = sign;
    }

    private String phone;

    private String areaCode;


    private String templateCode;

    //封装活动参数的集合
    private Map<String,String> map;

    private Integer sign;
}
