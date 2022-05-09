package com.vuedemo.dao.system.vo;

import com.vuedemo.dao.system.model.SystemDepartment;
import com.vuedemo.dao.system.model.SystemRole;
import com.vuedemo.dao.system.model.SystemUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
@Data
@ApiModel("系统用户列表视图对象")
public class SystemUserListVO extends SystemUser {

    @ApiModelProperty(value = "角色")
    private List<SystemRole> roles;

    @ApiModelProperty(value = "部门信息")
    private SystemDepartment department;

    @ApiModelProperty(value = "创建人信息")
    private SystemUser createUserInfo;

    @ApiModelProperty(value = "更新人信息")
    private SystemUser updateUserInfo;

}
