package Activities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Activity6 {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002T3N744\\Desktop\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");

		driver = new ChromeDriver(chromeOptions);

		driver.manage().window().maximize();

		driver.get("https://alchemy.hguy.co/lms");

		driver.findElement(By.xpath("//*[@href=\"https://alchemy.hguy.co/lms/my-account/\"]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@href=\"#login\"]")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("wp-submit")).click();

		if (driver.findElement(By.xpath("//*[@class=\"ld-logout ld-logout ld-login-text ld-login-button ld-button\"]"))
				.isDisplayed()) {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("logged in successfully");
		} else {
			System.out.println("login failed");
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
	}

}
