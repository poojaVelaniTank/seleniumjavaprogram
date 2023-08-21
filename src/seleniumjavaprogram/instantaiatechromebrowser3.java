package seleniumjavaprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class instantaiatechromebrowser3 {

	public static void main(String[] args) {
		
		//set the system property so that chrome driver located
		System.setProperty("WebDriver.Chrome.Driver","D:\\SeleniumChrome browser"
				+ "\\Supportingfiles\\chromedriver.exe");
		//create object of browser interface
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
		Driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		Driver.findElement(By.id("pass")).sendKeys("123456789");
		Driver.quit();
		
		
	}

}
