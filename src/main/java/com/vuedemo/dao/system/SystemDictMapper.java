package com.vuedemo.dao.system;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vuedemo.dao.system.dto.QuerySystemDictDTO;
import com.vuedemo.dao.system.model.SystemDict;
import com.vuedemo.dao.system.vo.SystemDictListVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemDictMapper extends BaseMapper<SystemDict> {

    /**
     * 查询字典管理列表
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    List<SystemDictListVO> selectManageList(@Param("dto") QuerySystemDictDTO dto, @Param("orderByClause") String orderByClause);
}
