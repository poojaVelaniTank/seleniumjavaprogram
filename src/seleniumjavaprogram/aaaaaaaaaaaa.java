package seleniumjavaprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class aaaaaaaaaaaa {

	public static void main(String[] args) {
 //set the system property so that the	chrome driver is located
		System.getProperty("WebDriver.Chrome.Driver","D:\\SeleniumChrome browser\\Supportingfiles");
	//create the object of WebDriver interface
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
//Step1: create an object of Actions class
		Actions act = new Actions(driver);
		
//Step2: Automate mouse hover
WebElement hovertestelement = driver.findElement(By.xpath("//span[text()=\"Sign in\"]"));
act.moveToElement(hovertestelement).build().perform();

//STep3: Automate right click
WebElement rightclicktestelement = driver.findElement(By.xpath("//a[text()=\"Customer Service\"]"));
act.moveToElement(rightclicktestelement).contextClick().build().perform();

//STep4: Automate double click 
WebElement nextslidearrow= driver.findElement(By.xpath("//span[text()=\"Next slide\"]/.."));
act.moveToElement(nextslidearrow).doubleClick().build().perform();

//Step5: Automate sending keys in upper case using shift
WebElement searchtextbox= driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
act.moveToElement(searchtextbox).click().keyDown(Keys.SHIFT).sendKeys("iphone").build().perform();
}
}