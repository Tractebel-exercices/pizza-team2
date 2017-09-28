package tractebel.exercice;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import tractebel.exercice.domain.Address;
import tractebel.exercice.domain.Customer;
import tractebel.exercice.domain.MenuOrder;
import tractebel.exercice.domain.Order;
import tractebel.exercice.domain.Payment;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class OrderControllerTest {

	@Test
	public void testOrder() {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		restTemplate.getMessageConverters().add(new StringHttpMessageConverter());

		Customer customer = new Customer();
		customer.setName("Dennis");
		customer.setEmail("abc@xyz.com");
		
		Address address = new Address();
		address.setStreet("Ayala Avenue");
		address.setNumber("123");
		address.setComplement("3008");
		address.setPostalCode("1770");
		address.setCity("Makati");
		address.setCountry("Philippines");
		customer.setAddress(address);
		
		Payment payment = new Payment();
		payment.setProvider("visa");
		payment.setNumber("1234 4321 1234 4321");
		payment.setExpiration("20180110");
		customer.setPayment(payment);
		
		Order order = new Order();
		order.setCustomer(customer);

		MenuOrder menuOrder = new MenuOrder();
		menuOrder.setMenuItem(1);
		menuOrder.setRestaurant("RED Pizza");

		order.setMenuOrder(menuOrder);

		Map<String, Order> map = new HashMap<>();
		String url = "http://localhost:8080/order";
		restTemplate.postForObject(url, order, Order.class, map);

	}

}
