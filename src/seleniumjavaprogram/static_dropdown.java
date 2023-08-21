package seleniumjavaprogram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
   public class static_dropdown {

	public static void main(String[] args) {
		//set the system property so that chrome driver is located
		System.getProperty("WebDriver.Chrome.Driver","D:\\Selenium\\Supportingfiles\\chromedriver.exe");
		//create the object of WebDriver interface
		WebDriver driver =new ChromeDriver();
		//Launch URL
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
		Select staticDropdown = new Select(dropdown);
		//staticDropdown.selectByIndex(4);
		//staticDropdown.selectByValue("search-alias=automotive-intl-ship");
		//staticDropdown.selectByVisibleText("Books");
		List<WebElement> dropdownoption = driver.findElements(By.xpath("//select[@id=\"searchDropdownBox\"]/option"));
		int count = dropdownoption.size();
		for(int i =0; i<count; i++)
		{
			staticDropdown.selectByIndex(i);
			driver.quit();
}
}
}
 