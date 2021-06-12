package io.javabrains.Ticket.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.javabrains.Ticket.mongodb.Ticket;

@Repository
public interface TicketRepository extends MongoRepository <Ticket, String>{

}
