package myselPackage;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		//      driver.findElement(By.xpath("//tr/th[1]")).click();
		//		List<WebElement> firstcol = driver.findElements(By.xpath("//tr/td[1]"));
		//
		//		List<String> list = firstcol.stream().map(s->s.getText()).collect(Collectors.toList());
		//		//System.out.println(list);
		//		List<String> sorted = list.stream().sorted().collect(Collectors.toList());
		//		//System.out.println(sorted);
		//		assertEquals(list, sorted);

		// click to extract text from table in all pages by clicking next btn

		//		while (true){
		//			List<WebElement> firstcol = driver.findElements(By.xpath("//tr/td[1]"));
		//			List<String> list = firstcol.stream().map(s->s.getText()).collect(Collectors.toList());
		//			System.out.println(list);
		//			if (!driver.findElement(By.xpath("//ul/li[7]")).getAttribute("class").equalsIgnoreCase("disabled")) {
		//				WebElement nextbtn = driver.findElement(By.xpath("//ul/li[7]"));
		//				nextbtn.click();
		//			}else 
		//				break;
		//		}


		//type rice in search and extract the text from table

		driver.findElement(By.id("search-field")).sendKeys("rice",Keys.ENTER);

		long pages = driver.findElements(By.xpath("//ul/li")).stream().filter(s->s.getAttribute("class").equals("active")).count();;
		//System.out.println(pages);
		while (pages>0) {
			List<WebElement> firstcol1 = driver.findElements(By.xpath("//tr/td[1]"));
			for (WebElement each : firstcol1) {
				if (each.getText().contains("Rice")) {
					WebElement col2 = driver.findElement(By.xpath("//tr/td[2]"));
					System.out.println(col2.getText());
					break;
				} else {
					WebElement nextbtn = driver.findElement(By.xpath("//ul/li[7]"));
					nextbtn.click();
				} }
			break;
		}}


}