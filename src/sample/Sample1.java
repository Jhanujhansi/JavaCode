package sample;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.jna.platform.FileUtils;






public class Sample1 {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("//a[@href='https://demoqa.com/category/widgets/']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@href='https://demoqa.com/datepicker/']"))).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
