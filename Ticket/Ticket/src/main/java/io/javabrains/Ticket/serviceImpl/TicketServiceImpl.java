package io.javabrains.Ticket.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.Ticket.model.TicketModel;
import io.javabrains.Ticket.mongodb.Ticket;
import io.javabrains.Ticket.repository.TicketRepository;
import io.javabrains.Ticket.service.TicketService;


@Service
public class TicketServiceImpl implements TicketService{
	@Autowired
	TicketRepository ticketRepository;

	@Override
	public String createticket(TicketModel ticketDto) {
		Ticket ticket = new Ticket(ticketDto.getId(),ticketDto.getDep_location(),ticketDto.getArrival_location());
		Ticket saved =  ticketRepository.save(ticket);
		return saved.getId();
	}

	@Override
	public List<TicketModel> getAllTickets() {
		List<Ticket> ticketList = ticketRepository.findAll();
		
		List<TicketModel> result = new ArrayList<TicketModel>();
		
		for(Ticket ticket:ticketList) {
			TicketModel ticketDto = new TicketModel(ticket.getId(),ticket.getDep_location(),ticket.getArrival_location());
			result.add(ticketDto);
		}
		
		return result;	
		
	}

	@Override
	public String updateticket(TicketModel ticketDto) {
		Optional<Ticket> ticket = ticketRepository.findById(ticketDto.getId());
		
		Ticket saved = null;
		if(ticket.isPresent()){
			saved =  ticketRepository.save(new Ticket(ticketDto.getId(),ticketDto.getDep_location(),ticketDto.getArrival_location()));
			return saved.getId();
		}
		else{
			return "Unable to find Tickets";
		}
	}


	@Override
	public TicketModel findById(String id) {
		
		 TicketModel ticketDto = null;
			Optional<Ticket> ticket = ticketRepository.findById(id);
			
			if(ticket.isPresent()) {
				Ticket t =ticket.get();
				ticketDto = new TicketModel(t.getId(),t.getDep_location(),t.getArrival_location());
			}
			
		    return ticketDto;	
	}


	@Override
	public String deleteticketbyId(String id) {
		ticketRepository.deleteById(id);
		return "ticket deleted";
	}
	

}
