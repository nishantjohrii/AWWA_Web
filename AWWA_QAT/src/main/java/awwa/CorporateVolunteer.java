package awwa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CorporateVolunteer {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://awwa.org.sg/qat/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	WebElement clickVol = driver.findElement(By.xpath("//ul[@id='menu-1-24f0bb55']//a[text()='Volunteer With Us']"));
	clickVol.click();
	
	WebElement clickCorLink = driver.findElement(By.xpath("//a/span[contains(text(),'Sign up as a corporate volunteer')]"));
	clickCorLink.click();
	
	WebElement Orgname = driver.findElement(By.id("wpforms-15019-field_4"));
	Orgname.sendKeys("Singlife");
	
	WebElement UENno = driver.findElement(By.id("wpforms-15019-field_5"));
	UENno.sendKeys("CPQ22");
	
	WebElement Address = driver.findElement(By.id("wpforms-15019-field_6"));
	Address.sendKeys("E141 near Chatrala Circle");
	
	WebElement Address1 = driver.findElement(By.id("wpforms-15019-field_7"));
	Address1.sendKeys("Sitapura Industrial Area");
	
	WebElement State = driver.findElement(By.id("wpforms-15019-field_34"));
	State.sendKeys("Rajasthan");
	
	WebElement PostalCode = driver.findElement(By.id("wpforms-15019-field_9"));
	PostalCode.sendKeys("302022");
	
	WebElement Designation = driver.findElement(By.id("wpforms-15019-field_11"));
	Designation.sendKeys("QA Lead");
	
	WebElement FirstName = driver.findElement(By.id("wpforms-15019-field_12"));
	FirstName.sendKeys("Corporate CEO");
	
	WebElement LastName = driver.findElement(By.id("wpforms-15019-field_12-last"));
	LastName.sendKeys("User");
	
	WebElement PhoneNo = driver.findElement(By.id("wpforms-15019-field_14"));
	PhoneNo.sendKeys("09876543");
	
	WebElement MobileNo = driver.findElement(By.id("wpforms-15019-field_15"));
	MobileNo.sendKeys("09876543");
	
	WebElement Email = driver.findElement(By.id("wpforms-15019-field_16"));
	Email.sendKeys("nishant.johri+624@ranosys.com");
	
	WebElement CommitLevel = driver.findElement(By.id("wpforms-15019-field_18_1"));
	CommitLevel.click();
	
	WebElement CommitFreq = driver.findElement(By.id("wpforms-15019-field_30_1"));
	CommitFreq.click();
	
	WebElement TimeAvailable = driver.findElement(By.id("wpforms-15019-field_31_1"));
	TimeAvailable.click();
	
	WebElement NoofEmp = driver.findElement(By.id("wpforms-15019-field_29"));
	NoofEmp.sendKeys("10");
	
	WebElement ShareExp = driver.findElement(By.id("wpforms-15019-field_19"));
	ShareExp.sendKeys("to implement the training in the daily life");
	
	WebElement AwwaOpp = driver.findElement(By.id("wpforms-15019-field_20_4"));
	AwwaOpp.click();
	
	WebElement Subs = driver.findElement(By.id("wpforms-15019-field_23_1"));
	Subs.click();
	
	WebElement TandC = driver.findElement(By.id("wpforms-15019-field_26_1"));
	TandC.click();
	
	//WebElement mulChoice = driver.findElement(By.id("wpforms-15019-field_118_1"));
//	mulChoice.click();
	
	//Thread.sleep(2000);
	
	WebElement Submit = driver.findElement(By.id("wpforms-submit-15019"));
	Submit.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
