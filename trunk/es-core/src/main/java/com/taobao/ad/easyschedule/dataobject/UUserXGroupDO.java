/*
 * Copyright(C) 2010-2012 Alibaba Group Holding Limited
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License version 2 as
 *  published by the Free Software Foundation.
 *
 */
package com.taobao.ad.easyschedule.dataobject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.taobao.ad.easyschedule.base.PageInfo;

/**
 * UUserDO generated by hbm2java
 */
@Entity(name = "es_u_user_group")
@IdClass(UUserXGroupKey.class)
public class UUserXGroupDO extends PageInfo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * userId
	 */
	@Id
	private Long userId;

	/**
	 * groupId
	 */
	@Id
	private Long groupId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	public UUserXGroupDO(){}
	public int hashCode() {
		return this.hashCode();
	}

	public boolean equals(Object obj) {
		return this.equals(obj);
	}

}

@Embeddable
class UUserXGroupKey implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "USER_ID")
	private Long userId;
	@Column(name = "GROUP_ID")
	private Long groupId;

	public UUserXGroupKey(){}
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	@Override
	public int hashCode() {
		return this.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return this.equals(obj);
	}
}
