package org.li.module.sys.bean;

import org.li.common.base.bean.BaseEntity;
import java.sql.Timestamp;

/**
 * 
 * @author liyanjun
 * @date 2017-4-12 10:27:36
 */
public class SysRole extends BaseEntity {

	private static final long serialVersionUID = 1L;


	/***/
	private Integer id;

	/***/
	private String rolename;

	/***/
	private String remark;

	/**1-可用 0-不可用*/
	private Integer status;

	/***/
	private Timestamp insertDate;

	/***/
	private Timestamp updateDate;

	public SysRole(){
	}

	public SysRole(Integer id){
		this.id = id;
	}

	public void setId(Integer value) {
		this.id = value;
	}

	public Integer getId() {
		return this.id;
	}
	public void setRolename(String value) {
		this.rolename = value;
	}

	public String getRolename() {
		return this.rolename;
	}
	public void setRemark(String value) {
		this.remark = value;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setStatus(Integer value) {
		this.status = value;
	}

	public Integer getStatus() {
		return this.status;
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



}

