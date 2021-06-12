package io.javabrains.Train.service;

import java.util.List;


import io.javabrains.Train.model.TrainModel;


public interface TrainService {
	public String createtrain(TrainModel trainDto);
	
	public List<TrainModel> getAllTrain();
	
	public String updatetrain(TrainModel trainDto);
	public TrainModel findById(String id);
	
	
	public String deletetrainbyId(String id);
	
	
	

}
