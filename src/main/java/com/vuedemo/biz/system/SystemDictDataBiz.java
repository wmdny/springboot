package com.vuedemo.biz.system;

import com.vuedemo.dao.system.model.SystemDictData;

/**
 * 字典数据业务处理
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
public interface SystemDictDataBiz {

    /**
     * 新建
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    Integer create(SystemDictData systemDictData);

    /**
     * 编辑
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void updateById(SystemDictData systemDictData);
}
