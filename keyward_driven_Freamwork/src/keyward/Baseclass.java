package keyward;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.seleniumhq.jetty9.server.handler.ContextHandler.StaticContext;
import org.testng.annotations.Test;

public class Baseclass {

	public static WebDriver driver;

	public static void m1(String browser) {
		/**
		 * open specific web browser
		 * 
		 * @param name browser name should include ,Chrome ,firefox is only allowed
		 */

		switch (browser) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver",
					"D:\\Selinium practice\\seliniumdemo\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					"D:\\Selinium practice\\seliniumdemo\\drivers\\geckodriver-v0.26.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver",
					"D:\\Selinium practice\\seliniumdemo\\drivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

			break;

		default:
			System.out.println("browser is not avaliable please select ====    " + browser);
			break;
		}

	}
	/**
	 * it open a specifide url of the browser resented opened by the driver
	 * instance.
	 * 
	 * @param url{@code string } url to open.
	 * @return void
	 */
	public static void OpenUrl(String url) {
		driver.get(url);

	}

	public static WebElement WebElements(String locaters, String locaterValue) {

		WebElement element = null;
		switch (locaters) {

		case "XPATH":
			element = driver.findElement(By.xpath(locaterValue));

			break;
		case "id":
			element = driver.findElement(By.id(locaterValue));
			break;
		case "link":
			element = driver.findElement(By.linkText(locaterValue));
			break;

		}
		return element;

	}

	public static void FindElements_Sendkeys(String locaters, String locaterValue, String keys) {

		WebElements(locaters, locaterValue).sendKeys(keys);

	}

	public static void Click(String locaters, String locaterValue) {

		WebElements(locaters, locaterValue).click();

	}

	public static void WindowsMximize() {
		driver.manage().window().maximize();

	}

	public static void WindowsClose() {
		driver.close();
	}
}