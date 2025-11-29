package com.hxl.design.common.top;

/**
 * 角色属性: 英雄、生化体
 * @author hengxiaoliang
 */
public abstract class RoleProperties {

    /**
     * 角色名
     */
    private String name;

    /**
     * 生命值
     */
    private Integer healthPoints;

    /**
     * 攻击力
     */
    private Integer attackPower;

    public RoleProperties(String name, Integer healthPoints, Integer attackPower) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.attackPower = attackPower;
    }

    /**
     * 现身
     */
    public abstract void show();

    /**
     * 攻击
     */
    public abstract void attack();

    // =================== 只提供Get方法 ==============================
    public String getName() {
        return name;
    }

    public Integer getHealthPoints() {
        return healthPoints;
    }

    public Integer getAttackPower() {
        return attackPower;
    }
}
