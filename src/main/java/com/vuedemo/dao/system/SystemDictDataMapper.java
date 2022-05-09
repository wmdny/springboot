package com.vuedemo.dao.system;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vuedemo.dao.system.dto.QuerySystemDictDataDTO;
import com.vuedemo.dao.system.model.SystemDictData;
import com.vuedemo.dao.system.vo.SystemDictDataListVO;

import java.util.List;

public interface SystemDictDataMapper extends BaseMapper<SystemDictData> {

    /**
     * 查询字典数据管理列表
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    List<SystemDictDataListVO> selectManageList(QuerySystemDictDataDTO dto);

}
