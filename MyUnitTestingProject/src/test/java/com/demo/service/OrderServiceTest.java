package com.demo.service;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.demo.domain.Order;

public class OrderServiceTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@Mock
	Order order;
	
	@Mock
	EmailService email;
	
	@InjectMocks
	OrderService orderService;
	
	@Rule
	public ExpectedException exceptedException = ExpectedException.none();
	
	@Test
	public void test_getInstance() {
		OrderService order1 = OrderService.getInstance();
		assertTrue(order1 instanceof OrderService);
	}
	
	
	@Test
	public void test_OrderService() {
		orderService = new OrderService();
		try {
			new OrderService();
		}catch(Exception ex) {
			fail(ex.getMessage());
		}
		
	}
	@Test(expected=RuntimeException.class)
	public void test_PlaceOrder() {
		//Given
		Order order2 = new Order();
		EmailService emailService = new EmailService();
		
		//When
		Mockito.when(order.getPrice()).thenReturn(80.0*20/100);
		Mockito.when(order2.setPriceWithTax(80.0*20/100)).thenReturn(new Order());
		
		//Then
		assertEquals((double)16,order.getPrice(),0.001);
		assertTrue(order2.setPriceWithTax(90.0*20/100) instanceof Order);
		
		Mockito.verify(email).sendEmail(order);
		Mockito.verify(order).setCustomerNotified(false);
	}
	
    @Test
    public void test_placeOrderBooleanRetrunType() {
    	Mockito.when(email.sendEmail(order, "vivek")).thenReturn(true);
    	assertTrue(email.sendEmail(order,"vivek"));
    }
	
}
