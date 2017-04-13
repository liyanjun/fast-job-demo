//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.li.common.base.page;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PagerControl<T> implements Serializable {
    private List<T> rows = new ArrayList<T>();
    private PageInfo pageInfo;
    private Integer draw;
    private Integer total;

    public PagerControl() {
    }

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }



    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<T> getRows() {
        return this.rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String toString() {
        return "PagerControl [rows=" + this.rows + ", pageInfo=" + this.pageInfo + "]";
    }
}
