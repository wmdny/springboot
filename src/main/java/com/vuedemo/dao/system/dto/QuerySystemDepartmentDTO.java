package com.vuedemo.dao.system.dto;

import lombok.Data;

import java.util.List;

/**
 * 查询系统部门参数
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
@Data
public class QuerySystemDepartmentDTO {

    private Integer id;

    private List<Integer> ids;
}
