package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Activity3 {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002T3N744\\Desktop\\chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

		driver = new ChromeDriver(chromeOptions);
		
		driver.manage().window().maximize();
		
		
		driver.get("https://alchemy.hguy.co/lms");
		
		
	String S =	driver.findElement(By.xpath("//*[@class=\"uagb-ifb-title\"][.= ' Actionable Training ']")).getText();
		System.out.println(S);
		if(S.contains("Actionable Training")) {
			System.out.println("Matched");
		
		}
		else {
			System.out.println("Not Matched");
		}
		
		
		driver.close();
		
	

		
	}

}
