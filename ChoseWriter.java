package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChoseWriter {

	public static void main(String[] args) {

		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.rokomari.com/book");
	driver.manage().window().maximize();
  WebElement element  = driver.findElement(By.xpath("//*[@id=\"js--authors\"]"));
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();


	}

}
