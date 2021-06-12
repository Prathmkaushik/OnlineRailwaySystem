package io.javabrains.Admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.Admin.Service.AdminService;
import io.javabrains.Admin.model.AdminModel;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminServiceImpl;
	
	@GetMapping("/AdminService")
	public String demo() {
		return "Admin Service";
	}
	
	@PostMapping("/addAdmin")
	public String createadmin(@RequestBody AdminModel adminDto) {
			
			return adminServiceImpl.createadmin(adminDto);
	}
	
	@GetMapping("/findAmin") 
	public List<AdminModel> getAllAdmin(){ 
		return adminServiceImpl.getAllAdmin(); 
    }
	
	@PutMapping(value = "/updateAdmin")
	public Object updateadmin(@RequestBody AdminModel adminDto) {

		return adminServiceImpl.updateadmin(adminDto);
	}
		 

	
	
	@DeleteMapping("/delete/{id}")
	public String deleteadminbyId(@PathVariable String id) {
		return adminServiceImpl.deleteadminbyId(id);
	}


}
