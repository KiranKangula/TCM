package PolicyCenter;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class createPolicy {

	public void policycreate(WebDriver driver) throws InterruptedException, AWTException
	{
		
		
		driver.findElement(By.xpath("//span[@class='menu_arrow_menubutton']")).click();
		driver.findElement(By.id("AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='SubmissionWizard:Next']//span[@class='button_link'][contains(text(),'Next')]")).click();
		Thread.sleep(1000);
		
		//Classification
		
		driver.findElement(By.id("SubmissionWizard:SubmissionWizard_ClassificationScreen:WSIB_PrimaryIndustry")).click();
		Select 	IndustryClass = new Select(driver.findElement(By.id("SubmissionWizard:SubmissionWizard_ClassificationScreen:WSIB_PrimaryIndustry")));
		IndustryClass.selectByValue("WSIB_ClassAChoice");
		Thread.sleep(1000);
		
		driver.findElement(By.id("SubmissionWizard:SubmissionWizard_ClassificationScreen:WSIB_PrimaryRateGroup")).click();
		Select 	rategroup = new Select(driver.findElement(By.id("SubmissionWizard:SubmissionWizard_ClassificationScreen:WSIB_PrimaryRateGroup")));
		rategroup.selectByValue("WSIB_RateGroup30Choice");
		Thread.sleep(1000);
		
		driver.findElement(By.id("SubmissionWizard:SubmissionWizard_ClassificationScreen:WSIB_ClassificationUnit")).click();
		Select 	classification = new Select(driver.findElement(By.id("SubmissionWizard:SubmissionWizard_ClassificationScreen:WSIB_ClassificationUnit")));
		classification.selectByValue("WSIB_CU0411-099Choice");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='SubmissionWizard:Next']//span[@class='button_link'][contains(text(),'Next')]")).click();
		Thread.sleep(1000);
		
		//Qualification Screen
		
		driver.findElement(By.id("SubmissionWizard:SubmissionWizard_PreQualificationScreen:PreQualQuestionSetsDV:QuestionSetsDV:0:QuestionSetLV:0:QuestionInputSet:ChoiceSelectInput")).click();
		Select 	source = new Select(driver.findElement(By.id("SubmissionWizard:SubmissionWizard_PreQualificationScreen:PreQualQuestionSetsDV:QuestionSetsDV:0:QuestionSetLV:0:QuestionInputSet:ChoiceSelectInput")));
		source.selectByValue("Phone Call/Interview");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='SubmissionWizard:SubmissionWizard_PreQualificationScreen:PreQualQuestionSetsDV:QuestionSetsDV:0:QuestionSetLV:1:QuestionInputSet:BooleanRadioInput_true']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("SubmissionWizard:SubmissionWizard_PreQualificationScreen:PreQualQuestionSetsDV:QuestionSetsDV:0:QuestionSetLV:2:QuestionInputSet:IntegerFieldInput")).sendKeys("200");
		
		driver.findElement(By.id("SubmissionWizard:SubmissionWizard_PreQualificationScreen:PreQualQuestionSetsDV:QuestionSetsDV:0:QuestionSetLV:3:QuestionInputSet:WSIB_DateFieldInput")).click();
		Thread.sleep(2000);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_A);
		driver.findElement(By.id("SubmissionWizard:SubmissionWizard_PreQualificationScreen:PreQualQuestionSetsDV:QuestionSetsDV:0:QuestionSetLV:3:QuestionInputSet:WSIB_DateFieldInput")).sendKeys("04/15/2019");
		
		Thread.sleep(1000);
		driver.findElement(By.id("SubmissionWizard:SubmissionWizard_PreQualificationScreen:PreQualQuestionSetsDV:QuestionSetsDV:0:QuestionSetLV:4:QuestionInputSet:WSIB_Common5CUQuestionStringFieldInput")).sendKeys("200000");
		Thread.sleep(1000);
		driver.findElement(By.id("SubmissionWizard:SubmissionWizard_PreQualificationScreen:PreQualQuestionSetsDV:QuestionSetsDV:0:QuestionSetLV:5:QuestionInputSet:BooleanRadioInput_false")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("SubmissionWizard:SubmissionWizard_PreQualificationScreen:PreQualQuestionSetsDV:QuestionSetsDV:0:QuestionSetLV:6:QuestionInputSet:BooleanRadioInput_false")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("SubmissionWizard:SubmissionWizard_PreQualificationScreen:PreQualQuestionSetsDV:QuestionSetsDV:0:QuestionSetLV:7:QuestionInputSet:BooleanRadioInput_false")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("SubmissionWizard:SubmissionWizard_PreQualificationScreen:PreQualQuestionSetsDV:QuestionSetsDV:0:QuestionSetLV:8:QuestionInputSet:BooleanRadioInput_false")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='SubmissionWizard:Next__dup_1']//span[@class='button_link'][contains(text(),'Next')]")).click();
		
		//Risk Analysis
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='SubmissionWizard:Next']//span[@class='button_link'][contains(text(),'Next')]")).click();
		
		//Business Activity Info
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='SubmissionWizard:WSIB_SubmissionWizard_BAInfoScreen:Next']//span[@class='button_link'][contains(text(),'ext >')]")).click();
		
		//Premium and Payment Details
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='SubmissionWizard:Next']//span[@class='button_link'][contains(text(),'Next')]")).click();
		
		//Business Activity Review
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='SubmissionWizard:WSIB_SubmissionWizard_BAReviewScreen:JobWizardToolbarButtonSet:WSIB_Issue']//span[@class='button_link'][contains(text(),'Issue')]")).click();
		Thread.sleep(1000);
		
		if(driver.findElement(By.xpath("//span[contains(text(),'Submission Issued')]")).getText().contentEquals("Submission Issued"))
		{
			System.out.println("New Business Registration Succesfull!!");
			
			driver.findElement(By.xpath("//span[contains(text(),'View your submission')]")).click();
			
			driver.findElement(By.xpath("//div[contains(text(),'Documents')]")).click();
			
			if(driver.findElement(By.id("SubmissionWizard:JobWizardToolsMenuWizardStepSet:Policy_DocumentsScreen:DocumentsLV:0:deliveryStatus")).getText().contentEquals("Sent"))
				
			{
				driver.findElement(By.id("SubmissionWizard:JobWizardToolsMenuWizardStepSet:Policy_DocumentsScreen:Policy_DocumentSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search_link")).click();
				
				
				
			}
			
			
	
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
