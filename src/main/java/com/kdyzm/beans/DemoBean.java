package com.kdyzm.beans;

public class DemoBean {

    private String url;

    public DemoBean() {

    }

    public DemoBean(String url) {
        this.url = url;
    }

    public void hello() {
        System.out.println("url=" + url);
    }
}
