package io.javabrains.Passenger.Service;

import io.javabrains.Passenger.model.PassengerModel;

public interface PassengerService {
	public String createPassenger(PassengerModel passengerdto);
	
	public String updatepassenger(PassengerModel passengerDto);
	public PassengerModel findById(String id);
	
	
	public String deletepassengerbyId(String id);

}
