package com.vuedemo.dao.system.dto;

import com.vuedemo.dao.system.model.SystemTraceLog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 跟踪日志查询
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
@Data
@ApiModel("查询跟踪日志参数")
public class QuerySystemTraceLogDTO extends SystemTraceLog {

    @ApiModelProperty("操作开始时间")
    private Date startTime;

    @ApiModelProperty("操作结束时间")
    private Date endTime;
}
