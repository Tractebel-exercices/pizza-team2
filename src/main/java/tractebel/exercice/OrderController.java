package tractebel.exercice;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tractebel.exercice.domain.Order;
import tractebel.exercice.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(path="/order", method=RequestMethod.POST, consumes="application/json")
	public Order triggerOrder(@RequestBody Map<Object, Object> map) {
		Order order = orderService.getOrder(1L);
		return order;
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(path="/addOrder", method=RequestMethod.POST, consumes="application/json")
	public Order addOrder(@RequestBody Order order) {
		orderService.addOrder(order);
		return order;
	}
	
}
