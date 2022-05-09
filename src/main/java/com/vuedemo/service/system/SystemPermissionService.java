package com.vuedemo.service.system;

import com.vuedemo.core.model.PageData;
import com.vuedemo.core.model.PageWrap;
import com.vuedemo.dao.system.dto.QuerySystemPermissionDTO;
import com.vuedemo.dao.system.model.SystemPermission;
import com.vuedemo.dao.system.vo.SystemPermissionListVO;

import java.util.List;

/**
 * 系统权限Service定义
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
public interface SystemPermissionService {

    /**
     * 创建
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    Integer create(SystemPermission systemPermission);

    /**
     * 主键删除
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void deleteById(Integer id);

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
    void updateById(SystemPermission systemPermission);

    /**
     * 批量主键更新
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void updateByIdInBatch(List<SystemPermission> systemPermissions);

    /**
     * 主键查询
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    SystemPermission findById(Integer id);

    /**
     * 根据用户ID查询
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    List<SystemPermission> findByUserId(Integer userId);

    /**
     * 根据角色ID查询
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    List<SystemPermission> findByRoleId(Integer roleId);

    /**
     * 条件查询单条记录
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    SystemPermission findOne(SystemPermission systemPermission);

    /**
     * 条件查询
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    List<SystemPermission> findList(SystemPermission systemPermission);
  
    /**
     * 分页查询
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    PageData<SystemPermissionListVO> findPage(PageWrap<QuerySystemPermissionDTO> pageWrap);

    /**
     * 条件统计
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    long count(SystemPermission systemPermission);
}
