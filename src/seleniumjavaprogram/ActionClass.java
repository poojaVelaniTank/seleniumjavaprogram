package seleniumjavaprogram;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionClass {
	public static void main(String[] args) {
		
		//set the system property so that chrome driver is located
				System.getProperty("WebDriver.Chrome.Driver","D:\\Selenium\\Supportingfiles\\chromedriver.exe");
				//create the object of WebDriver interface
				WebDriver driver =new ChromeDriver();
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				
		//Step 1 : Create an object of Actions class
		Actions act = new Actions(driver);
	
		//Step 2 : Automate mouse hover
		/*WebElement hovertestelement = driver.findElement(By.xpath("//span[text()="Sign in"]"));
		act.moveToElement(hovertestelement).build().perform();*/
		
		//Step 3 : Automate right click 
		/*WebElement rightclicktestelement = driver.findElement(By.xpath("//span[text()=\"Account & Lists\"]/.."));
		act.moveToElement(rightclicktestelement).contextClick().build().perform();*/
		
		//Step 4 : Automate Double Click 
		/*WebElement doubleclicktestelement = driver.findElement(By.xpath("//span[text()=\"Next slide\"]/.."));
		act.moveToElement(doubleclicktestelement).doubleClick().build().perform();*/
		
		//Step 5 : Automate sending keys in upper case using shift
		WebElement searchtextbox = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		act.moveToElement(searchtextbox).click().keyDown(Keys.SHIFT).sendKeys("iPhOne").build().perform();
		}
}
