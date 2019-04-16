package PolicyCenter;

import org.openqa.selenium.WebDriver;

public class policyCreationDriver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	
		Login log = new Login();
		WebDriver driver = log.internetexplorer();
		
		// Calls the code to create account
		
				createAccount acc = new createAccount();
				acc.accountcreate(driver);
				
				// Calls the code to create policy
				createPolicy pol = new createPolicy();
				pol.policycreate(driver);
	}

}
