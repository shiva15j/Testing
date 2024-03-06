package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		List<WebElement> chk = driver.findElements(By.xpath("//input[@type= 'checkbox']"));

		for (WebElement vl : chk) {
			Thread.sleep(2000);
			vl.click();
		}

		Thread.sleep(3000);
		driver.close();

	}

}
