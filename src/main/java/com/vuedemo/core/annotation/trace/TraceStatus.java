package com.vuedemo.core.annotation.trace;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 跟踪状态
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
@Getter
@AllArgsConstructor
public enum TraceStatus {
    SUCCESS((byte)1, "成功"),
    FAILED((byte)0, "失败"),
    ;

    private byte code;

    private String remark;
}
