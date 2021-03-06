package com.vuedemo.core.model;

import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 分页请求参数
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
@Data
@ApiModel("分页请求参数")
public class PageWrap<M> implements Serializable {

    // 降序
    public static final String DESC = "DESC";

    // 升序
    public static final String ASC = "ASC";

    @ApiModelProperty("条件参数")
    private M model;

    @ApiModelProperty("目标页")
    private int page;

    @ApiModelProperty("一页多少行")
    private int capacity;

    @ApiModelProperty("排序参数")
    private List<SortData> sorts;

    /**
     * 处理异常排序对象
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    public List<SortData> getSorts () {
        List<SortData> sorts = new ArrayList<>();
        if (this.sorts == null) {
            return sorts;
        }
        for (SortData sort: this.sorts) {
            if (sort.getProperty() == null || sort.getProperty().trim().length() == 0) {
                continue;
            }
            if (sort.getDirection() == null || sort.getDirection().trim().length() == 0 || (!sort.getDirection().trim().equalsIgnoreCase("asc") && !sort.getDirection().trim().equalsIgnoreCase("desc"))) {
                continue;
            }
            sorts.add(sort);
        }
        return sorts;
    }

    /**
     * 处理异常页码
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    public int getPage () {
        return page <= 0 ? 1 : page;
    }

    /**
     * 处理异常页容量
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    public int getCapacity () {
        return capacity <= 0 ? 10 : capacity;
    }

    /**
     * 获取排序字符串
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    @ApiModelProperty(hidden = true)
    public String getOrderByClause () {
        List<SortData> sorts = this.getSorts();
        StringBuilder stringBuilder = new StringBuilder();
        for (SortData sortData: sorts) {
            // 防注入
            if (!sortData.getProperty().matches("[a-zA-Z0-9_\\.]+")) {
                continue;
            }
            stringBuilder.append(sortData.getProperty().trim());
            stringBuilder.append(" ");
            stringBuilder.append(sortData.getDirection().trim());
            stringBuilder.append(",");
        }
        if (stringBuilder.length() == 0) {
            return null;
        }
        return "ORDER BY " + stringBuilder.substring(0, stringBuilder.length() - 1);
    }

    /**
     * 排序对象
     * @author Eva.Caesar Liu
     * @date 2022/05/09 11:26
     */
    @Data
    @ApiModel("排序对象")
    public static class SortData {

        @ApiModelProperty("排序字段")
        private String property;

        @ApiModelProperty("排序方向（ASC：升序，DESC：降序）")
        private String direction;
    }
}
