package com.vw.fakultaet73.Account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Chris Frömling
 * @author René Körner
 * AccountEntity
 */
@Entity
public class Account {
	
	@Id
	@Column
	private String fin;
	@Column
	private String password;
	
	public Account(String fin, String password) {
		super();
		this.fin = fin;
		this.password = password;
	}

	public Account() {
		super();
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
