package io.javabrains.Admin.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.Admin.Service.AdminService;
import io.javabrains.Admin.model.AdminModel;
import io.javabrains.Admin.mongodb.Admin;
import io.javabrains.Admin.repository.AdminRepository;


@Service
public class AdminserviceImpl implements AdminService {
	@Autowired
	AdminRepository adminRepository;

	@Override
	public String createadmin(AdminModel adminDto) {
		Admin admin = new Admin(adminDto.getId(),adminDto.getAdminname(),adminDto.getUsername(),adminDto.getEmail(),adminDto.getPassword());
		Admin saved =  adminRepository.save(admin);
		return saved.getAdminname();
	}
	

	@Override
	public List<AdminModel> getAllAdmin() {
		 List<Admin> adminList = adminRepository.findAll();
			
			List<AdminModel> result = new ArrayList<AdminModel>();
			
			for(Admin admin:adminList) {
				AdminModel adminDto = new AdminModel(admin.getId(),admin.getAdminname(),admin.getUsername(),admin.getEmail(),admin.getPassword());
				result.add(adminDto);
			}
			
			return result;	
	}

	@Override
	public String updateadmin(AdminModel adminDto) {
		Optional<Admin> admin = adminRepository.findById(adminDto.getId());
		
		Admin saved = null;
		if(admin.isPresent()){
			saved =  adminRepository.save(new Admin(adminDto.getId(),adminDto.getAdminname(),adminDto.getUsername(),adminDto.getPassword()));
			return saved.getUsername();
		}
		else{
			return "Unable to find Admin";
		}
	}

	@Override
	public AdminModel findById(String id) {
		 AdminModel adminDto = null;
			Optional<Admin> admin = adminRepository.findById(id);
			
			if(admin.isPresent()) {
				Admin a =admin.get();
				adminDto = new AdminModel(a.getId(),a.getAdminname(),a.getUsername(),a.getPassword());
			}
			
		    return adminDto;	
	}

	@Override
	public String deleteadminbyId(String id) {
		adminRepository.deleteById(id);
		return "Admin data removed";
	}

}
