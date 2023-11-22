package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cart {

	public static void main(String[] args) {
		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.rokomari.com/book");
	driver.manage().window().maximize();
  WebElement element  = driver.findElement(By.xpath("//*[@id=\"js--authors\"]"));
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
WebElement chosewriter=driver.findElement(By.xpath("//*[@id=\"js--authors-menu\"]/div/div[1]/li[1]/a"));
chosewriter.click();
WebElement viewditails = driver.findElement(By.xpath("//a[contains(@href,\"amader-shada-bari\")]"));
viewditails.click();
WebElement addcart = driver.findElement(By.xpath("//*[@id=\"js--add-to-cart-button\"]"));
addcart.click();
	}
}
