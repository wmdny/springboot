package com.vuedemo.biz.system;

import com.vuedemo.dao.system.model.SystemDataPermission;

/**
 * 系统数据权限业务处理
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
public interface SystemDataPermissionBiz {

    /**
     * 创建
     * @param systemDataPermission 数据权限对象
     *
     * @return Integer
     */
    Integer create(SystemDataPermission systemDataPermission);

    /**
     * 修改
     * @param systemDataPermission 数据权限对象
     */
    void update(SystemDataPermission systemDataPermission);

    /**
     * 修改状态
     * @param systemDataPermission 数据权限对象
     */
    void updateStatus (SystemDataPermission systemDataPermission);
}
