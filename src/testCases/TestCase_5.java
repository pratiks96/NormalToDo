package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_5 {
   //Dont use this test case
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Photon_Workspace\\ToDoProject\\Drivers\\chromedriver_83.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://todomvc.com/");
		driver.findElement(By.xpath("//a[text()='React']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='What needs to be done?']")).sendKeys(":)"+Keys.ENTER+"ToDo_2"+Keys.ENTER+"ToDo_3"+Keys.ENTER);

	}

}
