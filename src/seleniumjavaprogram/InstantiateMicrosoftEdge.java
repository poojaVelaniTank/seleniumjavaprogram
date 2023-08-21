package seleniumjavaprogram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class InstantiateMicrosoftEdge {

	public static void main(String[] args) {
		//set the system property so that chrome driver is located
		System.setProperty("WebDriver.MicrosoftEdge","D:\\MicrosoftEDge\\Supportingfiles\\"
				+ "MicrosoftEdgeSetup.exe");
		//create object of browser interface
		WebDriver Driver =new EdgeDriver();
		
		//Launch URL
		Driver.get("https://www.microsoft.com/en-us/edge?form=MA13FJ&exp=e00");

	}

}


