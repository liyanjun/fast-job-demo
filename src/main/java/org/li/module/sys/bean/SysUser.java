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
public class SysUser extends BaseEntity {

	private static final long serialVersionUID = 1L;


	/***/
	private Integer id;

	/**0-女 1-男*/
	private Boolean sex;

	/***/
	private String realname;

	/***/
	private String username;

	/***/
	private String password;

	/***/
	private String nickname;

	/***/
	private String dep;

	/***/
	private String position;

	/***/
	private String email;

	/***/
	private String phone;

	/**0-启用 1-停用 2-删除*/
	private Integer status;

	/***/
	private Timestamp birthDate;

	/***/
	private Timestamp insertDate;

	/***/
	private Timestamp updateDate;

	public SysUser(){
	}

	public SysUser(Integer id){
		this.id = id;
	}

	public void setId(Integer value) {
		this.id = value;
	}

	public Integer getId() {
		return this.id;
	}
	public void setSex(Boolean value) {
		this.sex = value;
	}

	public Boolean getSex() {
		return this.sex;
	}
	public void setRealname(String value) {
		this.realname = value;
	}

	public String getRealname() {
		return this.realname;
	}
	public void setUsername(String value) {
		this.username = value;
	}

	public String getUsername() {
		return this.username;
	}
	public void setPassword(String value) {
		this.password = value;
	}

	public String getPassword() {
		return this.password;
	}
	public void setNickname(String value) {
		this.nickname = value;
	}

	public String getNickname() {
		return this.nickname;
	}
	public void setDep(String value) {
		this.dep = value;
	}

	public String getDep() {
		return this.dep;
	}
	public void setPosition(String value) {
		this.position = value;
	}

	public String getPosition() {
		return this.position;
	}
	public void setEmail(String value) {
		this.email = value;
	}

	public String getEmail() {
		return this.email;
	}
	public void setPhone(String value) {
		this.phone = value;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setStatus(Integer value) {
		this.status = value;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setBirthDate(Timestamp value) {
		this.birthDate = value;
	}

	public Timestamp getBirthDate() {
		return this.birthDate;
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

