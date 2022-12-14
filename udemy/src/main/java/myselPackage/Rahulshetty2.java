package myselPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

public class Rahulshetty2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.manage().window().maximize();
/*
WebElement showHide = driver.findElement(By.name("show-hide"));
showHide.sendKeys("Hiii");
driver.findElement(By.id("hide-textbox")).click();
System.out.println(showHide.isDisplayed());
driver.findElement(By.id("show-textbox")).click();
System.out.println(showHide.isDisplayed());

JavascriptExecutor jse=(JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,400)");

WebElement mousehover = driver.findElement(By.id("mousehover"));
Actions builder= new Actions(driver);
builder.moveToElement(mousehover).perform();
List<WebElement> mHlist = driver.findElements(By.xpath("//div[@class='mouse-hover-content']/a"));
for (WebElement mHText : mHlist) {
	String mHt = mHText.getText();
	System.out.println(mHt);
	if (mHt.equalsIgnoreCase("reload") ) {
		mHText.click();
		break;
	}
}
WebElement coursesTable = driver.findElement(By.name("courses"));
List<WebElement> allheader = coursesTable.findElements(By.tagName("th"));
for (WebElement header : allheader) {
	String headertext = header.getText();
	System.out.println(headertext);
}

List<WebElement> tableText = coursesTable.findElements(By.tagName("td"));
for (WebElement headert : tableText) {
	String headertext1 = headert.getText();
	System.out.println(headertext1);
}


JavascriptExecutor jse1=(JavascriptExecutor) driver;
jse1.executeScript("window.scrollBy(0,500)");
jse1.executeScript("document.querySelector('.tableFixHead').scrollTop=500");

List<WebElement> row4 = driver.findElements(By.xpath("//div/table[@id='product']/tbody/tr/td[4]"));
int total=0;
for (WebElement eachrow : row4) {
	String row4text = eachrow.getText();
	//System.out.println(row4text);
	int parseIntval = Integer.parseInt(row4text);
	total=total+parseIntval;
}System.out.println("total value= "+total);


WebElement frame = driver.findElement(By.id("courses-iframe"));
driver.switchTo().frame(frame);
driver.findElement(By.linkText("Courses")).click();
driver.switchTo().defaultContent();

WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
int noOfLinks = footerdriver.findElements(By.tagName("a")).size();
System.out.println(noOfLinks);
*/
List<WebElement> links = driver.findElements(By.xpath("//tr/td[1]//a"));
int noOfFooterLinks = links.size();
for (int i = 1; i < noOfFooterLinks; i++) {
	links.get(i).sendKeys(Keys.DOWN,Keys.CONTROL,Keys.ENTER);
	//links.get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER)); 
}

/*for (WebElement link : links) {
System.out.println(link.getText());
String chord = Keys.chord(Keys.CONTROL,Keys.ENTER);
link.sendKeys(chord);
//link.sendKeys(Keys.CONTROL,Keys.ENTER);
}*/

String windowHandle = driver.getWindowHandle();
System.out.println(windowHandle);
String title = driver.getTitle();
System.out.println(title);
Set<String> windowHa = driver.getWindowHandles();
List<String> wins= new ArrayList<String>(windowHa);
int size1 = windowHa.size();
for (String win : windowHa) {
	driver.switchTo().window(win);
	String title2 = driver.getTitle();
	System.out.println(title2);
	if (!title2.equals(title)) {
		//System.out.println("winId- "+ win);
		//System.out.println("winTitle- "+ driver.getTitle());
		
		//driver.getCurrentUrl();
		driver.close();
	}
}





//	driver.quit();
	
}}