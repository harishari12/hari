package org.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsDefinitions {
	WebDriver driver;
	
	@Given(" Facebook URL is Launched")
	public void facebook_url_is_launched() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");	
		
		
		
		
		
	}
	
	

}
