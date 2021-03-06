package com.vuedemo.dao.system.model;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.vuedemo.core.constants.OperaType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * 系统菜单
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
@Data
@ApiModel("系统菜单")
public class SystemMenu implements Serializable {

    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "主键", example = "1")
    @NotNull(message = "主键不能为空", groups = {OperaType.Update.class, OperaType.UpdateStatus.class})
    private Integer id;

    @ApiModelProperty(value = "上一级菜单", example = "1")
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private Integer parentId;

    @ApiModelProperty(value = "菜单名称")
    @NotBlank(message = "菜单名称不能为空", groups = {OperaType.Create.class, OperaType.Update.class})
    private String name;

    @ApiModelProperty(value = "菜单访问路径")
    private String path;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "图标")
    private String icon;

    @ApiModelProperty(value = "是否禁用")
    @NotNull(message = "是否禁用不能为空", groups = OperaType.UpdateStatus.class)
    private Boolean disabled;

    @ApiModelProperty(value = "排序", example = "1")
    private Integer sort;

    @ApiModelProperty(value = "是否为固定菜单", hidden = true)
    private Boolean fixed;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "创建者ID", example = "1", hidden = true)
    private Integer createUser;

    @ApiModelProperty(value = "更新者ID", example = "1", hidden = true)
    private Integer updateUser;

    @ApiModelProperty(value = "是否已删除", hidden = true)
    private Boolean deleted;

}
