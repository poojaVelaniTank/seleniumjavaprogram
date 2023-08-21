package seleniumjavaprogram;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
public class Exceptionhandlingtrycatch {

	public static void main(String[] args) throws InterruptedException {
		//set the system property so that chrome driver is located
				System.getProperty("WebDriver.Chrome.Driver","D:\\Selenium\\Supportingfiles\\chromedriver.exe");
			//create the object of WebDriver interface
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.goibibo.com/");
			driver.manage().window().maximize();
				// handle login pop-up
				// find Login/Sign up pop-up
				try
				{
				driver.findElement(By.xpath("//h3[text()=\"Login/Signup\"]")).isDisplayed();
					// closed the pop-up
					driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
				}
				catch (NoSuchElementException Pop1)
				{
					System.out.println("This Login/Signup pop-up is not visible");
				}
				
				// handle QR code pop-up
				// find the QR code pop-up
				try
				{
				 driver.findElement(By.xpath("//div[@class=\"sc-jlwm9r-6 gJRYxx\"]")).isDisplayed();
					// closed the pop-up
					driver.findElement(By.xpath("//p[@class=\"sc-jlwm9r-1 dRQhOp\"]")).click();
				}
				catch(NoSuchElementException Pop2)
				{
					System.out.println("QR Code pop-is is not visible");
				}
				
				// find calendar and click on it (click xpath)
				driver.findElement(By.xpath("//span[text()=\"Departure\"]/../p/span")).click();
				Thread.sleep(5000);
				
				// find current date and select it (current date xpath)
				driver.findElement(By.xpath("//div[contains(@class,\"DayPicker-Day--today\")]")).click();
				
				// find Done button and click on it ( Done button xpath)
				driver.findElement(By.xpath("//span[text()=\"Done\"]")).click();
				Thread.sleep(5000);
				driver.quit();
			}

		}

	

