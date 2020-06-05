package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_3 {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Photon_Workspace\\\\ToDoProject\\\\Drivers\\\\chromedriver_83.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://todomvc.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='React']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='petehunt']")).click();
		String pet=driver.getTitle();
		System.out.println("Pethunt page title="+pet);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='TodoMVC']")).click();
		String toDo=driver.getTitle();
		System.out.println("ToDoMvc page title="+toDo);
		driver.close();
	}

}
