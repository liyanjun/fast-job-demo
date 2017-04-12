
package org.li.common.base.bean.vo;

public class BaseConditionVO {

    public final static int PAGE_SHOW_COUNT = 15;
    private int pageNum = 1;
    private int pageSize = 0;
    private int totalCount = 0;
    private String orderField;
    private String orderDirection;
    private String targetType;
    private int pageCount;

    public int getPageCount() {

	return pageCount;
    }

    public void setPageCount(int pageCount) {

	this.pageCount = pageCount;
    }

    public String getTargetType() {

	return targetType;
    }

    public void setTargetType(String targetType) {

	this.targetType = targetType;
    }

    public int getPageNum() {

	return pageNum;
    }

    public void setPageNum(int pageNum) {

	this.pageNum = pageNum;
    }

    public int getPageSize() {

	return pageSize>0 ? pageSize : PAGE_SHOW_COUNT;
    }

    public void setPageSize(int pageSize) {

	this.pageSize = pageSize;
    }

    public String getOrderField() {

	return orderField;
    }

    public void setOrderField(String orderField) {

	this.orderField = orderField;
    }

    public String getOrderDirection() {

	return orderDirection==null ? "desc" : orderDirection;
    }

    public void setOrderDirection(String orderDirection) {

	this.orderDirection = orderDirection;
    }

    public int getTotalCount() {

	return totalCount;
    }

    public void setTotalCount(int totalCount) {

	this.totalCount = totalCount;
	int a = totalCount/getPageSize();
	int b = totalCount%getPageSize();
	if (b>0)
	    a++;
	setPageCount(a);// 计算页数
    }

    public int getStartIndex() {

	int pageNum = this.getPageNum()>0 ? this.getPageNum()-1 : 0;
	return pageNum*this.getPageSize();
    }

    @Override
    public String toString() {

	return "BaseConditionVO [pageNum="+pageNum+", pageSize="+pageSize+", totalCount="
		+totalCount+", orderField="+orderField+", orderDirection="+orderDirection+"]";
    }

}
