package io.javabrains.Passenger.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.Passenger.Service.PassengerService;
import io.javabrains.Passenger.model.PassengerModel;
import io.javabrains.Passenger.mongodb.PassengerData;
import io.javabrains.Passenger.repository.PassengerRepository;


@Service
public class PassengerserviceImpl implements PassengerService{
	@Autowired
	PassengerRepository passengerRepository;

	@Override
	public String createPassenger(PassengerModel passengerDto) {
		PassengerData passengerData = new PassengerData(passengerDto.getId(),passengerDto.getName(),passengerDto.getEmail(),passengerDto.getPassword(),passengerDto.getGender(),passengerDto.getAge(),passengerDto.getAddress(),passengerDto.getContactNo());
		PassengerData saved =  passengerRepository.save(passengerData);
		return saved.getName();
		
	}

	@Override
	public String updatepassenger(PassengerModel passengerDto) {
		Optional<PassengerData> passenger = passengerRepository.findById(passengerDto.getId());
		
		PassengerData saved = null;
		if(passenger.isPresent()){
			saved =  passengerRepository.save(new PassengerData(passengerDto.getId(),passengerDto.getName(),passengerDto.getEmail(),passengerDto.getPassword(),passengerDto.getGender(),passengerDto.getAge(),passengerDto.getAddress(),passengerDto.getContactNo()));
			return saved.getName();
		}
		else{
			return "Unable to fnd passenger";
		}

	}

	@Override
	public PassengerModel findById(String id) {
		 PassengerModel passengerDto = null;
			Optional<PassengerData> passengerData = passengerRepository.findById(id);
			
			if(passengerData.isPresent()) {
				PassengerData s =passengerData.get();
				passengerDto = new PassengerModel(s.getId(),s.getName(),s.getEmail(),s.getPassword(),s.getGender(),s.getAge(),s.getAddress(),s.getContactNo());
			}
			
		    return passengerDto;	
		    }


	@Override
	public String deletepassengerbyId(String id) {
		passengerRepository.deleteById(id);
		return "Passenger Deleted";
	}

}
