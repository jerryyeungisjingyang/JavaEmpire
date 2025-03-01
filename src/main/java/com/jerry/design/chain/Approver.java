package com.jerry.design.chain;

import com.jerry.design.chain.Entity.Request;

public abstract class Approver {

    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void handleRequest(Request request);

}
