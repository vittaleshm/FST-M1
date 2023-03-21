package Activities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.Timeout;

public class Activity4 {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002T3N744\\Desktop\\chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

		driver = new ChromeDriver(chromeOptions);
		
		driver.manage().window().maximize();
		
		
		driver.get("https://alchemy.hguy.co/lms");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		js.executeScript("window.scrollBy(0,1000)", "");
		
	String S =	driver.findElement(By.xpath("//*[@class=\"entry-title\"][.= 'Email Marketing Strategies']")).getText();
		System.out.println(S);
		if(S.contains("Email Marketing Strategies")) {
			System.out.println("Matched");
		
		}
		else {
			System.out.println("Not Matched");
		}
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.close();
		
	}
	

}
