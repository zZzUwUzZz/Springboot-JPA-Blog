package com.cos.blog.test;

public class Member {
	private int id;
	private String username;
	private String password;
	private String email;
 
	public Member(Builder builder) {
 		this.id = builder.id;
		this.username = builder.username;
		this.password = builder.password;
		this.email = builder.email;
	}
 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
	public static class Builder {
		int id;
		String username;
		String password;
		String email;
		
		public Builder id(int id) {
			this.id = id;
			return this;
		}
		
		public Builder username(String username) {
			this.username = username;
			return this;
		}
		
		public Builder password(String password) {
			this.password = password;
			return this;
		}
		
		public Builder email(String email) {
			this.email = email;
			return this;
		}
		
		public Member build() {
			return new Member(this);
		}
	}

}
