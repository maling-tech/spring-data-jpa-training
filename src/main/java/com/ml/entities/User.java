package com.ml.entities;

// Generated 2017-2-24 16:03:26 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "security")
public class User implements java.io.Serializable {

	private Long id;
	private String username;
	private String password;
	private int status;
	private String desc;
	private Set<UserRole> userRoles = new HashSet<UserRole>(0);

	public User() {
	}

	public User(String username, String password, int status, String desc) {
		this.username = username;
		this.password = password;
		this.status = status;
		this.desc = desc;
	}

	public User(String username, String password, int status, String desc,
			Set<UserRole> userRoles) {
		this.username = username;
		this.password = password;
		this.status = status;
		this.desc = desc;
		this.userRoles = userRoles;
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

	@Column(name = "username", nullable = false, length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false, length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "status", nullable = false)
	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Column(name = "desc", nullable = false, length = 200)
	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserRole> getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

}
