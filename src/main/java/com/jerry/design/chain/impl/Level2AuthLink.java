package com.jerry.design.chain.impl;

import com.jerry.design.chain.AuthInfo;
import com.jerry.design.chain.AuthLink;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 一级审批
 */
public class Level2AuthLink extends AuthLink {
    // 需要有一个构造器给父类赋值
    public Level2AuthLink(String uId, String userName){
        super(uId, userName); // 默认调用的是父类的构造器
    }

    @Override
    public AuthInfo doAuth(String uId, String authUserId, Date authDate) {
        if (canApprove("1")){
            // 如果审核方法返回true，那么这里就返回对应的AuthInfo
            return new AuthInfo("0000", "1", new Date(String.valueOf(LocalDateTime.now())));
        }

        AuthLink next = super.getNext();

        if (next != null) {
            return next.doAuth(uId, authUserId, authDate);
        }

        // 没有下一节的话 那么这一节就不通过
        return next.doAuth(uId, authUserId,authDate);

    }

    private boolean canApprove(String orderId) {
        // 具体的审批逻辑
        // ..............
        // 逻辑就不判断了 直接返回审核通过
        String queryData = "";
        if (orderId == ""){
            return true;
        }
        return true;
    }

}
