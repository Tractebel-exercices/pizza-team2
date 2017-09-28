package tractebel.exercice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tractebel.exercice.dao.MenuItemDao;
import tractebel.exercice.domain.MenuOrder;

@Service("menuItemService")
public class MenuItemServiceImpl implements MenuItemService {

	@Autowired
	private MenuItemDao menuItemDao;

	/* (non-Javadoc)
	 * @see tractebel.exercice.service.MenuItemService#getMenuItem(java.lang.Long)
	 */
	@Override
	public MenuOrder getMenuItem(Long id) {
		return menuItemDao.findOne(id);
	}

	/* (non-Javadoc)
	 * @see tractebel.exercice.service.MenuItemService#getAllMenuItems()
	 */
	@Override
	public Iterable<MenuOrder> getAllMenuItems() {
		return menuItemDao.findAll();
	}
}
