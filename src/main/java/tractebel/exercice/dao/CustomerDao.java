package tractebel.exercice.dao;

import org.springframework.data.repository.CrudRepository;

import tractebel.exercice.domain.Customer;

public interface CustomerDao extends CrudRepository<Customer, Long>  {

}
