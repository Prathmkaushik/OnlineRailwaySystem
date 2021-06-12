package io.javabrains.Passenger.repository;


import org.springframework.stereotype.Repository;

import io.javabrains.Passenger.mongodb.PassengerData;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;


@Repository
public interface PassengerRepository extends MongoRepository<PassengerData, String> {

	Optional<PassengerData> findById(String id, String name, String email, String password, String gender, double age,
			String address, String contactNo);

}
