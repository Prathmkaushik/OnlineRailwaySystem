package io.javabrains.Train.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.Train.model.TrainModel;
import io.javabrains.Train.repository.TrainRepository;
import io.javabrains.Train.service.TrainService;



@RestController
@RequestMapping("/train")
public class TrainController {
	
	@Autowired
	TrainService trainServiceImpl;
	TrainRepository trainRepository;
	
	@GetMapping("/TrainService")
	public String demo() {
		return "Train Service";
	}
	 
	
	@PostMapping("/addTrain")
	public String createtrain(@RequestBody TrainModel trainDto) {
			
			return trainServiceImpl.createtrain(trainDto);
	}

	
	@GetMapping("/findAllTrain") 
	public List<TrainModel> getAllTrain(){ 
		return trainServiceImpl.getAllTrain(); 
    }
	
	@PutMapping(value = "/updatetrain")
	public Object updateTrain(@RequestBody TrainModel trainDto) {

		return trainServiceImpl.updatetrain(trainDto);
	}
		 

	
	
	@DeleteMapping("/delete/{id}")
	public String deleteTrain(@PathVariable String id) {
		return trainServiceImpl.deletetrainbyId(id);
	}

}
