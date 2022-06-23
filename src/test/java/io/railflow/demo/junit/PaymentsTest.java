package io.railflow.demo.junit;

import static io.railflow.demo.junit.Utils.runTest;

import org.junit.Test;

/**
 * @author Sergey Oplavin
 */
public class PaymentsTest {

	@Test
	public void user_has_valid_cc() {
		runTest();
	}

	@Test
	public void user_has_invalid_cc() {
		runTest();
	}

	@Test
	public void an_error_occurred_during_transaction() {
		runTest();
	}

	@Test
	public void user_cancels_transaction() {
		runTest();
	}

	@Test
	public void notification_message_is_correct() {
		runTest();
	}
}
