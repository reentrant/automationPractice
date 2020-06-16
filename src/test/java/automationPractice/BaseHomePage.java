package automationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseHomePage {

	private final static int TIMEOUT = 30;
	private final static int PAGE_LOAD_TIMEOUT = 50;
	private static WebDriver driver;

	public BaseHomePage() {
		WebDriverManager.chromedriver().setup();
		if (driver == null) {
			driver = new ChromeDriver();
			WebDriverWait waitDriver = new WebDriverWait(driver, TIMEOUT);
			driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		}
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void openUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

}
