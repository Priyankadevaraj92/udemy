 package myselPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
@Test
	public static void main() {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
ChromeDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://letcode.in/");
driver.findElement(By.linkText("Log in")).click();
driver.findElement(By.name("email")).sendKeys("priyavinu92@gmail.com",Keys.TAB);
driver.findElement(By.name("password")).sendKeys("Passw0rd$",Keys.TAB);
driver.findElement(By.xpath("//button[text()='LOGIN']")).click();

	}}
