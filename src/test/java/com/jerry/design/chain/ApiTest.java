package com.jerry.design.chain;

import com.jerry.design.chain.impl.Level1AuthLink;
import com.jerry.design.chain.impl.Level2AuthLink;
import com.jerry.design.chain.impl.Level3AuthLink;
import org.junit.jupiter.api.Test;

/**
 * 测试使用责任链
 */
public class ApiTest {

    @Test
    public void testAuthLink(){
        AuthLink jerry = new Level3AuthLink("1003", "Jerry")
                .appendNext(new Level2AuthLink("1002", "Jing"))
                .appendNext(new Level1AuthLink("1001", "Jing"));
    }
}
