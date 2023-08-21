package seleniumjavaprogram; 
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
public class draganddrop {
	public static void main(String[] args) {
		//set the system property so that chrome driver is located
				System.getProperty("WebDriver.Chrome.Driver","D:\\Selenium\\Supportingfiles\\chromedriver.exe");
				//create the object of WebDriver interface
				WebDriver driver =new ChromeDriver();
				driver.get("https://www.google.co.in/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				Actions act = new Actions(driver);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				//Switch to a frame
				WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
				
				driver.switchTo().frame(frame);
				WebElement dragelement = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
				WebElement droptarget = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
				
				act.dragAndDrop(dragelement, droptarget).build().perform();
					
				//Switch to parent frame
				driver.switchTo().parentFrame();
				
				//Scroll
				WebElement ScrollTarget = driver.findElement(By.xpath("//a[text()=\"Widget Factory\"]"));
				js.executeScript("arguments[0].scrollIntoView();", ScrollTarget);
				ScrollTarget.click();
				driver.quit();
			}
	}

	
