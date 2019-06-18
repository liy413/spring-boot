package com.liy;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "hello")
public class HelloProperties {

    public static final String SAY = "hello";
    public static final String NAME = "zhangsan";

    private String say = SAY;
    private String name = NAME;

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
