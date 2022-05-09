package com.vuedemo.service.system;

import com.vuedemo.core.model.PageData;
import com.vuedemo.core.model.PageWrap;
import com.vuedemo.dao.system.model.SystemRolePermission;
import java.util.List;

/**
 * 角色权限关联Service定义
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
public interface SystemRolePermissionService {

    /**
     * 创建
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    Integer create(SystemRolePermission systemRolePermission);

    /**
     * 主键删除
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void deleteById(Integer id);

    /**
     * 删除
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void delete(SystemRolePermission systemRolePermission);

    /**
     * 批量主键删除
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void deleteByIdInBatch(List<Integer> ids);

    /**
     * 主键更新
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void updateById(SystemRolePermission systemRolePermission);

    /**
     * 批量主键更新
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void updateByIdInBatch(List<SystemRolePermission> systemRolePermissions);

    /**
     * 主键查询
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    SystemRolePermission findById(Integer id);

    /**
     * 条件查询单条记录
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    SystemRolePermission findOne(SystemRolePermission systemRolePermission);

    /**
     * 条件查询
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    List<SystemRolePermission> findList(SystemRolePermission systemRolePermission);
  
    /**
     * 分页查询
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    PageData<SystemRolePermission> findPage(PageWrap<SystemRolePermission> pageWrap);

    /**
     * 条件统计
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    long count(SystemRolePermission systemRolePermission);
}
