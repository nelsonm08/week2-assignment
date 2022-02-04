package week2.day2.assignment1;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


	public class Facebook {
		
		public static void main(String[] args) throws InterruptedException  {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
		
			driver.findElement(By.linkText("Create New Account")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("nelson");
			driver.findElement(By.xpath("//input[@name ='lastname']")).sendKeys("m");
			driver.findElement(By.xpath("//input[@name ='reg_email__']")).sendKeys("9789878054");
			driver.findElement(By.xpath("//input[@id ='password_step_input']")).sendKeys("nelsonm");
			WebElement day = driver.findElement(By.xpath("//select[@name ='birthday_day']"));
			Select day1 = new Select(day);
			day1.selectByValue("18");
			WebElement month = driver.findElement(By.xpath("//select[@id ='month']"));
			Select month1 = new Select(month);
			month1.selectByVisibleText("Apr");
			WebElement year = driver.findElement(By.xpath("//select[@id ='year']"));
			Select year1 = new Select(year);
			year1.selectByValue("2001");
			driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		}

	}

