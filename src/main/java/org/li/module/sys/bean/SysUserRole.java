package org.li.module.sys.bean;

import org.li.common.base.bean.BaseEntity;
import java.math.BigDecimal;
import java.sql.Timestamp;

import java.util.Date;


/**
 * 
 * @author liyanjun
 * @date 2017-4-12 10:27:37
 */
public class SysUserRole extends BaseEntity {

	private static final long serialVersionUID = 1L;


	/***/
	private Integer userId;

	/***/
	private Integer roleId;

	public SysUserRole(){
	}

	public SysUserRole(Integer userId,Integer roleId){
		this.userId = userId;
		this.roleId = roleId;
	}

	public void setUserId(Integer value) {
		this.userId = value;
	}

	public Integer getUserId() {
		return this.userId;
	}
	public void setRoleId(Integer value) {
		this.roleId = value;
	}

	public Integer getRoleId() {
		return this.roleId;
	}



}

