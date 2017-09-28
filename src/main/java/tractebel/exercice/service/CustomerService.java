package tractebel.exercice.service;

import tractebel.exercice.domain.Customer;

public interface CustomerService {

	Customer addCustomer(Customer customer);

	Customer getCustomer(Long id);

}