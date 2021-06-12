package io.javabrains.Ticket.service;

import java.util.List;

import io.javabrains.Ticket.model.TicketModel;


public interface TicketService {
	public String createticket(TicketModel ticketDto);
	
	public List<TicketModel> getAllTickets();
	
	public String updateticket(TicketModel ticketDto);
	public TicketModel findById(String id);
	
	
	public String deleteticketbyId(String id);

}
