package com.vuedemo.core.aware;

import com.vuedemo.core.constants.DataPermissionConstants;

import java.util.List;

/**
 * 数据权限意识
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
public interface DataPermissionAware<T> {

    /**
     * 默认数据（当用户未配置相关数据权限时获取该数据）
     *
     * @param userId 用户ID
     * @return List<T>
     */
    List<T> defaultData(Integer userId);

    /**
     * 获取模块对象
     *
     * @return DataPermissionConstants.Module
     */
    DataPermissionConstants.Module module();
}
