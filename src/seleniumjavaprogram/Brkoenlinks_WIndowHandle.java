package seleniumjavaprogram;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
public class Brkoenlinks_WIndowHandle {

	public static void main(String[] args) throws IOException {
		//set the system property so that chrome driver is located
		System.getProperty("WebDriver.Chrome.Driver","D:\\Selenium\\Supportingfiles\\chromedriver.exe");
		//create the object of WebDriver interface
		WebDriver driver =new ChromeDriver();
		driver.get("https://toolsqa.com/");
		driver.manage().window().maximize();
		
//driver.manage().timeouts().
WebDriverWait expWait = new WebDriverWait(driver,Duration.ofSeconds(5));

Actions act = new Actions(driver);
JavascriptExecutor jsp = (JavascriptExecutor) driver;
//scroll to bottom of screen
WebElement scrollTarget= driver.findElement(By.xpath("//div[contains(text(),\"All rights reserved\")]"));
jsp.executeScript("arguments[0].scrollIntoView();", scrollTarget);

//fetch the hyperlinks
List<WebElement> hyperlinks = expWait.until(ExpectedConditions.visibilityOfAllElements
		(driver.findElements
		(By.xpath("//div[text(),\"Recent Tutorials\")]/../ul/li/a"))));
int count = hyperlinks.size();

//open all hyperlinks in new Window
for(int i=0; i<count ;i++)
{
	act.moveToElement(hyperlinks.get(i)).keyDown(Keys.CONTROL).click().build().perform();
	}

//Verify if hyperlinks are opened correctly
Set<String>windows = driver.getWindowHandles();
Iterator<String> windowsIterator = windows.iterator();
windowsIterator.next();

while(windowsIterator.hasNext())
{
	driver.switchTo().window(windowsIterator.next());
	String windowTitle= driver.getTitle();
	windowTitle = windowTitle.replaceAll("[^a-zA-Z0-9]"," ");
	System.out.println(windowTitle);
	
	File ScreenshotSource = ((TakesScreenshot) driver).
	getScreenshotAs(OutputType.FILE);
    File ScreenshotFile = new File("E:\\BrokenLinkScreenshot\\"+windowTitle+".png");
    Files.copy(ScreenshotSource, ScreenshotFile);
    }
driver.quit();
   }
}
