package com.vuedemo.biz.system;

import com.vuedemo.dao.system.model.SystemDict;

/**
 * 字典业务处理
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
public interface SystemDictBiz {

    /**
     * 创建
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    Integer create(SystemDict systemDict);

    /**
     * 编辑
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void updateById(SystemDict systemDict);

}
