package awwa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VolunteerApply {
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://awwa.org.sg/qat/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	WebElement clickVol = driver.findElement(By.xpath("//ul[@id='menu-1-24f0bb55']//a[text()='Volunteer With Us']"));
	clickVol.click();
	
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0,400)", "");
	
	//WebElement clickCam = driver.findElement(By.xpath("//div[@class='vol_sec_text']//h3//a[text()='Save Earth']"));
	//clickCam.click();
	
	//WebElement clickCheckBox = driver.findElement(By.xpath("//label[@class='cus_rad morning']/span[@class='checkmark']"));
	//clickCheckBox.click();
	
	//WebElement applyVol = driver.findElement(By.xpath("//*[@id='apply_for_volunteer']"));
	//applyVol.click();
	
	//click on individual Volunteer
	WebElement indVol = driver.findElement(By.xpath("//span[contains(text(),'Sign up as an individual volunteer')]"));
	indVol.click();
	
	WebElement firstName = driver.findElement(By.id("wpforms-12863-field_87"));
	firstName.sendKeys("Individual");
	
	WebElement lastName = driver.findElement(By.id("wpforms-12863-field_87-last"));
	lastName.sendKeys("User");
	
	WebElement address = driver.findElement(By.id("wpforms-12863-field_136"));
	address.sendKeys("Indian Street");
	
	WebElement mailingAddress = driver.findElement(By.id("wpforms-12863-field_112"));
	mailingAddress.sendKeys("123, Test Address");
	
	WebElement unitNumber = driver.findElement(By.id("wpforms-12863-field_113"));
	unitNumber.sendKeys("123456");
	
	WebElement state = driver.findElement(By.id("wpforms-12863-field_115"));
	state.sendKeys("Jaipur");
	
	WebElement zipCode = driver.findElement(By.id("wpforms-12863-field_122"));
	zipCode.sendKeys("302017");
	
	WebElement homePhone = driver.findElement(By.id("wpforms-12863-field_3"));
	homePhone.sendKeys("09876543");
	
	WebElement mobile = driver.findElement(By.id("wpforms-12863-field_34"));
	mobile.sendKeys("09876543");
	
	WebElement eMail = driver.findElement(By.id("wpforms-12863-field_2"));
	eMail.sendKeys("nishant.johri+638@ranosys.com");
	
	WebElement dDate = driver.findElement(By.xpath("//select[@id='wpforms-field_8-day']/option[@value=3]"));
	dDate.click();
	
	WebElement dMonth = driver.findElement(By.xpath("//select[@id='wpforms-field_8-month']/option[@value=3]"));
	dMonth.click();
	
	WebElement dYear = driver.findElement(By.xpath("//select[@id='wpforms-field_8-year']/option[@value=2008]"));
	dYear.click();
	
	WebElement docNo = driver.findElement(By.id("wpforms-12863-field_11"));
	docNo.sendKeys("234A");
	
	WebElement occupation = driver.findElement(By.id("wpforms-12863-field_41"));
	occupation.sendKeys("SSE");
	
	WebElement langWritten = driver.findElement(By.xpath("//input[@id='wpforms-12863-field_46_1']"));
	langWritten.click();
	
	WebElement otherLangWritten = driver.findElement(By.xpath("//input[@id='wpforms-12863-field_46_6']"));
	otherLangWritten.click();
	
	WebElement langSpoken = driver.findElement(By.xpath("//input[@id='wpforms-12863-field_24_1']"));
	langSpoken.click();
	
	WebElement otherLangSpoken = driver.findElement(By.xpath("//input[@id='wpforms-12863-field_24_6']"));
	otherLangSpoken.click();
	
	WebElement dialectSpoken = driver.findElement(By.id("wpforms-12863-field_137_7"));
	dialectSpoken.click();
	
	WebElement dialectifAny = driver.findElement(By.id("wpforms-12863-field_179"));
	dialectifAny.sendKeys("Test data");
	
	WebElement prefBen = driver.findElement(By.id("wpforms-12863-field_55_4"));
	prefBen.click();
	
	WebElement sourceKnown = driver.findElement(By.id("wpforms-12863-field_123_2"));
	sourceKnown.click();
	
	WebElement volExp = driver.findElement(By.xpath("//select[@id='wpforms-12863-field_146']/option[@value=3]"));
	volExp.click();
	
	WebElement orgName = driver.findElement(By.id("wpforms-12863-field_139"));
	orgName.sendKeys("Ranosys Tech");
	
	WebElement orgExp = driver.findElement(By.id("wpforms-12863-field_141"));
	orgExp.sendKeys("03");
	
	WebElement orgYear = driver.findElement(By.id("wpforms-12863-field_152"));
	orgYear.sendKeys("2018");
	
	WebElement skill = driver.findElement(By.id("wpforms-12863-field_76_56"));
	skill.click();
	
	WebElement skill1 = driver.findElement(By.id("wpforms-12863-field_76_66"));
	skill1.click();
	
	WebElement motAWWA = driver.findElement(By.id("wpforms-12863-field_150_1"));
	motAWWA.click();
	
	WebElement descYou = driver.findElement(By.id("wpforms-12863-field_175_3"));
	descYou.click();
	
	WebElement commitLevel = driver.findElement(By.id("wpforms-12863-field_183_1"));
	commitLevel.click();
	
	WebElement commitFreq = driver.findElement(By.id("wpforms-12863-field_126_1"));
	commitFreq.click();
	
	WebElement commitTime = driver.findElement(By.id("wpforms-12863-field_133_1"));
	commitTime.click();
	
	WebElement emergencyName = driver.findElement(By.id("wpforms-12863-field_63"));
	emergencyName.sendKeys("Nishant Johri");
	
	WebElement emergencyNumber = driver.findElement(By.id("wpforms-12863-field_64"));
	emergencyNumber.sendKeys("12345677");
	
	WebElement relation = driver.findElement(By.id("wpforms-12863-field_66"));
	relation.sendKeys("Friend");
	
	WebElement referenceName = driver.findElement(By.id("wpforms-12863-field_68"));
	referenceName.sendKeys("Kevin");
	
	WebElement refNumber = driver.findElement(By.id("wpforms-12863-field_69"));
	refNumber.sendKeys("12345677");
	
	WebElement referenceEmail = driver.findElement(By.id("wpforms-12863-field_72"));
	referenceEmail.sendKeys("nishant.johri@ranosys.com");
	
	WebElement referenceRelation = driver.findElement(By.id("wpforms-12863-field_71"));
	referenceRelation.sendKeys("Friend");
	
	WebElement referenceyearKnown = driver.findElement(By.id("wpforms-12863-field_73"));
	referenceyearKnown.sendKeys("06");
	
	WebElement PersonalDecQ1 = driver.findElement(By.id("wpforms-12863-field_80_2"));
	PersonalDecQ1.click();
	
	WebElement PersonalDecQ2 = driver.findElement(By.id("wpforms-12863-field_100_2"));
	PersonalDecQ2.click();
	
	WebElement PersonalDecQ3 = driver.findElement(By.id("wpforms-12863-field_148_2"));
	PersonalDecQ3.click();
	
	WebElement underTaking = driver.findElement(By.id("wpforms-12863-field_121_1"));
	underTaking.click();
	
	
	WebElement submitVolunteer = driver.findElement(By.id("wpforms-submit-12863"));
	submitVolunteer.click();
	
	Thread.sleep(5000);
	
	String ExpectedMessage = "Thank you for your interest in volunteering with AWWA!";
	WebElement ActualMessage = driver.findElement(By.xpath("//div[@class='elementor-text-editor elementor-clearfix']//h1"));
	String Actmessage = ActualMessage.getText();
	
	if(Actmessage.equals(ExpectedMessage)) {
		
		System.out.println("Test Case passed");
	}
		else {
		
		System.out.println("test case failed");
	}
	
	
	driver.close();
	
	
	}

}
