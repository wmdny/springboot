package com.vuedemo.dao.system.dto;

import com.vuedemo.dao.system.model.SystemLoginLog;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 查询登录日志参数
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
@Data
public class QuerySystemLoginLogDTO extends SystemLoginLog {

    @ApiModelProperty("登录开始时间")
    private Date startTime;

    @ApiModelProperty("登录结束时间")
    private Date endTime;
}
