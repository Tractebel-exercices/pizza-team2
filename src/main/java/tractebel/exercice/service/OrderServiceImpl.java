package tractebel.exercice.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tractebel.exercice.dao.OrderDao;
import tractebel.exercice.domain.Order;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;
	
	/* (non-Javadoc)
	 * @see tractebel.exercice.service.OrderService#addOrder(tractebel.exercice.domain.Order)
	 */
	@Override
	public Order addOrder(Order order) {
		
		order.setDeliveryTime(new Date().toString());
		order.setOrderTime(new Date().toString());
//		order.setPrice(price);
		orderDao.save(order);
		return order;
	}
	
	/* (non-Javadoc)
	 * @see tractebel.exercice.service.OrderService#getOrder(java.lang.Long)
	 */
	@Override
	public Order getOrder(Long id) {
		return orderDao.findOne(id);
	}
	
}
