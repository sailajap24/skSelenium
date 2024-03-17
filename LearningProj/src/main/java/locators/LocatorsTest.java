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

/*
package assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusAppTest {
	//WebDriver driver;
	
	//public static void launchApp(String appUrl){
		//To launch the chrome browser
		//WebDriver driver = new ChromeDriver();
		
		//Navigate to the required app
		//driver.get(appUrl);

		//Maximize current window
	//	driver.manage().window().maximize();
	//}
	
//	public void searchBuses(String source, String destination) {
		//identify the elements using Id locator
		//WebElement objFrom = driver.findElement(By.id("src"));
		//objFrom.sendKeys(source);

	//	WebElement objTo = driver.findElement(By.id("dest"));
	//	objTo.sendKeys(destination);
		
	//	WebElement objSearch = driver.findElement(By.cssSelector("#search_button"));
	//	objSearch.click();
	//}
	
	//public void showBusDetails() {
	//	WebElement objBusName = driver.findElement(By.className("travels lh-24 f-bold d-color"));
	//	String busName = objBusName.getText();
	//	System.out.println("BusName: "+busName);
		
	//WebElement objFare = driver.findElement(By.className("fare d-block"));
	//	String busFare = objFare.getText();
	//	System.out.println("BusName: "+busName+ "\t"+"BusFare: "+busFare);
	//}
	public static void main(String[] args){
		
		String appUrl = "https://www.redbus.in"; 
		String source = "Vijayawada";
		String destination = "Hyderabad";
		//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		
		//launchApp(appUrl);
		
		//searchBuses("Vijayawada","Hyderabad");
		
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the required app
		driver.get(appUrl);

		//Maximize current window
		driver.manage().window().maximize();

		//identify the elements using Id locator
		WebElement objFrom = driver.findElement(By.id("src"));
		objFrom.sendKeys(source);

		WebElement objTo = driver.findElement(By.id("dest"));
		objTo.sendKeys(destination);
		
		//WebElement objDate = driver.findElement(By.className("sc-cSHVUG NyvQv icon icon-datev2"));
		//objDate.click();
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hi");
		WebElement objSearch = driver.findElement(By.cssSelector("#search_button"));
		objSearch.click();

		WebElement objBusName = driver.findElement(By.cssSelector("#travels"));
		String busName = objBusName.getText();

		
		WebElement objFare = driver.findElement(By.cssSelector("#fare"));
		String busFare = objFare.getText();
		System.out.println("BusName: "+busName+ "\t"+"BusFare: "+busFare);
	}
}
*/

/*
package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalHtmlTest {

	/**
	 * @param args
	 */
/*	public static void main(String[] args){
		//To launch the chrome browser
		WebDriver driver = new ChromeDriver();
	
		//Navigate to the given url
		driver.get("C:\\TestHtmlPage.html");
		
		WebElement firstName = driver.findElement(By.id("fname"));
		firstName.sendKeys("Sailaja");
		
		List<WebElement>links = driver.findElements(By.partialLinkText("Official Page"));
		links.get(0).click();
		System.out.println(links.size());
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://google.com");
	}
}
*/

/*
package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocatorsTest {

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
*/