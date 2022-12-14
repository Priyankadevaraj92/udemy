package myselPackage;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.WithoutBatchStrategy;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement autodp = driver.findElement(By.id("autocomplete"));
		autodp.sendKeys("ind");
		List<WebElement> list = autodp.findElements(By.xpath("//ul[@id='ui-id-1']/li[@class='ui-menu-item']/div"));
	  list.stream().filter(s->s.getText().equalsIgnoreCase("india")).forEach(s->s.click());
/*
		
		for (WebElement auto : list) {
			String text = auto.getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("india")) {
				auto.click();			
				break;}
		}
		*/
driver.quit();
		
	}

	private static Object With(By tagName) {
		// TODO Auto-generated method stub
		return null;
	}
}
