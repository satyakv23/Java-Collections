package multiplewindowhandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandle {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	//	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\Selenium Downloads\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://learn-automation.com/handle-multiple-windows-in-selenium-webdriver/");
		
		

	}

}
