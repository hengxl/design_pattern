package com.hxl.design.entity.justice;

import com.hxl.design.RoleConst;
import com.hxl.design.common.HighLevelRole;

/**
 * 终极英雄猎手
 *
 * @author hengxiaoliang
 */
public class UltimateHero extends HighLevelRole {

    public UltimateHero() {
        super(RoleConst.ULTIMATE_HERO);
    }

    @Override
    public void show() {
        System.out.println(getName() + " 变身了！");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " 无情斩杀！攻击力: " + getAttackPower() + "！生命值: " + getHealthPoints());
    }

}
