package com.java.annotation;

public class ManyAnnotationTest {

    public static void main(String[] args) {
        ZmTestRequestParam zmTestRequestParam = new ZmTestRequestParam();
        zmTestRequestParam.setPassword("    ");
        zmTestRequestParam.setMobile("124586325588");
        zmTestRequestParam.setPhoneArea("6000");

        BeanValidateResult<ZmTestRequestParam> validate = BeanValidator.validate(zmTestRequestParam);
    }

}
