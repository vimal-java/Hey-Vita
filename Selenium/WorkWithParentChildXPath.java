package homework;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithParentChildXPath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_V83.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Using parent - child
		
		String month = driver.findElementByXPath("(//select[@title='Month']/option)[11]").getText();
		
		System.out.println(month);
		
		//Using parent - last child
		
		String lastMonthOfCalendar = driver.findElementByXPath("(//select[@title='Month']/option)[last()]").getText();
		
		System.out.println(lastMonthOfCalendar);
		
		//Using child - parent
		
		String year = driver.findElementByXPath("(//option[text()='1959'])/parent::select").getAttribute("name");
		
		System.out.println(year);
		
		//Using child - grandparent
		
		String attribute = driver.findElementByXPath("(//option[text()='1959'])/ancestor::span").getAttribute("data-name");
		
		System.out.println(attribute);
		
		driver.close();
		
	}

}
