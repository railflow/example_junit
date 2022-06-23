package io.railflow.demo.junit;

import static io.railflow.demo.junit.Utils.runTest;

import org.junit.Test;

/**
 * @author Sergey Oplavin
 */
public class AccountsTest {

	@Test
	public void user_can_enter_accounts_page() {
		runTest();
	}

	@Test
	public void user_sees_all_the_links_on_the_page() {
		runTest();
	}

	@Test
	public void user_can_access_edit_info_form() {
		runTest();
	}

	@Test
	public void user_can_save_changes_in_their_profile() {
		runTest();
	}

	@Test
	public void user_can_log_out_from_their_account() {
		runTest();
	}
}
