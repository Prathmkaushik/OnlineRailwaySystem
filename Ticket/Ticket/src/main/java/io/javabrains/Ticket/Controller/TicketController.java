package io.javabrains.Ticket.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.Ticket.model.TicketModel;
import io.javabrains.Ticket.service.TicketService;


@RestController
@RequestMapping("/train")
public class TicketController {
	
	@Autowired
	TicketService ticketServiceImpl;
	
	@GetMapping("/Ticket")
	public String demo() {
		return "Ticket Service";
	}
	
	@PostMapping("/addTickets")
	public String createticket(@RequestBody TicketModel ticketDto) {
			
			return ticketServiceImpl.createticket(ticketDto);
	}

	
	@GetMapping("/findAllTickets") 
	public List<TicketModel> getAllTickets(){ 
		return ticketServiceImpl.getAllTickets(); 
    }
	
	@PutMapping(value = "/updateticket")
	public Object updateTicket(@RequestBody TicketModel ticketDto) {

		return ticketServiceImpl.updateticket(ticketDto);
	}
		 

	
	
	@DeleteMapping("/delete/{id}")
	public String deleteTicket(@PathVariable String id) {
		return ticketServiceImpl.deleteticketbyId(id);
	}


}
