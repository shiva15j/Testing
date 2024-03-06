package drpdowndemo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws Exception {

		ScreenRecorderUtil.startRecord("main");

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.name("fromPort"));

		Select slt = new Select(ele);

		slt.selectByValue("Portland");
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.name("toPort"));

		Select slt1 = new Select(ele1);

		slt1.selectByValue("New York");

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		

		TakesScreenshot sc = ((TakesScreenshot) driver);
		File src = sc.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\screenshot\\flight.png");
		FileUtils.copyFile(src, f2);

		driver.close();

		ScreenRecorderUtil.stopRecord();

	}

}
