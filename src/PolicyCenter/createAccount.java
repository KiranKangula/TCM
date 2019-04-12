package PolicyCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class createAccount {

	public void accountcreate(WebDriver driver) throws InterruptedException
	{
		randomString gen = new randomString(8);
		Actions actionObj = new Actions(driver);
		
		
		driver.findElement(By.id("TabBar:AccountTab_arrow")).click();
		driver.findElement(By.id("TabBar:AccountTab:AccountTab_NewAccount")).click();
		driver.findElement(By.id("NewAccount:NewAccountScreen:NewAccountSearchDV:TradeName")).sendKeys(gen.nextString());
		driver.findElement(By.id("NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search_link")).click();
		driver.findElement(By.xpath("//div[@id='NewAccount:NewAccountScreen:NewAccountSearchResultsLV_tb']//span[2]")).click();
		driver.findElement(By.id("WSIB_Registration:WSIB_RegistrationScreen:WSIB_RegistrationDV:AddCRA")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("WSIB_Registration:WSIB_RegistrationScreen:WSIB_RegistrationDV:RegistrationTypeSelection")).click();
		Select 	RegistrationType = new Select(driver.findElement(By.id("WSIB_Registration:WSIB_RegistrationScreen:WSIB_RegistrationDV:RegistrationTypeSelection")));
		RegistrationType.selectByValue("wsib_general");
		Thread.sleep(1000);
		
		driver.findElement(By.id("WSIB_Registration:WSIB_RegistrationScreen:WSIB_RegistrationDV:CreateAccountContactInputSet:OwnershipTypeSelection")).click();
		Select OwnershipType = new Select(driver.findElement(By.id("WSIB_Registration:WSIB_RegistrationScreen:WSIB_RegistrationDV:CreateAccountContactInputSet:OwnershipTypeSelection")));
		OwnershipType.selectByValue("government");
		Thread.sleep(1000);
	
		driver.findElement(By.id("WSIB_Registration:WSIB_RegistrationScreen:WSIB_RegistrationDV:CreateAccountContactInputSet:LegalName")).sendKeys(gen.nextString());
		
		Thread.sleep(2000);
		driver.findElement(By.id("WSIB_Registration:WSIB_RegistrationScreen:WSIB_RegistrationDV:CreateAccountContactInputSet:Phone")).click();
		Thread.sleep(2000);
		actionObj.keyDown(Keys.CONTROL)
		         .sendKeys(Keys.chord("a"))
		         .keyUp(Keys.CONTROL)
		         .perform();
		         
		Thread.sleep(4000);
		driver.findElement(By.id("WSIB_Registration:WSIB_RegistrationScreen:WSIB_RegistrationDV:CreateAccountContactInputSet:Phone")).sendKeys("647-585-5252");
		
		
	}
	
	
}
