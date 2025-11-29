package com.hxl.design.entity.evil;

import com.hxl.design.RoleConst;
import com.hxl.design.common.LowLevelRole;

/**
 * 生化幽灵
 * @author hengxiaoliang
 */
public class Ghost extends LowLevelRole {
    /**
     * 初级角色的生命值和攻击力是固定的，唯独角色名不同
     */
    public Ghost() {
        super(RoleConst.GHOST);
    }

    @Override
    public void show() {
        System.out.println(getName() + " 来了！");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " 毒刺攻击！攻击力: " + getAttackPower() + "！生命值: " + getHealthPoints());
    }
}
