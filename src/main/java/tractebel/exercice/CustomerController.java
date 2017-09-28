package tractebel.exercice;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tractebel.exercice.domain.Customer;

@RestController
public class CustomerController {
	
	@RequestMapping(path="/")
	public Customer saveCustomer(@RequestBody Customer customer) {
		
		
		return customer;
	}

}
