package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHscBiggan {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.rokomari.com/book");
	driver.manage().window().maximize();
	
	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"js--fiction-category\"]"));
	Select select = new Select(dropdown);
	select.selectByVisibleText("বিজ্ঞান প্রথম বর্ষ পাঠ্য বই");
	Thread.sleep(3000);
	select.selectByValue("6837");
	Thread.sleep(3000);
	select.selectByIndex(3);
	Thread.sleep(5000);
driver.close();
	}

}
