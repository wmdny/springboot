package com.vuedemo.dao.system.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
@Data
@ApiModel("修改密码参数")
public class UpdatePwdDto implements Serializable {

    @ApiModelProperty(value = "用户ID", hidden = true)
    private Integer userId;

    @NotBlank(message = "原始密码不能为空")
    @ApiModelProperty(value = "原始密码")
    private String oldPwd;

    @NotBlank(message = "新密码不能为空")
    @ApiModelProperty(value = "新密码")
    private String newPwd;
}
