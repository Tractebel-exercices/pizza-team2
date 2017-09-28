package tractebel.exercice.service;

import tractebel.exercice.domain.Order;

public interface OrderService {

	Order addOrder(Order order);

	Order getOrder(Long id);

}