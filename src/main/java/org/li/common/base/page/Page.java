package org.li.common.base.page;

import java.util.List;

/**
 * 返回分页页面信息
 */
public class Page<T> {
    private Integer total;
    private List<T> rows;

    public Page(Integer total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
