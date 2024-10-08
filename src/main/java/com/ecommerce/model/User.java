package com.ecommerce.model;

public class User {
	private Integer code;
	private String name;
	private String username;
	private String email;
	private String direction;
	private String cellphone;
	private String type;
	private String password;
	
	public User() {
	}
	
	public User(Integer code, String name, String username, String email, String direction, String cellphone,
			String type, String password) {
		this.code = code;
		this.name = name;
		this.username = username;
		this.email = email;
		this.direction = direction;
		this.cellphone = cellphone;
		this.type = type;
		this.password = password;
	}

	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [code=" + code + ", name=" + name + ", username=" + username + ", email=" + email + ", direction="
				+ direction + ", cellphone=" + cellphone + ", type=" + type + ", password=" + password + "]";
	}
}
