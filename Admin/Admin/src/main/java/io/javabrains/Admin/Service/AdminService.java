package io.javabrains.Admin.Service;

import java.util.List;

import io.javabrains.Admin.model.AdminModel;

public interface AdminService {
	
	public String createadmin(AdminModel adminDto);
	
	public List<AdminModel> getAllAdmin();
	
	public String updateadmin(AdminModel adminDto);
	public AdminModel findById(String id);
	
	
	public String deleteadminbyId(String id);
	

}
