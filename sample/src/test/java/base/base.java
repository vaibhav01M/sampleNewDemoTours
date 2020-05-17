package base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public static String ProjectLoction = System.getProperty("user.dir");
	public static WebDriver driver ;

	public void initialization(){   // Browser launch + url entering
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java Basic\\DemoProjectWorkspace\\.metadata\\sample\\Driver_Executables\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	
	}
	
	public void tearDown() {
		driver.quit();
	}
	
}
