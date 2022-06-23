package io.railflow.demo.junit;

import static io.railflow.demo.junit.Utils.runTest;

import org.junit.Test;

/**
 * @author Sergey Oplavin
 */
public class OtherFeatureTest {
	@Test
	public void help_link_displayed() {
		runTest();
	}

	@Test
	public void sales_popUp_appears_for_users() {
		runTest();
	}

	@Test
	public void feedback_link_displayed() {
		runTest();
	}

	@Test
	public void user_send_feedback_successfully() {
		runTest();
	}

	@Test
	public void user_session_expires_after_5_minutes() {
		runTest();
	}
}
