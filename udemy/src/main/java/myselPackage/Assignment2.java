package myselPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import static org.openqa.selenium.support.locators.RelativeLocator.*;



public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("Priyanka");
		driver.findElement(By.name("email")).sendKeys("Priyavinu92@gmail.com");
		driver.findElement(By.name("name")).sendKeys("password");
		WebElement check = driver.findElement(By.id("exampleCheck1"));
		check.click();
		
		//relative locator
		String nametxt = driver.findElement(with(By.tagName("label")).above(name)).getText();
		System.out.println(nametxt);
		String checktext = driver.findElement(with(By.tagName("label")).toRightOf(check)).getText();
		System.out.println(checktext);

		WebElement dp = driver.findElement(By.id("exampleFormControlSelect1"));
		Select ss= new Select(dp);
		ss.selectByVisibleText("Female");		
		driver.findElement(By.cssSelector("div[class='form-check form-check-inline'] input[id='inlineRadio2']")).click();
		driver.findElement(By.name("bday")).sendKeys("04/23/1992");
		driver.findElement(By.className("btn-success")).click();
		String text = driver.findElement(By.className("alert-success")).getText();
		System.out.println(text);
		driver.quit();



}
}