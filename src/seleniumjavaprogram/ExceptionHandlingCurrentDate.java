package seleniumjavaprogram;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ExceptionHandlingCurrentDate {

	public static void main(String[] args) {
		// set the system property so that the chrome driver is located
		System.getProperty("WebDriver.Chrome.Driver","D:\\Selenium\\Supportingfiles\\chromedriver.exe");
		//create object of WebDriver Interface
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
	List<WebElement> dateclick = driver.findElements(By.xpath("//div[contains(@class,\"DayPicker-Day\") "
			+ " and @aria-disabled=\"false\" and contains(@aria-label,\"Jun\") ]"));
	List<WebElement> datetext = driver.findElements(By.xpath("//div[contains(@class,\"DayPicker-Day\")"
			+ "  and @aria-disabled=\"false\" and contains(@aria-label,\"Jun\") ]/p"));
		int countofdates=dateclick.size();
		for(int i=0; i<countofdates ;i++)
		{
			String dateTextValue= datetext.get(i).getText();
			if(dateTextValue=="DesiredDate")
			{
				dateclick.get(i).click();
				break;
			}
			else
			{
				System.out.println("Desired date not found");
			}
			}
		}
}	
			
			
			
	