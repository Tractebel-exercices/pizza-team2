package tractebel.exercice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tractebel.exercice.domain.Customer;
import tractebel.exercice.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(path="/customer", method=RequestMethod.POST, consumes="application/json")
	public Customer saveCustomer(@RequestBody Customer customer) {
		
		customerService.addCustomer(customer);
		return customer;
	}
	
	@RequestMapping(path="/customer", method=RequestMethod.GET)
	public Customer getCustomer(@PathVariable Long id) {
		return customerService.getCustomer(id);
	}

}
