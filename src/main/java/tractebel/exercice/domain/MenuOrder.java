package tractebel.exercice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MENUORDER")
public class MenuOrder {

	private Long id;
	private String restaurant;
	private Integer menuItem;

	@Id
    @Column(name = "MENU_ORDER_ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "RESTAURANT")
	public String getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}

	@Column(name = "MENU_ITEM")
	public Integer getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(Integer menuItem) {
		this.menuItem = menuItem;
	}

}
