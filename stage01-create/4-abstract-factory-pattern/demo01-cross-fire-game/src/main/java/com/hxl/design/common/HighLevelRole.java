package com.hxl.design.common;

import com.hxl.design.common.top.RoleProperties;

/**
 * 高级角色
 * @author hengxiaoliang
 */
public abstract class HighLevelRole extends RoleProperties {

    /**
     * 高级角色的生命值和攻击力是固定的，唯独角色名不同
     */
    public HighLevelRole(String name) {
        super(name, 9000, 3000);
    }
}
