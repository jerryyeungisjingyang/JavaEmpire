package com.jerry.design.chain.impl;

import com.jerry.design.chain.Approver;
import com.jerry.design.chain.Entity.Request;

public class Manager extends Approver {

    @Override
    public void handleRequest(Request request) {
        if (request.getLevel() <= 1) {
            System.out.println("经理审批通过："
                    + request.getRequestContent()
                    + "，审批级别：" + request.getLevel());
        } else {
            if (nextApprover != null) {
                System.out.println("经理无法审批此请求（level = "+ request.getLevel() + "），转给下一个");
                nextApprover.handleRequest(request);
            } else {
                System.out.println("没有更高级审批者了，流程结束。");
            }
        }
    }

}
