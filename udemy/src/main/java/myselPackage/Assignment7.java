package myselPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,600)");

		WebElement table = driver.findElement(By.className("table-display"));
		int rowsNo = table.findElements(By.tagName("tr")).size();
		System.out.println("No.of rows = "+rowsNo);
		int colSize = table.findElements(By.tagName("th")).size();
		System.out.println("No of Columns = "+colSize);
		//List<WebElement> row4 =
		List<WebElement> row2 = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		for (WebElement row : row2) {
			System.out.println(row.getText());
		}


	}

}
