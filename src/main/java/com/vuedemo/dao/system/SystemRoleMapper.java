package com.vuedemo.dao.system;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vuedemo.dao.system.dto.QuerySystemRoleDTO;
import com.vuedemo.dao.system.model.SystemRole;
import com.vuedemo.dao.system.vo.SystemRoleListVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemRoleMapper extends BaseMapper<SystemRole> {

    /**
     * 查询角色列表
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    List<SystemRoleListVO> selectManageList(@Param("dto") QuerySystemRoleDTO dto, @Param("orderByClause") String orderByClause);

    /**
     * 根据用户ID查询
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    List<SystemRole> selectByUserId(Integer userId);

}
