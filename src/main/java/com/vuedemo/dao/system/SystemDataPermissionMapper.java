package com.vuedemo.dao.system;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vuedemo.dao.system.model.SystemDataPermission;
import com.vuedemo.dao.system.vo.SystemDataPermissionListVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
public interface SystemDataPermissionMapper extends BaseMapper<SystemDataPermission> {

    /**
     * 查询数据权限管理列表
     * @param dto 查询条件
     * @param orderByClause 排序SQL
     *
     * @return List<SystemDataPermissionListVO>
     */
    List<SystemDataPermissionListVO> selectManageList(@Param("dto") SystemDataPermission dto, @Param("orderByClause") String orderByClause);
}
