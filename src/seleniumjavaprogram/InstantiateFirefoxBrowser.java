package seleniumjavaprogram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
public class InstantiateFirefoxBrowser {

	public static void main(String[] args) {
	//set the system property so that chrome driver is located
   System.setProperty("WebDriver.Firefox","D:\firefox\supportingfiles\\setup-stub.exe");
   //create object of browser interface
   WebDriver Driver = new FirefoxDriver();
	
   //Launch URL
   Driver.get("https://www.mozilla.org/en-US/firefox/new/");
	}
}



