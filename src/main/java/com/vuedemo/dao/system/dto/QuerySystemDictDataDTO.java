package com.vuedemo.dao.system.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
@Data
@ApiModel("查询字典数据列表参数")
public class QuerySystemDictDataDTO implements Serializable {

    @ApiModelProperty(value = "字典ID")
    private Integer dictId;
}
