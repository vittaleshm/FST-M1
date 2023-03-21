package Activities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Activity5 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002T3N744\\Desktop\\chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

		driver = new ChromeDriver(chromeOptions);
		
		driver.manage().window().maximize();
		
		
		driver.get("https://alchemy.hguy.co/lms");
		
		
		driver.findElement(By.xpath("//*[@href=\"https://alchemy.hguy.co/lms/my-account/\"]")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String S= driver.getTitle();
		System.out.println(S);
		if(S.contains("My Account")) {
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			System.out.println("Matched");
		
		}
		else {
			System.out.println("Not Matched");
		}
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.close();

	}

}
