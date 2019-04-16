package PolicyCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import testdata.Constant;
import testdata.ExcelUtils;

public class Login {

	public WebDriver chrome() throws Exception {
		//removed this comment
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kangulak\\Desktop\\GuidewireTCM\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
				
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		ExcelUtils.getCellData(2, 2);

		//driver.get("https://sit2.aces.wsib.on.ca:4447/pc/PolicyCenter.do?");
		driver.get(ExcelUtils.getCellData(2, 2));
		
		driver.switchTo().frame("top_frame");
		
		//xx to be done updated in the ussssdddd edited from the GIT, now this is from Eclipse new one
		
		driver.findElement(By.id("Login:LoginScreen:LoginDV:username")).sendKeys(ExcelUtils.getCellData(2, 3));
		driver.findElement(By.id("Login:LoginScreen:LoginDV:password")).sendKeys(ExcelUtils.getCellData(2, 4));
		driver.findElement(By.xpath("//span[@class='button_link']")).click();
		return driver;
		
		}
	

	public WebDriver internetexplorer() throws Exception {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\kangulak\\Desktop\\Automation\\IEDriverServer\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get(ExcelUtils.getCellData(2, 2));
		
		driver.switchTo().frame("top_frame");
		
		//xx to be done updated in the ussssdddd edited from the GIT, now this is from Eclipse new one
		
		driver.findElement(By.id("Login:LoginScreen:LoginDV:username")).sendKeys(ExcelUtils.getCellData(2, 3));
		driver.findElement(By.id("Login:LoginScreen:LoginDV:password")).sendKeys(ExcelUtils.getCellData(2, 4));
		driver.findElement(By.xpath("//span[@class='button_link']")).click();
		return driver;
		
		}

}
