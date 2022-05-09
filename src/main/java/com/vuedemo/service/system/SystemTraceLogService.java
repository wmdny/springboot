package com.vuedemo.service.system;

import com.vuedemo.core.model.PageData;
import com.vuedemo.core.model.PageWrap;
import com.vuedemo.dao.system.dto.QuerySystemTraceLogDTO;
import com.vuedemo.dao.system.model.SystemTraceLog;
import java.util.List;

/**
 * 跟踪日志Service定义
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
public interface SystemTraceLogService {

    /**
     * 创建
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    Integer create(SystemTraceLog systemTraceLog);

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
    void updateById(SystemTraceLog systemTraceLog);

    /**
     * 批量主键更新
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void updateByIdInBatch(List<SystemTraceLog> systemTraceLogs);

    /**
     * 主键查询
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    SystemTraceLog findById(Integer id);

    /**
     * 条件查询单条记录
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    SystemTraceLog findOne(SystemTraceLog systemTraceLog);

    /**
     * 条件查询
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    List<SystemTraceLog> findList(SystemTraceLog systemTraceLog);
  
    /**
     * 分页查询
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    PageData<SystemTraceLog> findPage(PageWrap<QuerySystemTraceLogDTO> pageWrap);

    /**
     * 条件统计
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    long count(SystemTraceLog systemTraceLog);
}
