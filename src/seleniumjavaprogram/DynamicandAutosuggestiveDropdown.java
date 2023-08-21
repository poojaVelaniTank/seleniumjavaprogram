package seleniumjavaprogram;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DynamicandAutosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		//set the system property so that chrome driver is located
		System.getProperty("WebDriver.Chrome.Driver","D:\\Selenium\\Supportingfiles\\chromedriver.exe");
		//create the object of WebDriver interface
				WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys("Selenium");
		Thread.sleep(5000);
		List<WebElement> clickoption = driver.findElements(By.xpath("//li[@data-view-type=\"1\"]"));
		List<WebElement> textoption = driver.findElements(By.xpath
				(" //li[@data-view-type=\"1\"]/div/div[2]/div[1]/div[1]/span"));
		
		int count=textoption.size();
		for(int i=0 ; i<count ; i++)  {
			
			String optionvalue= textoption.get(i).getText();
			System.out.println(optionvalue);
			if(optionvalue.equalsIgnoreCase("Selenium"))
			{
				clickoption.get(i).click();
				}
			else 
			{
				System.out.println("Desired value not found in current iteration");
			}
		}
			driver.quit();
		}
	}
	
//1)we have sent a text
//2)after sending text we have created 2 xpaths
//1. click - it is not giving text 
//2. only text is not clickable thats why we created 2 xpaths
//3)next we have created xpath of list type because we have to save the 
//webelements into list 
//4)then we are iterating through this list and verifying whether we have got our text value or not.
//5)these lines locate the list of autosuggestive options and their 
//corresponding text values.The code then iterates through each option and
//compares its text value with the desired value,the desired value was not
//found in the current iteration.
//6)Quitting the WebDriver.

 

