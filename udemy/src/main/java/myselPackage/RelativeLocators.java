package myselPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;


public class RelativeLocators {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();

		//		WebElement nameEditBox =driver.findElement(By.cssSelector("[name='name']"));
		//		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		//
		//		WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		//		driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
		//
		//		WebElement iceCreamLabel =driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		//		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();
		//
		//		WebElement rdb = driver.findElement(By.id("inlineRadio1"));
		//		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());

		//   driver.switchTo().newWindow(WindowType.TAB);   //-->this will invoke new tab
		driver.switchTo().newWindow(WindowType.WINDOW);  //-->this will invoke new window
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWin = it.next();
		String childWin = it.next();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentWin);
		System.out.println(driver.getTitle());

		//Screenshot
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("hi");
		File file=name.getScreenshotAs(OutputType.FILE);

		// FileUtils.copyFile(file, new File("logo.png"));
		try {
			FileHandler.copy(file, new File("logo.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.quit();

		//GEt Height & Width
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());

		
		driver.quit();
	}



}
