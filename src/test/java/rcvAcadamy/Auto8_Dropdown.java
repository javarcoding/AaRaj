package rcvAcadamy;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Auto8_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	 
		try {
			driver.get("https://www.facebook.com");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[text()=\"English (UK)\"]"));
			driver.findElement(By.xpath("//*[text()=\"Create New Account\"]")).click();
			
			driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("hello");
			driver.findElement(By.xpath("//*[@name=\"lastname\"]")).sendKeys("Fine");
			driver.findElement(By.xpath("//*[@name=\"reg_email__\"]")).sendKeys("6987456321");
			driver.findElement(By.xpath("//*[@name=\"reg_passwd__\"]")).sendKeys("!@abcde123");
			
			Select sel=new Select(driver.findElement(By.id("day")));
			sel.selectByIndex(10);
			System.out.println(sel.isMultiple());
			List<WebElement> listdays=sel.getOptions();
			System.out.println(listdays.size());
			int TotalDays=listdays.size()-1;
			System.out.println("TotalDays are="+TotalDays);
			 
				
			
			
			Thread.sleep(3000);
		
			Select sel1=new Select(driver.findElement(By.xpath("//*[@name=\"birthday_month\"]")));
			sel1.selectByValue("2");
			Thread.sleep(3000);
			Select sel3=new Select(driver.findElement(By.xpath("//*[@name=\"birthday_year\"]")));
			sel3.selectByValue("1995");
			Thread.sleep(3000);
			
			
			driver.findElement(By.xpath("//input[@name=\"sex\" and @value=\"2\"]")).click();
			
		} catch (Exception e) {
			System.out.println("e");
		}finally {
			driver.close();
		}	
	}
}
