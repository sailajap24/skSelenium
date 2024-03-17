package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {

	public static void main(String[] args){
		//To launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the given url
		driver.get("C:\\TestHtmlPage.html");

		//Maximize current window
		driver.manage().window().maximize();

		//identify the elements using Id locator
		WebElement fName = driver.findElement(By.id("fname"));
		fName.clear();
		fName.sendKeys("Sailaja");

		WebElement lName = driver.findElement(By.id("lname"));
		lName.clear();
		lName.sendKeys("Kamineni");
		
		//Identify the elements using name locator
		WebElement objCheckbox = driver.findElement(By.name("newsletter"));
		objCheckbox.click();
		
		//Identify the elements using linktext
		WebElement objLink = driver.findElement(By.linkText("Selenium Official Page"));
		objLink.click();		
		
		//Identify the elements using partial link text
		//WebElement objLink1 = driver.findElement(By.partialLinkText("Official Page"));
		//objLink1.click();		
		
		//Identify the elements using tag name
		List<WebElement> objFName = driver.findElements(By.tagName("input"));
		objFName.get(0).click();
		
		//Identify the elements using xpath
		//WebElement objName = driver.findElement(By.xpath("//input[@value='f']"));
		//objName.click();
		
		//Identify the elements using css locators
		//WebElement objName = driver.findElement(By.cssSelector("#fname"));
		//objName.click();		
	}
}
