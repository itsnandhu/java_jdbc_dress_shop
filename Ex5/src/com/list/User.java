package com.list;

public class User {
	private String u_name,pwd;

	public User(String u_name, String pwd) {
		this.u_name = u_name;
		this.pwd = pwd;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "User [u_name=" + u_name + ", pwd=" + pwd + "]";
	}
	
}
