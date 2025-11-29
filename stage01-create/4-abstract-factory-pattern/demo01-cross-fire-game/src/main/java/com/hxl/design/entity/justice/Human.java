package com.hxl.design.entity.justice;

import com.hxl.design.RoleConst;
import com.hxl.design.common.LowLevelRole;

/**
 * 人类
 *
 * @author hengxiaoliang
 */
public class Human extends LowLevelRole {

    public Human() {
        super(RoleConst.HUMAN);
    }

    @Override
    public void show() {
        System.out.println(getName() + " 诞生了！");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " 持枪攻击！攻击力: " + getAttackPower() + "！生命值: " + getHealthPoints());
    }

}
