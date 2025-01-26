package com.jerry.design.chain;


import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 这是一个责任链审批抽象类
 */
@Slf4j
@Getter
public abstract class AuthLink {

    protected Logger logger = LoggerFactory.getLogger(AuthLink.class);

    protected SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    protected String levelUserId;

    protected String levelUserName;

    // 链路
    protected AuthLink next;

    // 1
    // 构造函数 每个子类都会调用
    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    public AuthLink getNext() {
        return next;
    }

    // 处理一下 如何添加这样的一个对象
    public AuthLink appendNext(AuthLink next){
        this.next = next;
        return this;
    }

    //
    // 提供一个抽象的审核方法
    // 子类实现具体的审批逻辑，并决定是否将请求传递给下一个节点。
    public abstract AuthInfo doAuth(String uId, String orderId, Date authDate);

}
