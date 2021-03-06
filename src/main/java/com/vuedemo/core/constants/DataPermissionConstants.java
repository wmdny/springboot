package com.vuedemo.core.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 数据权限常量
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
public interface DataPermissionConstants {

    /**
     * 数据权限模块
     */
    @Getter
    @AllArgsConstructor
    enum Module {
        DEPARTMENT("DEPARTMENT", "部门管理"),
        ;
        private String businessCode;

        private String moduleName;

        public static List<Map<String, Object>> valueList () {
            List<Map<String, Object>> list = new ArrayList<>();
            for (Module module: Module.values()) {
                list.add(new HashMap<String, Object>(){{
                    this.put("businessCode", module.getBusinessCode());
                    this.put("moduleName", module.getModuleName());
                }});
            }
            return list;
        }
    }

    /**
     * 数据权限类型
     */
    @Getter
    @AllArgsConstructor
    enum Type {
        ALL((short)0,"全部", new Module[]{}),
        DEPARTMENT_CUSTOM((short)11, "自定义部门", new Module[]{Module.DEPARTMENT}),
        DEPARTMENT_CHILDREN((short)12, "所属部门及其子孙部门", new Module[]{Module.DEPARTMENT}),
        DEPARTMENT_CHILD((short)13, "所属部门及其子部门", new Module[]{Module.DEPARTMENT}),
        DEPARTMENT((short)14, "仅所属部门", new Module[]{Module.DEPARTMENT}),
        ;

        // 类型编码
        private short code;

        // 类型备注
        private String remark;

        // 所属模块，为空时表示所有模块可用
        private Module[] modules;

        public static List<Map<String, Object>> valueList () {
            List<Map<String, Object>> list = new ArrayList<>();
            for (Type type: Type.values()) {
                List<String> modules = new ArrayList<>();
                for (Module module : type.getModules()) {
                    modules.add(module.getBusinessCode());
                }
                list.add(new HashMap<String, Object>(){{
                    this.put("code", type.getCode());
                    this.put("remark", type.getRemark());
                    this.put("modules", modules);
                }});
            }
            return list;
        }
    }
}
