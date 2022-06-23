package io.railflow.demo.junit;

import static io.railflow.demo.junit.Utils.runTest;

import org.junit.Test;

/**
 * @author Sergey Oplavin
 */
public class ShoppingCartTest {

	@Test
	public void shopping_cart_is_available_for_logged_in_users() {
		runTest();
	}

	@Test
	public void shopping_cart_can_be_opened() {
		runTest();
	}

	@Test
	public void shopping_cart_shows_goods_properly() {
		runTest();
	}

	@Test
	public void user_can_remove_goods_from_shopping_cart() {
		runTest();
	}

	@Test
	public void user_can_confirm_the_order_and_proceed_to_payment() {
		runTest();
	}
}
