package com.vuedemo.dao.system.vo;

import com.vuedemo.dao.system.model.SystemMenu;
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
@ApiModel("菜单列表视图对象")
public class SystemMenuListVO extends SystemMenu {

    @ApiModelProperty(value = "子菜单列表")
    private List<SystemMenuListVO> children;

    @ApiModelProperty(value = "是否包含子菜单")
    private Boolean hasChildren;

    @ApiModelProperty(value = "创建人信息")
    private SystemUser createUserInfo;

    @ApiModelProperty(value = "更新人信息")
    private SystemUser updateUserInfo;
}
