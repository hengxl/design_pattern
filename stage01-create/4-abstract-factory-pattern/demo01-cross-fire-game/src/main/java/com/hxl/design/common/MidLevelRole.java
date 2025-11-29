package com.hxl.design.common;

import com.hxl.design.common.top.RoleProperties;

/**
 * 中级角色
 * @author hengxiaoliang
 */
public abstract class MidLevelRole extends RoleProperties {

    /**
     * 中级角色的生命值和攻击力是固定的，唯独角色名不同
     */
    public MidLevelRole(String name) {
        super(name, 6000, 2000);
    }
}
