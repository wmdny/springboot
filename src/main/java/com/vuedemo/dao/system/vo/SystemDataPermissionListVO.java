package com.vuedemo.dao.system.vo;

import com.vuedemo.dao.system.model.SystemDataPermission;
import com.vuedemo.dao.system.model.SystemRole;
import com.vuedemo.dao.system.model.SystemUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
@Data
@ApiModel("数据权限列表视图对象")
public class SystemDataPermissionListVO extends SystemDataPermission {

    @ApiModelProperty(value = "角色")
    private SystemRole role;

    @ApiModelProperty(value = "创建人信息")
    private SystemUser createUserInfo;

    @ApiModelProperty(value = "更新人信息")
    private SystemUser updateUserInfo;
}
