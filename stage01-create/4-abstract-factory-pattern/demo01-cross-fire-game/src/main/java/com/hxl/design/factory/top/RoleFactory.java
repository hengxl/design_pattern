package com.hxl.design.factory.top;

import com.hxl.design.common.HighLevelRole;
import com.hxl.design.common.LowLevelRole;
import com.hxl.design.common.MidLevelRole;

/**
 * 生产角色的工厂
 *
 * @author hengxiaoliang
 */
public interface RoleFactory {

    // 初级角色
    LowLevelRole createLowRole();

    // 中级角色
    MidLevelRole createMidRole();

    // 高级角色
    HighLevelRole createHighRole();
}
