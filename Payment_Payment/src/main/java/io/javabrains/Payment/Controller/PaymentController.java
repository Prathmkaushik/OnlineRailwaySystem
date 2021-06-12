package io.javabrains.Payment.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	@GetMapping("/Payment")
	public String demo() {
		return "Payment service";
	}

}
