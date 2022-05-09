package com.vuedemo.biz.system;

import com.vuedemo.dao.system.model.SystemDepartment;
import com.vuedemo.dao.system.vo.SystemDepartmentListVO;

import java.util.List;

/**
 * 部门管理业务处理
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
public interface SystemDepartmentBiz {

    /**
     * 新建
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    Integer create(SystemDepartment department);

    /**
     * 编辑
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void updateById(SystemDepartment department);

    /**
     * 查询部门列表树
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    List<SystemDepartmentListVO> findTree();

    /**
     * 删除
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void deleteById(Integer id);

    /**
     * 批量删除
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void deleteByIdInBatch(List<Integer> ids);
}
