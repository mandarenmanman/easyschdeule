/*
 * Copyright(C) 2010-2012 Alibaba Group Holding Limited
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License version 2 as
 *  published by the Free Software Foundation.
 *
 */
package com.taobao.ad.easyschedule.dataobject;

// Generated 2010-10-3 15:14:15 by Hibernate Tools 3.2.4.GA 

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.taobao.ad.easyschedule.base.PageInfo;

/**
 * UUserDO generated by hbm2java
 */
@Entity(name = "es_u_user")
public class UUserDO extends PageInfo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ID
	 */
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
//	 @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mseq")
//	 @SequenceGenerator(name="mseq",sequenceName="SEQ_es_U_USER",allocationSize=1)
	 private Long id;
	/**
	 * USERNAME
	 */
	@Column(name = "USERNAME")
	private String username;
	/**
	 * PASSWORD
	 */
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "email")
	private String email;
	
	@Column(name="mobile")
	private String mobile;
	
	/**
	 * STATUS
	 */
	@Column(name = "STATUS")
	private Long status;
	/**
	 * DESCN
	 */
	@Column(name = "DESCN")
	private String descn;
	/**
	 * CREATE_TIME
	 */
	@Column(name = "CREATE_TIME")
	private Date createTime;
	/**
	 * UPDATE_TIME
	 */
	@Column(name = "UPDATE_TIME")
	private Date updateTime;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public String getDescn() {
		return this.descn;
	}

	public void setDescn(String descn) {
		this.descn = descn;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public UUserDO() {
	}

	public int hashCode() {
		return this.hashCode();
	}

	public boolean equals(Object obj) {
		return this.equals(obj);
	}

}
