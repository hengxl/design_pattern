package com.hxl.design.factory;

import com.hxl.design.common.HighLevelRole;
import com.hxl.design.common.LowLevelRole;
import com.hxl.design.common.MidLevelRole;
import com.hxl.design.entity.evil.Ghost;
import com.hxl.design.entity.evil.MotherZombie;
import com.hxl.design.entity.evil.Terminator;
import com.hxl.design.factory.top.RoleFactory;

/**
 * 邪恶角色工厂
 *
 * @author hengxiaoliang
 */
public class EvilFactory implements RoleFactory {

    @Override
    public LowLevelRole createLowRole() {
        return new Ghost();
    }

    @Override
    public MidLevelRole createMidRole() {
        return new MotherZombie();
    }

    @Override
    public HighLevelRole createHighRole() {
        return new Terminator();
    }
}
