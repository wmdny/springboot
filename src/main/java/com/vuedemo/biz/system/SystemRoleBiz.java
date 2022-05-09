package com.vuedemo.biz.system;

import com.vuedemo.dao.system.dto.CreateRoleMenuDTO;
import com.vuedemo.dao.system.dto.CreateRolePermissionDTO;
import com.vuedemo.dao.system.model.SystemRole;

import java.util.List;

/**
 * 角色权限业务处理
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
public interface SystemRoleBiz {

    /**
     * 新建
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    Integer create (SystemRole systemRole);

    /**
     * 修改
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void updateById(SystemRole systemRole);

    /**
     * 删除
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void deleteById(Integer id);

    /**
     * 批量删除
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void deleteByIdInBatch(List<Integer> ids);

    /**
     * 创建角色权限
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void createRolePermission(CreateRolePermissionDTO dto);

    /**
     * 创建角色菜单
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void createRoleMenu(CreateRoleMenuDTO dto);
}
