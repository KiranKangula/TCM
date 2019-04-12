package PolicyCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class createAccount {

	public void accountcreate(WebDriver driver)
	{
		randomString gen = new randomString();
		driver.findElement(By.xpath("//span[@class='menu_arrow_tab_on']")).sendKeys("kangulak");
		driver.findElement(By.id("TabBar:AccountTab:AccountTab_NewAccount")).click();
		driver.findElement(By.id("NewAccount:NewAccountScreen:NewAccountSearchDV:TradeName")).sendKeys(gen.alphanum);
		
		
	}
	
	
}
