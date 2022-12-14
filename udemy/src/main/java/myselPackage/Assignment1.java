package myselPackage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//select
		WebElement check = driver.findElement(By.cssSelector("#checkBoxOption1"));
		check.click();
		boolean selected = check.isSelected();
		assertTrue(selected);
		//deselect
		check.click();
		boolean selected1 = check.isSelected();
		assertFalse(selected1);

		//count of checkboxes
		int size = driver.findElements(By.cssSelector("label input[type='checkbox']")).size();
		//System.out.println(size);
		if (size==3) {
			assertTrue(true);
		}else {
			assertTrue(false);
		}
	}

}
