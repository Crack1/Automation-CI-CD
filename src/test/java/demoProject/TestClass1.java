package demoProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cicd.demoProject.Utilities;

public class TestClass1 {
	
	Utilities utilities = new Utilities();
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchDriver(){
		System.setProperty(utilities.chromeWebdriver, utilities.webdriverPath);
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	
	@Test
	public void Test1(){
		driver.navigate().to(utilities.urlGoogle);
		System.out.println("Test1 Title: "+ driver.getTitle());
	}
	
	@Test
	public void Test2(){
		driver.navigate().to(utilities.urlGoogle);
		System.out.println("Test2 Title: "+ driver.getTitle());
	}
	
	@Test
	public void Test3(){
		driver.navigate().to(utilities.urlGoogle);
		System.out.println("Test3 Title: "+ driver.getTitle());
	}
	@AfterMethod
	public void Quit(){
		driver.quit();
	}
}
