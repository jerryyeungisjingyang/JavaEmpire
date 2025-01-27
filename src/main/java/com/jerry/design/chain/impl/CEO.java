package com.jerry.design.chain.impl;

import com.jerry.design.chain.Approver;
import com.jerry.design.chain.Entity.Request;

public class CEO extends Approver {

    @Override
    public void handleRequest(Request request) {
        if (request.getLevel() <= 3) {
            System.out.println("CEO审批通过："
                    + request.getRequestContent()
                    + "，审批级别：" + request.getLevel());
        } else {
            if (nextApprover != null) {
                nextApprover.handleRequest(request);
            } else {
                System.out.println("没有更高级审批者了，流程结束。");
            }
        }
    }
}
