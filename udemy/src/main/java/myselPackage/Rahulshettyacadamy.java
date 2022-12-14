package myselPackage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.Listener;

public class Rahulshettyacadamy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.cssSelector("input[value='radio1']")).click();

WebElement auto = driver.findElement(By.id("autocomplete"));
auto.sendKeys("fra");
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//Select dropdown=new Select(auto);
List<WebElement> lists = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("li[class='ui-menu-item']")));
for (WebElement list : lists) {
	String singlecountry = list.getText();
	if (singlecountry.equalsIgnoreCase("France")) {
		list.click();
		break;
	}
}
WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
Select dp= new Select(dropdown);
dp.selectByVisibleText("Option2") ;
WebElement check = driver.findElement(By.id("checkBoxOption3"));
check.click();
System.out.println(check.isSelected());

driver.findElement(By.id("name")).sendKeys("priya");
driver.findElement(By.id("alertbtn")).click();
Alert alert = driver.switchTo().alert();
alert.accept();

driver.findElement(By.id("openwindow")).click();
String windowHandle = driver.getWindowHandle();
System.out.println(windowHandle);
Set<String> windowHandles = driver.getWindowHandles();
/*Iterator<String> it = windowHandles.iterator();
String child = it.next();
System.out.println(child);
String parent = it.next();
System.out.println(parent);
System.out.println( driver.switchTo().window(child).getTitle());
System.out.println(driver.switchTo().window(parent).getTitle());*/

ArrayList<String> list=new ArrayList<String>(windowHandles);
//List<String> list= new ArrayList<String>(windowHandles);
for (String eachwin : list) {
	System.out.println(eachwin);
}
String parent = list.get(0);
System.out.println(parent);
System.out.println(driver.switchTo().window(list.get(0)).getTitle());
System.out.println(driver.switchTo().window(list.get(1)).getTitle());
driver.close();
driver.switchTo().window(list.get(0));
System.out.println(driver.getCurrentUrl());
driver.findElement(By.id("opentab")).click();
Set<String> windowHandles2 = driver.getWindowHandles();
List<String> list2= new ArrayList<String>(windowHandles2);
for (String eachwin2 : windowHandles2) {
	System.out.println(eachwin2);
	
}
driver.switchTo().window(list2.get(0)).getTitle();
driver.switchTo().window(list2.get(1)).getTitle();
driver.close();
//driver.quit();
	}

}
