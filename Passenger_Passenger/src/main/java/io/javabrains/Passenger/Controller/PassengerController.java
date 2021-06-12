package io.javabrains.Passenger.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.Passenger.Service.PassengerService;
import io.javabrains.Passenger.model.PassengerModel;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
	
	@Autowired
	PassengerService passengerServiceImpl;
	
	@GetMapping("/PassengerService")
	public String demo() {
		return "Passenger Service";
	}
	
	@PostMapping("/register")
	public String createPassenger(@RequestBody PassengerModel passengerDto) {
			
			return passengerServiceImpl.createPassenger(passengerDto);
	}
	
	@PutMapping(value = "/updatepassenger")
	public Object updatePassengerDatat(@RequestBody PassengerModel passengerDto) {

		return passengerServiceImpl.updatepassenger(passengerDto);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletePassengerData(@PathVariable String id) {
		return passengerServiceImpl.deletepassengerbyId(id);
	}
	

}
