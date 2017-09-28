package tractebel.exercice.domain;

public class Order {

	private Customer customer;
	private MenuOrder menuOrder;

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
