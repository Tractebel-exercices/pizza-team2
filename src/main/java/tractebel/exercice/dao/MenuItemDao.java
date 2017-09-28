package tractebel.exercice.dao;

import org.springframework.data.repository.CrudRepository;

import tractebel.exercice.domain.MenuOrder;

public interface MenuItemDao extends CrudRepository<MenuOrder, Long> {

}
