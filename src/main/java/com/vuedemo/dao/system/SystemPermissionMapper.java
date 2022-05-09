package com.vuedemo.dao.system;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vuedemo.dao.system.dto.QuerySystemPermissionDTO;
import com.vuedemo.dao.system.model.SystemPermission;
import com.vuedemo.dao.system.vo.SystemPermissionListVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemPermissionMapper extends BaseMapper<SystemPermission> {

    /**
     * 根据用户ID查询
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    List<SystemPermission> selectByUserId(Integer userId);

    /**
     * 根据角色ID查询
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    List<SystemPermission> selectByRoleId(Integer roleId);

    /**
     * 查询列表
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    List<SystemPermissionListVO> selectManageList(@Param("dto") QuerySystemPermissionDTO dto, @Param("orderByClause") String orderByClause);

}
