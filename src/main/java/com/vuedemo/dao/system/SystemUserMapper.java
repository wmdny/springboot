package com.vuedemo.dao.system;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vuedemo.dao.system.dto.QuerySystemUserDTO;
import com.vuedemo.dao.system.model.SystemUser;
import com.vuedemo.dao.system.vo.SystemUserListVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemUserMapper extends BaseMapper<SystemUser> {

    /**
     * 查询用户列表
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    List<SystemUserListVO> selectManageList(@Param("dto") QuerySystemUserDTO dto, @Param("orderByClause") String orderByClause);

}
