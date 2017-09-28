package tractebel.exercice.domain;

public class Order {

	private Customer customer;
	private Long menuItem;
	private String paymentNumber;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Long getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(Long menuItem) {
		this.menuItem = menuItem;
	}

	public String getPaymentNumber() {
		return paymentNumber;
	}

	public void setPaymentNumber(String paymentNumber) {
		this.paymentNumber = paymentNumber;
	}

}
