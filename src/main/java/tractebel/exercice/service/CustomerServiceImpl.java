package tractebel.exercice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tractebel.exercice.dao.CustomerDao;
import tractebel.exercice.domain.Customer;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	/* (non-Javadoc)
	 * @see tractebel.exercice.service.CustomerService#addCustomer(tractebel.exercice.domain.Customer)
	 */
	@Override
	public Customer addCustomer(Customer customer) {
		customerDao.save(customer);
		return customer;
	}
	
	/* (non-Javadoc)
	 * @see tractebel.exercice.service.CustomerService#getCustomer(java.lang.Long)
	 */
	@Override
	public Customer getCustomer(Long id) {
		return customerDao.findOne(id);
	}

	
}
