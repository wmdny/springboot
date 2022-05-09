package com.vuedemo.dao.system.dto;

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
@ApiModel("创建用户参数")
public class CreateSystemUserDTO extends SystemUser {

    @ApiModelProperty(value = "部门ID", example = "1")
    private Integer departmentId;
}
