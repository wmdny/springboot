package com.vuedemo.service.system;

import com.vuedemo.core.model.PageData;
import com.vuedemo.core.model.PageWrap;
import com.vuedemo.dao.system.dto.QuerySystemDictDataDTO;
import com.vuedemo.dao.system.model.SystemDictData;
import com.vuedemo.dao.system.vo.SystemDictDataListVO;

import java.util.List;

/**
 * 字典数据Service定义
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
public interface SystemDictDataService {

    /**
     * 创建
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    Integer create(SystemDictData systemDictData);

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
    void updateById(SystemDictData systemDictData);

    /**
     * 批量主键更新
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void updateByIdInBatch(List<SystemDictData> systemDictDatas);

    /**
     * 主键查询
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    SystemDictData findById(Integer id);

    /**
     * 条件查询单条记录
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    SystemDictData findOne(SystemDictData systemDictData);

    /**
     * 条件查询
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    List<SystemDictData> findList(SystemDictData systemDictData);
  
    /**
     * 分页查询
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    PageData<SystemDictDataListVO> findPage(PageWrap<QuerySystemDictDataDTO> pageWrap);

    /**
     * 条件统计
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    long count(SystemDictData systemDictData);
}
