package Seneroi_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Gobibo {
	public static WebDriver  driver;
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium practice\\seliniumdemo\\drivers\\chrome\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		 System.out.println("iyyt");
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("oijouh");
		
	}



}