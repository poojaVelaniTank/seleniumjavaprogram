package seleniumjavaprogram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class calender {
	public static void main(String[] args) throws InterruptedException {
	//set the system property so that chrome driver is located
		System.getProperty("WebDriver.Chrome.Driver","D:\\Selenium\\Supportingfiles\\chromedriver.exe");
	//create the object of WebDriver interface
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.goibibo.com/");
	driver.manage().window().maximize();
	
	//handle login popup
	boolean popupvisible=driver.findElement(By.xpath("//h3[text()=\"login/Signup\"]")).isDisplayed();
	if(popupvisible==true)
	{
		driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
	}
	boolean popup2 = driver.findElement(By.xpath("//div[@class=\"sc-jlwm9r-6 gJRYxx\"]")).isDisplayed();
	if(popup2 == true)
	{
		driver.findElement(By.xpath("//p[@class=\"sc-jlwm9r-1 dRQhOp\"]")).click();
	}
	driver.findElement(By.xpath("//span[text()=\"Departure\"]/../p/span")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//div[contains(@class,\"DayPicker-Day--today\")]")).click();
	
	driver.findElement(By.xpath("//span[text()=\"Done\"]")).click();
	Thread.sleep(5000);
	driver.quit();
}
}

