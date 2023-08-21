package seleniumjavaprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
public class firefox {

	public static void main(String[] args) {
		//set the system property so that the chrome driver is loacted
		System.setProperty("WebDriver.Firefox","D:\firefox\supportingfiles\\setup-stub.exe");
			//create object where chrome browser is located
				WebDriver Driver =new FirefoxDriver();
		//LAunch URl
		Driver.get("https://www.mozilla.org/en-US/firefox/new/");
		
		
	}

}



