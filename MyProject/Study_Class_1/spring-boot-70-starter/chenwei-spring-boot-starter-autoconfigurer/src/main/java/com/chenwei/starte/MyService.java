package com.chenwei.starte;


public class  MyService {

    MyProperties myProperties;

    public MyProperties getMyProperties() {
        return myProperties;
    }

    public void setMyProperties(MyProperties myProperties) {
        this.myProperties = myProperties;
    }

    public String sayHelloChenWei(String name){

        //打招呼为可配置内容
        return myProperties.getPrefix()+"_"+name+myProperties.getSuffix();
    }
}
