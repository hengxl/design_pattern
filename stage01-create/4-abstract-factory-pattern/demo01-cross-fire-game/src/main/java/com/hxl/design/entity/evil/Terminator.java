package com.hxl.design.entity.evil;

import com.hxl.design.RoleConst;
import com.hxl.design.common.HighLevelRole;
import com.hxl.design.common.MidLevelRole;

/**
 * 生化终结者
 * @author hengxiaoliang
 */
public class Terminator extends HighLevelRole {
    /**
     * 高级级角色的生命值和攻击力是固定的，唯独角色名不同
     */
    public Terminator() {
        super(RoleConst.TERMINATOR);
    }

    @Override
    public void show() {
        System.out.println(getName() + " 变异了！");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " 恶爪重击！攻击力: " + getAttackPower() + "！生命值: " + getHealthPoints());
    }
}
