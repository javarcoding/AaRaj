package rcvAcadamy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial14_BasicMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title=="+driver.getTitle());
		System.out.println("Currrent URL=="+driver.getCurrentUrl());
		driver.close();

	}

}
