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
public class SysPermission extends BaseEntity {

	private static final long serialVersionUID = 1L;

	/***/
	private Integer roleId;

	/***/
	private Integer resourceId;

	public SysPermission(){
	}

	public SysPermission(Integer roleId,Integer resourceId){
		this.roleId = roleId;
		this.resourceId = resourceId;
	}

	public void setRoleId(Integer value) {
		this.roleId = value;
	}

	public Integer getRoleId() {
		return this.roleId;
	}
	public void setResourceId(Integer value) {
		this.resourceId = value;
	}

	public Integer getResourceId() {
		return this.resourceId;
	}



}

