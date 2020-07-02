package myMavenProject;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.searchPage;

public class HomePage extends base {
	

	@Test(dataProvider="search",dataProviderClass=TestData.class)
	public void basePageNagivation(String fromlocation,String tolocation,String date) throws IOException, Exception {
		driver.get("https://www.expedia.com");
		//log.info("I'm debuging");
		driver.manage().window().maximize();
		searchPage.selectFights(driver);
		searchPage.selectOneWay(driver);
		searchPage.enterFlyingFrom(driver,fromlocation );
		searchPage.enterFlyingTo(driver, tolocation);
		searchPage.enterDepartingDate(driver,date);
		//searchPage.enterDepartingDate(driver, "2020", "5", "30");
		searchPage.clickSearchButton(driver);
	/*	WebElement elm1 = driver.findElement(By.cssSelector("input#bmwradio"));
		elm1.click();
		WebElement elm2 = driver.findElement(By.cssSelector("input#bmwcheck"));
		elm2.click();
		Thread.sleep(4000);
	
		Assert.assertTrue(elm1.isSelected() && elm2.isSelected());
	*/	
		
	/*
		WebElement dropdown = driver.findElement(By.cssSelector("#carselect"));
		Select sel = new Select(dropdown); 
		sel.selectByVisibleText("Benz");
		
		List<WebElement> option= sel.getOptions();
		for(int i=0; i< option.size();i++) {
			System.out.println(option.get(i).getText());
		}
		
		Thread.sleep(3000);
	*/
	
	/*
		WebElement dropdown = driver.findElement(By.cssSelector("#multiple-select-example"));
		Select sel = new Select(dropdown); 
		//sel.selectByVisibleText("Benz");
		
		List<WebElement> option= sel.getOptions();
		for(int i=0; i< option.size();i++) {
			option.get(i).click();
		}
		
		option.get(0).click();
		Thread.sleep(3000);
	
		WebElement bund = driver.findElement(By.cssSelector("#tab-package-tab-hp"));
		bund.click();
		WebElement part = driver.findElement(By.cssSelector("#partialHotelBooking-hp-package"));
		part.click();
		Thread.sleep(1000);
		WebElement hid = driver.findElement(By.cssSelector("#package-checkin-hp-package"));
		System.out.println(hid.isDisplayed());
	*/
	
	 /*
		String parentHandle = driver.getWindowHandle();
		driver.findElement(By.cssSelector("#tab-flight-tab-hp")).click();
		driver.findElement(By.cssSelector("#flight-type-one-way-label-hp-flight")).click();

		//driver.findElement(By.cssSelector("#flight-origin-hp-flight")).sendKeys("Melbourne (MEL-All Airports)");

		driver.findElement(By.cssSelector("#flight-origin-hp-flight")).sendKeys("melbourne");
		
		List<WebElement> searchlist = driver.findElements(By.cssSelector("li.results-item"));
		for(WebElement target : searchlist) {
			/*if(target.getText().equals("Melbourne (MEL-All Airports)")) {
				target.click();
				break;
			
			System.out.println("optino is " + target.getText());
			if(target.getText().contains("Melbourne (MEL-All Airports)")) {
				System.out.println("found Melbourne");
				//target.click();
				//break;
			}
			
		}	
		
		
		driver.findElement(By.cssSelector("#flight-destination-hp-flight")).sendKeys("Sydney, NSW (SYD-Kingsford Smith Intl.)");
		
		driver.findElement(By.cssSelector("#flight-departing-single-hp-flight")).click();

		driver.findElement(By.cssSelector("[data-year='2020'][data-month='5'][data-day='30']")).click();
		
		driver.findElement(By.cssSelector("[class='col search-btn-col']>[class='btn-primary btn-action gcw-submit'][css='1']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[class='btn-secondary btn-action t-select-btn'][data-offer-index='0']")).click();

		*/
		/*
		Set<String> wind = driver.getWindowHandles();
		for(String handle : wind) {
			if(!handle.equals(parentHandle)){
				driver.switchTo().window(handle);
				Thread.sleep(5000);
				driver.findElement(By.cssSelector("[class='btn-secondary btn-action t-select-btn'][data-offer-index='0']")).click();
				
				break;
			}
		}
*/		
		
		
		Thread.sleep(3000);
	}
	
	@Test
	public void test2() throws InterruptedException {
	
		Thread.sleep(3000);
	}
}
