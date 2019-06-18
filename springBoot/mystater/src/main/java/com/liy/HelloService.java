package com.liy;

public class HelloService {
    private String say;
    private String name;

    public String say(){
        return " "+name+"  "+say+" !";
    }

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
