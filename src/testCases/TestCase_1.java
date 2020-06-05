package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCase_1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Photon_Workspace\\ToDoProject\\Drivers\\chromedriver_83.exe");		
		WebDriver Cd=new ChromeDriver();
		Cd.get("http://todomvc.com/");
		String url=Cd.getCurrentUrl();
		System.out.println("Chromedriver Url="+url);
		Cd.close();
		Thread.sleep(3000);
		
		System.setProperty("webdriver.gecko.driver", "E:\\Photon_Workspace\\ToDoProject\\Drivers\\geckodriver.exe");
		WebDriver Ff=new FirefoxDriver();
		Ff.get("http://todomvc.com/");
		String url1=Ff.getCurrentUrl();
		System.out.println("FireFox Url="+url1);
		Ff.close();
		Thread.sleep(3000);
		
		System.setProperty("webdriver.ie.driver", "E:\\Photon_Workspace\\ToDoProject\\Drivers\\IEDriverServer.exe");
		WebDriver Ie=new InternetExplorerDriver();
		Ie.get("http://todomvc.com/");
		String url2=Ie.getCurrentUrl();
		System.out.println("FireFox Url="+url2);

		
	}

}
