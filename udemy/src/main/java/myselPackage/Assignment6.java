package myselPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement opt = driver.findElement(By.xpath("//label[@for='bmw']"));
		String opttext = opt.getText();
		//System.out.println(opttext);
		WebElement findElement = driver.findElement(By.name("checkBoxOption1"));
		findElement.click();
		
		WebElement drop = driver.findElement(By.id("dropdown-class-example"));
		Select dp= new Select(drop);
		dp.selectByVisibleText(opttext);
		
		driver.findElement(By.name("enter-name")).sendKeys(opttext);
		driver.findElement(By.id("alertbtn")).click();
		String text = driver.switchTo().alert().getText();
	   // System.out.println(text);
		if (text.contains(opttext)) {
			System.out.println("Alert sucess");	
			}
	    driver.switchTo().alert().accept();
	    
		
		
		
	}

}
