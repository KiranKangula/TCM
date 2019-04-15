package PolicyCenter;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;

public class createAccount {

	public void accountcreate(WebDriver driver) throws InterruptedException, AWTException
	{
		randomString gen = new randomString(8);
	
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
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_A);
		driver.findElement(By.id("WSIB_Registration:WSIB_RegistrationScreen:WSIB_RegistrationDV:CreateAccountContactInputSet:Phone")).sendKeys("647-585-5252");
		
		driver.findElement(By.id("WSIB_Registration:WSIB_RegistrationScreen:WSIB_RegistrationDV:CreateAccountContactInputSet:EmailAddress1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("WSIB_Registration:WSIB_RegistrationScreen:WSIB_RegistrationDV:CreateAccountContactInputSet:EmailAddress1")).sendKeys("test@gmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.id("WSIB_Registration:WSIB_RegistrationScreen:WSIB_RegistrationDV:MailingAddress:WSIB_NewAddressInputSet:PostalCode")).click();
		Thread.sleep(2000);
		Robot postalcode = new Robot();
		postalcode.keyPress(KeyEvent.VK_CONTROL);
		postalcode.keyPress(KeyEvent.VK_A);
		postalcode.keyRelease(KeyEvent.VK_CONTROL);
		postalcode.keyRelease(KeyEvent.VK_A);
		driver.findElement(By.id("WSIB_Registration:WSIB_RegistrationScreen:WSIB_RegistrationDV:MailingAddress:WSIB_NewAddressInputSet:PostalCode")).sendKeys("M4P 1Z2");
		
		driver.findElement(By.xpath("//span[contains(text(),'Address Lookup')]")).click();
		
		driver.findElement(By.id("WSIB_AddressStandardizationPopup:WSIB_AddressStandardizationLV:0:_Select_link")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Validate Address(es)')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Check for Duplicates')]")).click();
		
		driver.findElement(By.xpath("//a[@id='WSIB_Registration:WSIB_RegistrationScreen:WSIB_RegistrationDV_tb:ForceDupCheckUpdate']//span[2]")).click();
		
		if(driver.findElement(By.id("AccountFile_Summary:AccountFile_SummaryScreen:ttlBar")).getText().contentEquals("Account File Summary"))
		{
			System.out.println("Account Created Succesfully");
			
		}
		
		
		
	}
	
	
}
