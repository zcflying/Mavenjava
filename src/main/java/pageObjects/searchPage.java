package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import myMavenProject.base;

public class searchPage extends base {
		
	public static void selectFights(WebDriver driver) {
		driver.findElement(By.cssSelector("#tab-flight-tab-hp")).click();
	}
	
	public static void selectOneWay(WebDriver driver) {
		driver.findElement(By.cssSelector("#flight-type-one-way-label-hp-flight")).click();
	}

	public static void enterFlyingFrom(WebDriver driver,String location) {
		driver.findElement(By.cssSelector("#flight-origin-hp-flight")).sendKeys(location);
	}

	public static void enterFlyingTo(WebDriver driver,String location) {
		driver.findElement(By.cssSelector("#flight-destination-hp-flight")).sendKeys(location);
		
	}
	
	public static void enterDepartingDate(WebDriver driver,String year,String month,String day) {
		String date = "[data-year='"+ year +"'][data-month='" + month + "'][data-day='" + day +  "']";
		driver.findElement(By.cssSelector("#flight-departing-single-hp-flight")).click();
		driver.findElement(By.cssSelector(date)).click();
	}
	
	public static void enterDepartingDate(WebDriver driver,String d) {
		driver.findElement(By.cssSelector("#flight-departing-single-hp-flight")).sendKeys(d);
	}
	
	public static void clickSearchButton(WebDriver driver) {
		driver.findElement(By.cssSelector("[class='col search-btn-col']>[class='btn-primary btn-action gcw-submit'][css='1']")).click();
		
	}
	
	
}


