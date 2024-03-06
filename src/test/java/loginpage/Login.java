package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.id("user-name"));

		ele.sendKeys("standard_user");

		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("password"));
		ele1.sendKeys("secret_sauce");

		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();

		Thread.sleep(2000);

		String expectedUrl = "https://www.saucedemo.com/inventory.html";

		String actualUrl = driver.getCurrentUrl();

		if (expectedUrl.equals(actualUrl)) {
			System.out.println("Login Sucess");
		} else {
			System.out.println("Incorrect");
		}

		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();

	}

}
