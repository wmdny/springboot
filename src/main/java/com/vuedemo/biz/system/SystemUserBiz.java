package com.vuedemo.biz.system;

import com.vuedemo.dao.system.dto.CreateSystemUserDTO;
import com.vuedemo.dao.system.dto.CreateUserRoleDTO;
import com.vuedemo.dao.system.dto.ResetSystemUserPwdDTO;
import com.vuedemo.dao.system.dto.UpdatePwdDto;

import java.util.List;

/**
 * 系统用户业务处理
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
public interface SystemUserBiz {

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

    /**
     * 修改密码
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void updatePwd(UpdatePwdDto dto);

    /**
     * 重置密码
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void resetPwd(ResetSystemUserPwdDTO dto);

    /**
     * 创建用户
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void create(CreateSystemUserDTO systemUser);

    /**
     * 修改用户信息
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void updateById(CreateSystemUserDTO systemUser);

    /**
     * 创建用户角色
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    void createUserRole(CreateUserRoleDTO dto);
}
