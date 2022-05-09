package com.vuedemo.api.system;

import com.vuedemo.api.BaseController;
import com.vuedemo.core.annotation.excel.ExcelExporter;
import com.vuedemo.core.model.ApiResponse;
import com.vuedemo.core.model.PageData;
import com.vuedemo.core.model.PageWrap;
import com.vuedemo.dao.system.dto.QuerySystemTraceLogDTO;
import com.vuedemo.dao.system.model.SystemTraceLog;
import com.vuedemo.service.system.SystemTraceLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
@Api(tags = "跟踪日志")
@RestController
@RequestMapping("/system/traceLog")
public class SystemTraceLogController extends BaseController {

    @Autowired
    private SystemTraceLogService systemTraceLogService;

    @ApiOperation("分页查询")
    @PostMapping("/page")
    @RequiresPermissions("system:traceLog:query")
    public ApiResponse findPage (@RequestBody PageWrap<QuerySystemTraceLogDTO> pageWrap) {
        return ApiResponse.success(systemTraceLogService.findPage(pageWrap));
    }

    @ApiOperation("导出Excel")
    @PostMapping("/exportExcel")
    @RequiresPermissions("system:traceLog:query")
    public void exportExcel (@RequestBody PageWrap<QuerySystemTraceLogDTO> pageWrap, HttpServletResponse response) {
        ExcelExporter.build(SystemTraceLog.class).export(systemTraceLogService.findPage(pageWrap).getRecords(), "操作日志", response);
    }
}
