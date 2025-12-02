package com.hxl.proxy;

import com.hxl.proxy.agent.HouseAgent;
import com.hxl.proxy.entity.HouseOwner;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 代理模式测试
 *
 * @author hengxiaoliang
 */

@SpringBootTest
public class ProxyTest {

    @Test
    public void testStaticProxy() {
        // 房东
        HouseOwner houseOwner = new HouseOwner("小王", "上海", 300.0);
        HouseAgent agent = new HouseAgent(houseOwner, "中介小李");
        agent.viewHouse();
        agent.makeDeal();
    }

    @Test
    public void testDynamicProxy() {

    }
}
