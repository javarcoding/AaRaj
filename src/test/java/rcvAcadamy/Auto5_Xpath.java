package rcvAcadamy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto5_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("Adsul123");
		driver.findElement(By.xpath("//*[@id=\"pass\" and @data-testid=\"royal_pass\"]")).sendKeys("123");
		//driver.findElement(By.xpath(""))

	}

}
