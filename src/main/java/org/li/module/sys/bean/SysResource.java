package org.li.module.sys.bean;

import org.li.common.base.bean.BaseEntity;
import java.math.BigDecimal;
import java.sql.Timestamp;

import java.util.Date;


/**
 * 
 * @author liyanjun
 * @date 2017-4-12 10:27:36
 */
public class SysResource extends BaseEntity {

	private static final long serialVersionUID = 1L;


	/***/
	private Integer id;

	/***/
	private String name;

	/***/
	private Integer pid;

	/***/
	private String url;

	/***/
	private String tag;

	/**1-功能 0-菜单*/
	private Integer resType;

	/**资源码*/
	private String resCode;

	/***/
	private Timestamp insertDate;

	/***/
	private Timestamp updateDate;

	/***/
	private String remark;

	/***/
	private String navtabId;

	/**扩展方式，0-ture，1-false*/
	private Boolean external;

	public SysResource(){
	}

	public SysResource(Integer id){
		this.id = id;
	}

	public void setId(Integer value) {
		this.id = value;
	}

	public Integer getId() {
		return this.id;
	}
	public void setName(String value) {
		this.name = value;
	}

	public String getName() {
		return this.name;
	}
	public void setPid(Integer value) {
		this.pid = value;
	}

	public Integer getPid() {
		return this.pid;
	}
	public void setUrl(String value) {
		this.url = value;
	}

	public String getUrl() {
		return this.url;
	}
	public void setTag(String value) {
		this.tag = value;
	}

	public String getTag() {
		return this.tag;
	}
	public void setResType(Integer value) {
		this.resType = value;
	}

	public Integer getResType() {
		return this.resType;
	}
	public void setResCode(String value) {
		this.resCode = value;
	}

	public String getResCode() {
		return this.resCode;
	}

	public void setInsertDate(Timestamp value) {
		this.insertDate = value;
	}

	public Timestamp getInsertDate() {
		return this.insertDate;
	}

	public void setUpdateDate(Timestamp value) {
		this.updateDate = value;
	}

	public Timestamp getUpdateDate() {
		return this.updateDate;
	}
	public void setRemark(String value) {
		this.remark = value;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setNavtabId(String value) {
		this.navtabId = value;
	}

	public String getNavtabId() {
		return this.navtabId;
	}
	public void setExternal(Boolean value) {
		this.external = value;
	}

	public Boolean getExternal() {
		return this.external;
	}



}

