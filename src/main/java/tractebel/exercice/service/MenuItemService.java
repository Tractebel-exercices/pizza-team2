package tractebel.exercice.service;

import tractebel.exercice.domain.MenuOrder;

public interface MenuItemService {

	MenuOrder getMenuItem(Long id);

	Iterable<MenuOrder> getAllMenuItems();

}