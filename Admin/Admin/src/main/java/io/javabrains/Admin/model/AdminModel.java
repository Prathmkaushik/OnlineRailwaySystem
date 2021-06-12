package io.javabrains.Admin.model;

public class AdminModel {
	private String id;
	private String adminname;
	private String username;
	private String email;
	private String password;
	
	public AdminModel() {}

	public AdminModel(String id, String adminname, String username, String email, String password) {
		super();
		this.id = id;
		this.adminname = adminname;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public AdminModel(String adminname, String username, String email, String password) {
		
		this.adminname = adminname;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminModel [id=" + id + ", adminname=" + adminname + ", username=" + username + ",  email=" + email + ", password=" + password + "]";
	}
	
	

}
