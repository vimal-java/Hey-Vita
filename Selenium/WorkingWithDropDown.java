package homework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_V83.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Select dropdown value by index
		
		WebElement dd1 = driver.findElementById("dropdown1");
		
		Select src = new Select(dd1);
		
		src.selectByIndex(1);
		
		//Select dropdown value by visible text
		
		WebElement dd2 = driver.findElementByName("dropdown2");
		
		Select src2 = new Select(dd2);
		
		src2.selectByVisibleText("Appium");
		
		//Select dropdown value using byvalue
		
		WebElement dd3 = driver.findElementById("dropdown3");
		
		Select src3 = new Select(dd3);
		
		src3.selectByValue("3");
		
		//Print all the values in dropdown and get its size
		
		WebElement dd4 = driver.findElementByClassName("dropdown");
		
		Select src4 = new Select(dd4);
		
		List<WebElement> options = src4.getOptions();
		
		int size = options.size();
		
		System.out.println(size);
		
		//Using foreach
		
		for (WebElement ddlist : options) {
			
			System.out.println(ddlist.getText());
			
		}
		
		
		//Using for loop
		
		for (int i = 0; i < size; i++) {
			
			String usingFor = options.get(i).getText();
			
			System.out.println("Ouput using for loop is"+usingFor);
			
		}
		
		
		//Send keys wont work with select tags
		
		//driver.findElementByXPath("(//div[@class='example'])[5]//option[2]").sendKeys("Loadrunner");
		
		driver.close();
		
		
	}

}
