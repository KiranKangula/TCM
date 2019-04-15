package PolicyCenter;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kangulak\\Desktop\\GuidewireTCM\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev4.wsib.on.ca/pc/PolicyCenter.do");
		
		driver.switchTo().frame("top_frame");
		
		//xx to be done updated in the ussssdddd edited from the GIT, now this is from Eclipse new one
		
		driver.findElement(By.id("Login:LoginScreen:LoginDV:username")).sendKeys("kangulak");
		driver.findElement(By.id("Login:LoginScreen:LoginDV:password")).sendKeys("gw");
		driver.findElement(By.xpath("//span[@class='button_link']")).click();
		
		createAccount acc = new createAccount();
		acc.accountcreate(driver);
	
		
		}

}
