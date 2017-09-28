package tractebel.exercice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER")
public class Order {

	private Long id;
	private Customer customer;
	private MenuOrder menuOrder;

	@Id
    @Column(name = "ADDRESS_ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public MenuOrder getMenuOrder() {
		return menuOrder;
	}

	public void setMenuOrder(MenuOrder menuOrder) {
		this.menuOrder = menuOrder;
	}

}
