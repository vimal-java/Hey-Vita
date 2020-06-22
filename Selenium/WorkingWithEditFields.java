package homework;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithEditFields {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_V83.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		//normal send keys
		
		driver.findElementById("email").sendKeys("vimalsam007@gmail.com");
		
		//Append values and press tab key
		
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("added",Keys.TAB);
		
		//get the attribute value of a tag
		
		String output = driver.findElementByName("username").getAttribute("value");
		
		System.out.println(output);
		
		//clear the existing text
		
		driver.findElementByXPath("(//input[@name='username'])[2]").clear();
		
		//verify whether the input is enabled or false
		
		boolean condition = driver.findElementByXPath("(//input[@type='text' and @disabled ='true'])").isEnabled();
		
		System.out.println(condition);
		
		driver.close();

	}

}
