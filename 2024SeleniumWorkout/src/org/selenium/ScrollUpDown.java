package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my lap\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.google.com");
		
		driver.get("https://www.google.com/search?q=redbus&sca_esv=601657676&ei=q1WzZbnzDYKSseMP28ilgAw&gs_ssp=eJzj4tLP1TcwM403SUpXYDRgdGDwYitKTUkqLQYASIEGPg&oq=red&gs_lp=Egxnd3Mtd2l6LXNlcnAiA3JlZCoCCAAyFxAuGIAEGIoFGJECGLEDGIMBGMcBGNEDMgoQLhiABBiKBRhDMgoQABiABBiKBRhDMhAQABiABBiKBRhDGLEDGIMBMgoQLhiABBiKBRhDMgoQABiABBiKBRhDMggQABiABBixAzIKEAAYgAQYigUYQzILEC4YsQMYgAQY5QQyCxAuGIAEGLEDGOUEMiYQLhiABBiKBRiRAhixAxiDARjHARjRAxiXBRjcBBjeBBjgBNgBAkjsLVDQF1joGXACeAGQAQCYAe0BoAHcBKoBBTAuMi4xuAEDyAEA-AEBqAIKwgIWEAAYAxiPARjlAhjqAhi0AhiMA9gBAcICFhAuGAMYjwEY5QIY6gIYtAIYjAPYAQHCAgsQABiABBiKBRiRAsICDhAAGIAEGIoFGLEDGIMBwgIREC4YgAQYsQMYgwEYxwEY0QPCAgsQLhiABBixAxiDAcICBRAuGIAE4gMEGAAgQboGBAgBGAq6BgYIAhABGBQ&sclient=gws-wiz-serp");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(300);
		
		
		
		// Method 1
		//jse.executeScript("window.scrollbBy(0,1000)");
		
		// Method 3
		//jse.executeScript("window. scrollTo(0,document.body.scrollHeight)");
		
		// Method 3
		WebElement num1 = driver.findElement(By.xpath("(//a[@class=\"l\"])[1]"));
		num1.click();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement scrolldown = driver.findElement(By.xpath("//h2[@class=\"AboutUs__Heading-w9osof-3 lmIkvI\"]"));
		jse.executeScript("arguments[0].scrollIntoView();",scrolldown);
		
		Thread.sleep(3000);
		WebElement num2 = driver.findElement(By.xpath("(//div[@class=\"AboutUs__BusinessText-w9osof-6 WKmnh\"])[2]"));
		num2.click();
		
		Thread.sleep(3000);
		WebElement scrollup = driver.findElement(By.xpath("//button[@class=\"sc-dxgOiQ iztAdt\"]"));
		jse.executeScript("arguments[0]. scrollIntoView();",scrollup);
		
		
		
		
		
		
	}

}
