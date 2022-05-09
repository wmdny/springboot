package com.vuedemo.core.annotation.excel;

/**
 * Excel数据格式处理适配器
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
public interface ExcelDataHandlerAdapter {

    /**
     * 格式化
     * @param args 参数集合，第一个参数为单元格数据
     *
     * @return String
     */
    Object format (Object... args);
}
