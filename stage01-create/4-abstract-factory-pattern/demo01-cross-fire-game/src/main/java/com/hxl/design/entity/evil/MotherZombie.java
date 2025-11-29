package com.hxl.design.entity.evil;

import com.hxl.design.RoleConst;
import com.hxl.design.common.MidLevelRole;

/**
 * 生化母体
 * @author hengxiaoliang
 */
public class MotherZombie extends MidLevelRole {
    /**
     * 中级角色的生命值和攻击力是固定的，唯独角色名不同
     */
    public MotherZombie() {
        super(RoleConst.MOTHER_ZOMBIE);
    }

    @Override
    public void show() {
        System.out.println(getName() + " 诞生了！");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " 毒液感染！攻击力: " + getAttackPower() + "！生命值: " + getHealthPoints());
    }
}
