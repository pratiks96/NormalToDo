package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Photon_Workspace\\ToDoProject\\Drivers\\chromedriver_83.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://todomvc.com/");
		driver.findElement(By.xpath("//a[text()='React']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='What needs to be done?']")).sendKeys("I am Text"+Keys.ENTER+"12345"+Keys.ENTER+"@#$%"+Keys.ENTER+"I am 57#%"+Keys.ENTER);

	}

}
