package homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithButtons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_V83.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/home.html");
		
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		
		//Click on a text
		
		driver.findElementByXPath("//h5[text() ='Button']").click();
		
		//Click a button
		
		driver.findElementByXPath("//button[contains(text(),'Go')]").click();
		
		driver.findElementByXPath("//h5[text() ='Button']").click();
		
		
		// get the location of the button
		Point location = driver.findElementByXPath("//button[text() ='Get Position']").getLocation();
		
		System.out.println(location);
		
		//get the color of the button
		String color = driver.findElementByXPath("//button[text() ='What color am I?']").getCssValue("background-color");
		
		System.out.println(color);
		
		//get the size of the button
		Dimension size = driver.findElementByXPath("//button[text() ='What is my size?']").getSize();
		
		System.out.println(size);
		
		driver.quit();
		
	}

}
