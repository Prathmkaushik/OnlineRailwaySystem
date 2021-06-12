package io.javabrains.APIGateway;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@CrossOrigin
public class FallbackController {
	
	@RequestMapping("/passengerFallBack")
	public Mono<String> passengerServiceFallBack(){
		return Mono.just("Paseenger Service is taking too long or the server is down. Please reconnect later");	
	}
	
	@RequestMapping("/passengerFallBack")
	public Mono<String> adminServiceFallBack(){
		return Mono.just("Admin Service is taking too long or the server is down. Please reconnect later");	
	}
}
