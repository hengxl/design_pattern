package com.hxl.design.common;

import com.hxl.design.common.top.RoleProperties;

/**
 * 初级角色
 * @author hengxiaoliang
 */
public abstract class LowLevelRole extends RoleProperties {

    /**
     * 初级角色的生命值和攻击力是固定的，唯独角色名不同
     */
    public LowLevelRole(String name) {
        super(name, 3000, 1000);
    }
}
