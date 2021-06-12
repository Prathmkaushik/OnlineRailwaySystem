package io.javabrains.Admin.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.javabrains.Admin.mongodb.Admin;

@Repository
public interface AdminRepository extends MongoRepository<Admin, String> {

}
