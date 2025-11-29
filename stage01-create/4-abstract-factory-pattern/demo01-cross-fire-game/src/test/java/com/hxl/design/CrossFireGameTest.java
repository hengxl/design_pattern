package com.hxl.design;

import com.hxl.design.common.HighLevelRole;
import com.hxl.design.common.LowLevelRole;
import com.hxl.design.common.MidLevelRole;
import com.hxl.design.factory.EvilFactory;
import com.hxl.design.factory.JusticeFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CrossFireGameTest {

    @Test
    public void testCrossFire() {
        System.out.println("角色工厂准备...");
        JusticeFactory justiceFactory = new JusticeFactory();
        EvilFactory evilFactory = new EvilFactory();

        System.out.println("游戏开始...");
        LowLevelRole human = justiceFactory.createLowRole();
        human.show();
        LowLevelRole ghost = evilFactory.createLowRole();
        ghost.show();
        human.attack();
        ghost.attack();
        
        System.out.println("游戏进入关键时刻...");
        MidLevelRole hero = justiceFactory.createMidRole();
        hero.show();
        MidLevelRole motherZombie = evilFactory.createMidRole();
        motherZombie.show();
        hero.attack();
        motherZombie.attack();

        System.out.println("末日来临...");
        HighLevelRole terminator = evilFactory.createHighRole();
        terminator.show();
        terminator.attack();

        System.out.println("希望降临...");
        HighLevelRole ultimateHero = justiceFactory.createHighRole();
        ultimateHero.show();
        ultimateHero.attack();
    }
}
