package com.example.demo.util;

public class DBUtil {
	
	private String url;
	private String user;
	private String pwd;

	public DBUtil(String url, String user, String pwd) {
		super();
		this.url = url;
		this.user = user;
		this.pwd = pwd;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
