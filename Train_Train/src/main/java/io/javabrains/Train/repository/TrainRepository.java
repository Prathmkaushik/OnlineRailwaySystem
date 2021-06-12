package io.javabrains.Train.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.javabrains.Train.mongodb.Train;


@Repository
public interface TrainRepository  extends MongoRepository<Train, String> {

}
