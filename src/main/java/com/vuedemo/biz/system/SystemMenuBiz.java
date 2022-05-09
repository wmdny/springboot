package com.vuedemo.biz.system;

import com.vuedemo.dao.system.dto.UpdateSystemMenuSortDTO;
import com.vuedemo.dao.system.model.SystemMenu;
import com.vuedemo.dao.system.vo.SystemMenuListVO;
import com.vuedemo.dao.system.vo.SystemMenuNodeVO;

import java.util.List;

/**
 * 系统菜单业务处理
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
public interface SystemMenuBiz {

    /**
     * 创建
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    Integer create(SystemMenu systemMenu);

    /**
     * 编辑
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void updateById(SystemMenu systemMenu);

    /**
     * 菜单排序
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void updateSort(UpdateSystemMenuSortDTO dto);

    /**
     * 查询菜单节点列表
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    List<SystemMenuNodeVO> findTree(Integer userId);

    /**
     * 查询菜单列表树
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    List<SystemMenuListVO> findTree();

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
