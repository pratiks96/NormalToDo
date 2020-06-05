package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Photon_Workspace\\ToDoProject\\Drivers\\chromedriver_83.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://todomvc.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("React")).click();
		driver.findElement(By.xpath("//a[text()='React']")).click();
		String title=driver.getTitle();
		System.out.println("Title Of Page"+title);
		driver.close();

	}

}
