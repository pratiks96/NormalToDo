package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase_6 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Photon_Workspace\\ToDoProject\\Drivers\\chromedriver_83.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://todomvc.com/");
		driver.findElement(By.xpath("//a[text()='React']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='What needs to be done?']")).sendKeys("ToDo_1"+Keys.ENTER+"12345MVC"+Keys.ENTER+"@#$%TODo"+Keys.ENTER);
		WebElement Edit=driver.findElement(By.xpath("//label[text()='ToDo_1']"));
		Actions act=new Actions(driver);
		act.doubleClick(Edit).build().perform();
		driver.findElement(By.cssSelector("body > section > div > section > ul > li:nth-child(1) > input")).sendKeys("ToDo_1_Test"+Keys.ENTER);


	}

}
