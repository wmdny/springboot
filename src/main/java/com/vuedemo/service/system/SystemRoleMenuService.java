package com.vuedemo.service.system;

import com.vuedemo.core.model.PageData;
import com.vuedemo.core.model.PageWrap;
import com.vuedemo.dao.system.model.SystemRoleMenu;
import java.util.List;

/**
 * 角色菜单关联Service定义
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
public interface SystemRoleMenuService {

    /**
     * 创建
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    Integer create(SystemRoleMenu systemRoleMenu);

    /**
     * 主键删除
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void deleteById(Integer id);

    /**
     * 删除
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void delete(SystemRoleMenu systemRoleMenu);

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
    void updateById(SystemRoleMenu systemRoleMenu);

    /**
     * 批量主键更新
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void updateByIdInBatch(List<SystemRoleMenu> systemRoleMenus);

    /**
     * 主键查询
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    SystemRoleMenu findById(Integer id);

    /**
     * 条件查询单条记录
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    SystemRoleMenu findOne(SystemRoleMenu systemRoleMenu);

    /**
     * 条件查询
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    List<SystemRoleMenu> findList(SystemRoleMenu systemRoleMenu);
  
    /**
     * 分页查询
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    PageData<SystemRoleMenu> findPage(PageWrap<SystemRoleMenu> pageWrap);

    /**
     * 条件统计
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    long count(SystemRoleMenu systemRoleMenu);
}
