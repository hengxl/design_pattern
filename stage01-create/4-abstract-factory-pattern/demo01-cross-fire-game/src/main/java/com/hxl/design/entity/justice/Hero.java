package com.hxl.design.entity.justice;

import com.hxl.design.RoleConst;
import com.hxl.design.common.MidLevelRole;

/**
 * 英雄猎手
 *
 * @author hengxiaoliang
 */
public class Hero extends MidLevelRole {

    public Hero() {
        super(RoleConst.HERO);
    }

    @Override
    public void show() {
        System.out.println(getName() + " 出现了！");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " 双刃重击！攻击力: " + getAttackPower() + "！生命值: " + getHealthPoints());
    }

}
