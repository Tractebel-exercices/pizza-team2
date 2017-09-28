package tractebel.exercice.dao;

import org.springframework.data.repository.CrudRepository;

import tractebel.exercice.domain.Order;

public interface OrderDao extends CrudRepository<Order, Long> {

}
