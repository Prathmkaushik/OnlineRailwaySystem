package io.javabrains.Train.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.Train.model.TrainModel;
import io.javabrains.Train.mongodb.Train;
import io.javabrains.Train.repository.TrainRepository;
import io.javabrains.Train.service.TrainService;

@Service
public class TrainServiceImpl implements TrainService{
	@Autowired
	TrainRepository trainRepository;

	@Override
	public String createtrain(TrainModel trainDto) {
		Train train = new Train(trainDto.getId(),trainDto.getTrainname(),trainDto.getCity());
		Train saved =  trainRepository.save(train);
		return saved.trainname();
	}

	@Override
	public List<TrainModel> getAllTrain() {
        List<Train> trainList = trainRepository.findAll();
		
		List<TrainModel> result = new ArrayList<TrainModel>();
		
		for(Train train:trainList) {
			TrainModel trainDto = new TrainModel(train.getId(),train.trainname(),train.getcity());
			result.add(trainDto);
		}
		
		return result;	
		}

	
	@Override
	public String deletetrainbyId(String id) {
		trainRepository.deleteById(id);
		return "train data removed";
	}

	@Override
	public String updatetrain(TrainModel trainDto)  {

		Optional<Train> train = trainRepository.findById(trainDto.getId());
		
		Train saved = null;
		if(train.isPresent()){
			saved =  trainRepository.save(new Train(trainDto.getId(),trainDto.getTrainname(),trainDto.getCity()));
			return saved.getcity();
		}
		else{
			return "Unable to find Train";
		}

	}

	@Override
	public TrainModel findById(String id) {
		 TrainModel trainDto = null;
			Optional<Train> train = trainRepository.findById(id);
			
			if(train.isPresent()) {
				Train s =train.get();
				trainDto = new TrainModel(s.getId(),s.getcity(),s.trainname());
			}
			
		    return trainDto;	
		    }
    }
