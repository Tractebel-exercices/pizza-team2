package tractebel.exercice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tractebel.exercice.dao.OrderDao;
import tractebel.exercice.domain.Order;

@Service("orderService")
public class OrderServiceImpl {

	@Autowired
	private OrderDao orderDao;
	
	private Order addOrder(Order order) {
		orderDao.save(order);
		return order;
	}
	
	private Order getOrder(Long id) {
		return orderDao.findOne(id);
	}
	
}
