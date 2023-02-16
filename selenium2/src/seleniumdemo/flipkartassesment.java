package seleniumdemo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartassesment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell laptop\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		WebElement searchBox = driver.findElement(By.xpath("//input[@class='_3704LK\']"));
		searchBox.sendKeys("ipad", Keys.ARROW_DOWN.ENTER);
		
		WebElement RAM=driver.findElement(By.xpath("//div[text()='RAM']"));
		RAM.click();
		
		driver.findElement(By.xpath("//div[text()='8 GB']")).click();
		
		driver.findElement(By.xpath("//div[text()='APPLE iPad Pro 2021 (5th Generation) 8 GB RAM 512 GB ROM 12.9 inches with Wi-Fi+5G (Space Grey)']")).click();

        Set<String> allID=driver.getWindowHandles();
		ArrayList<String> AL=new ArrayList<String>(allID);
		driver.switchTo().window(AL.get(1));
		
		WebElement addtocart=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		addtocart.click();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']")).sendKeys("00000000000");
	}
}
