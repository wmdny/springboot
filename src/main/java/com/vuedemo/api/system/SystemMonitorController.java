package com.vuedemo.api.system;

import com.vuedemo.api.BaseController;
import com.vuedemo.core.annotation.trace.Trace;
import com.vuedemo.core.model.ApiResponse;
import com.vuedemo.core.utils.Monitor;
import com.vuedemo.core.utils.Utils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
@Api(tags = "系统监听")
@Trace(exclude = true)
@RestController
@RequestMapping("/system/monitor")
public class SystemMonitorController extends BaseController {

    @ApiOperation("获取系统信息")
    @GetMapping("/getSystemInfo")
    @RequiresPermissions("system:monitor:query")
    public ApiResponse<Monitor> getSystemInfo () {
        return ApiResponse.success(Utils.Monitor.current());
    }
}
