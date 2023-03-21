package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Activity1 {

	public static void main(String[] args) {

		WebDriver driver ;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002T3N744\\Desktop\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

		driver = new ChromeDriver(chromeOptions);
		
		driver.manage().window().maximize();
		driver.get("https://alchemy.hguy.co/lms");
		
		String S =driver.getTitle();
		
		System.out.println(S);
		
		String expected = "Alchemy LMS – An LMS Application";
		
		if (driver.getTitle().contains(expected)) {
			System.out.println("Title Matched");
			
		}
		else {
			System.out.println("Title not matched");
		}
		driver.quit();
		
	}

}
