package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase_4 {
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Photon_Workspace\\ToDoProject\\Drivers\\chromedriver_83.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://todomvc.com/");
		driver.findElement(By.xpath("//a[text()='React']")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@placeholder='What needs to be done?']")).sendKeys("ToDo_1"+Keys.ENTER+"ToDo_2"+Keys.ENTER+"ToDo_3"+Keys.ENTER);
		
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.xpath("//input[@placeholder='What needs to be done?']")).sendKeys("ToDo"+i);
			
			Actions act=new Actions(driver);
			act.sendKeys(Keys.ENTER).perform();
		}
		
		
		//driver.get("https://www.google.com/");
		//driver.findElement(By.name("q")).sendKeys("software testing"+Keys.ENTER);
//		element.sendKeys("Ok");
//		element.sendKeys(Keys.ENTER);
		
	}

}
