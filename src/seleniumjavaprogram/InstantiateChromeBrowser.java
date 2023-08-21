package seleniumjavaprogram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class InstantiateChromeBrowser {

	public static void main(String[] args) {
		//set the system property so that chrome driver is located
		System.setProperty("WebDriver.Chrome.Driver","D:\\Selenium\\Supportingfiles\\chromedriver.exe");
		//create object of browser interface
		WebDriver Driver=new ChromeDriver();
		
		//Launch URL
		Driver.get("https://www.amazon.in/");
		

	}

}
