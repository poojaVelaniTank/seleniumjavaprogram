package seleniumjavaprogram;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class makemytrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.ChromeDriver","D:\\SeleniumChrome browser\\Supportingfiles\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		try {
	driver.findElement(By.xpath("//li[text()=\"Personal Account\"]")).sendKeys("email");
	driver.findElement(By.xpath("//span[@class=\"myPrfilSprit myPrfilSprit__logout\"]")).click();
		}
	catch(NoSuchElementException login)
		{
		System.out.println("Login/signup popup is not visible");
	}
	driver.findElement(By.xpath("//div[contains(@class,\"DayPicker-Day\")]")).isDisplayed();
	driver.findElement(By.xpath("//div[@class=\"DayPicker-Day\"]")).click();
	
	driver.findElement(By.xpath("//div[@aria-haspopup=\"listbox\"]")).sendKeys("NewDelhi");	
    driver.findElement(By.xpath("//label[@for=\"toCity\"]")).sendKeys("Paris");
     
    driver.findElement(By.xpath("//input[@id=\"departure\"]/../p/span"));
    Thread.sleep(5000);
    
    driver.findElement(By.xpath("//div[@data-cy=\"flightSW\"]"));
    driver.quit();
		}
}

