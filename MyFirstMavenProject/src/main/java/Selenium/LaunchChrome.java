package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http:www.google.com");
		System.out.println(driver.getTitle());
		// adding some comments just to see how the changes in this branch will reflect in github 
		// when ever the changes did , in the eclipse or under the Maven file structure , the file changed will be preceeded by a > symbol
	// means the changes has to yet to be committed
	
	}

}
