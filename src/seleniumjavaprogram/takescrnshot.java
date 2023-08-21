package seleniumjavaprogram;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class takescrnshot {

	public static void main(String[] args) throws IOException  {
   System.setProperty("WebDriver.ChromeDriver","D:\\SeleniumChrome browser\\Supportingfiles\\chromedriver.exe");
   WebDriver driver= new ChromeDriver();
   driver.get("https://www.google.com/");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   String pagetitle=driver.getTitle();
   pagetitle=pagetitle.replaceAll(".","");
   System.out.println(pagetitle);
   
   File screenshotSource=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
   File screenshotfile=new File("C:\\Users\\Mites\\OneDrive\\Documents\\Screenshot\\"+pagetitle+".png");
   Files.copy(screenshotSource, screenshotfile);

}
}
