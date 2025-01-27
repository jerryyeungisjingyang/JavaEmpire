package com.jerry.design.chain.Entity;

public class Request {
    private String requestType;
    private int level;
    private String requestContent;

    public Request(String requestType, int level, String requestContent) {
        this.requestType = requestType;
        this.level = level;
        this.requestContent = requestContent;
    }

    public String getRequestType() {
        return requestType;
    }

    public int getLevel() {
        return level;
    }

    public String getRequestContent() {
        return requestContent;
    }
}
