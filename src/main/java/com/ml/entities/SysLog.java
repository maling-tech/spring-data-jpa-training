package com.ml.entities;

// Generated 2017-2-23 18:06:43 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * SysLog generated by hbm2java
 */
@Entity
@Table(name = "sys_log", catalog = "shiro")
public class SysLog implements java.io.Serializable {

	private Long id;
	private String loginName;
	private String roleName;
	private String optContent;
	private String clientIp;
	private Date createTime;

	public SysLog() {
	}

	public SysLog(Date createTime) {
		this.createTime = createTime;
	}

	public SysLog(String loginName, String roleName, String optContent,
			String clientIp, Date createTime) {
		this.loginName = loginName;
		this.roleName = roleName;
		this.optContent = optContent;
		this.clientIp = clientIp;
		this.createTime = createTime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "login_name")
	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	@Column(name = "role_name")
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Column(name = "opt_content", length = 1024)
	public String getOptContent() {
		return this.optContent;
	}

	public void setOptContent(String optContent) {
		this.optContent = optContent;
	}

	@Column(name = "client_ip")
	public String getClientIp() {
		return this.clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", nullable = false, length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}