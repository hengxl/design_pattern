package com.hxl.design.factory;

import com.hxl.design.common.HighLevelRole;
import com.hxl.design.common.LowLevelRole;
import com.hxl.design.common.MidLevelRole;
import com.hxl.design.entity.justice.Hero;
import com.hxl.design.entity.justice.Human;
import com.hxl.design.entity.justice.UltimateHero;
import com.hxl.design.factory.top.RoleFactory;

/**
 * 生产正义角色的工厂
 * @author hengxiaoliang
 */
public class JusticeFactory implements RoleFactory {

    @Override
    public LowLevelRole createLowRole() {
        return new Human();
    }

    @Override
    public MidLevelRole createMidRole() {
        return new Hero();
    }

    @Override
    public HighLevelRole createHighRole() {
        return new UltimateHero();
    }
}
