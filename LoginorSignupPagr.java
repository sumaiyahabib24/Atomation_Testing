package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginorSignupPagr {

	public static void main(String[] args) {
		
		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.rokomari.com/login");
	driver.findElement(By.xpath("//*[@id=\"js--login-form\"]/div[2]/div/div/input[2]")).sendKeys("sumaiyahabib2323@gmail.com");
	driver.findElement(By.id("js--btn-next")).click();
	  String otpValue = "3979";
	  driver.findElement(By.xpath("//*[@id=\"otp-login-form\"]/div[1]/div/input")).sendKeys(otpValue);
 driver.findElement(By.xpath("//*[@id=\"otp-login-form\"]/button")).click();
 driver.findElement(By.xpath(" //*[@id=\"menu_author\"]/a/text()")).click();
	driver.close();	
		

	}
	}

