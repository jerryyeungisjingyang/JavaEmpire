package com.jerry.design.chain;

import com.jerry.design.chain.Entity.Request;
import com.jerry.design.chain.impl.CEO;
import com.jerry.design.chain.impl.Director;
import com.jerry.design.chain.impl.Manager;

public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        // 1. 创建具体处理者
        Manager manager = new Manager();
        Director director = new Director();
        CEO ceo = new CEO();

        // 2. 构造责任链：经理 -> 总监 -> CEO
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        // 3. 创建不同等级的请求
        Request request1 = new Request("费用申请", 1, "小明出差费用");
        Request request2 = new Request("请假申请", 2, "小李请假三天");
        Request request3 = new Request("资源购买申请", 3, "公司要采购一台新服务器");

        // 4. 让链条上的第一个处理者(经理)去处理
        System.out.println("----处理Request1----");
        manager.handleRequest(request1);

        System.out.println("\n----处理Request2----");
        manager.handleRequest(request2);

        System.out.println("\n----处理Request3----");
        manager.handleRequest(request3);
    }
}
