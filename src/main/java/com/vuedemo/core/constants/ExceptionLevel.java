package com.vuedemo.core.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 异常等级
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
@Getter
@AllArgsConstructor
public enum ExceptionLevel {
    DANGER((byte)10, "高"),
    WARN((byte)5, "中"),
    LOW((byte)0, "低"),
    ;

    private byte level;

    private String remark;
}
