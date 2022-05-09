package com.vuedemo.dao.system;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vuedemo.dao.system.dto.QuerySystemDepartmentDTO;
import com.vuedemo.dao.system.model.SystemDepartment;
import com.vuedemo.dao.system.vo.SystemDepartmentListVO;

import java.util.List;

public interface SystemDepartmentMapper extends BaseMapper<SystemDepartment> {

    /**
     * 查询部门
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    List<SystemDepartmentListVO> selectManageList(QuerySystemDepartmentDTO dto);
}
