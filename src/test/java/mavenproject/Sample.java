package mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		File dataFile = new File("C:\\Users\\ADMIN\\eclipse-workspace\\mavenproject"
				+ "\\src\\test\\resources\\Test Data\\frame.xlsx");
		FileInputStream inputStream = new FileInputStream(dataFile);
		
		
	}
	
}
