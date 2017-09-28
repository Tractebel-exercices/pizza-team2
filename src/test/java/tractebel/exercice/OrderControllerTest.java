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

import tractebel.exercice.domain.Customer;
import tractebel.exercice.domain.Order;

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
		customer.setStreet("Ayala Avenue");
		customer.setStreetNumber("123");
		customer.setComplement("3008");
		customer.setPostalCode("1770");
		customer.setCity("Makati");
		customer.setCountry("Philippines");
		customer.setPaymentProvidder("visa");
		customer.setPaymentNumber("1234 4321 1234 4321");
		customer.setExpiration("20180110");
		
		Order order = new Order();
		order.setCustomer(customer);
		order.setMenuItem(1L);
		order.setPaymentNumber("1234");
		
		Map<String, Order> map = new HashMap<>();
		String url = "http://localhost:8080/order";
		restTemplate.postForObject(url, order, Order.class, map);
		
	}

}
