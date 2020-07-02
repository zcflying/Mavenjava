package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchPagefactory {

	WebDriver driver;
	
	@FindBy(css="#tab-flight-tab-hp")
	static WebElement flightTab;
	
	@FindBy(css="#flight-type-one-way-label-hp-flight")
	static WebElement oneWay;
	
	@FindBy(css="#flight-origin-hp-flight")
	static WebElement flyingFrom;
	
	@FindBy(css="#flight-destination-hp-flight")
	static WebElement flyingTo;
	
	@FindBy(css="#flight-departing-single-hp-flight")
	static WebElement departure;
	
	@FindBy(css="[class='col search-btn-col']>[class='btn-primary btn-action gcw-submit'][css='1']")
	static WebElement searchButton;
	
	public searchPagefactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectFights() {
		flightTab.click();
	}
	
	public void selectOneWay() {
		oneWay.click();
	}

	public void enterFlyingFrom(String location) {
		flyingFrom.sendKeys(location);
	}

	public void enterFlyingTo(String location) {
		flyingTo.sendKeys(location);
		
	}
	
	public void enterDepartingDate(String year,String month,String day) {
		String date = "[data-year='"+ year +"'][data-month='" + month + "'][data-day='" + day +  "']";
		departure.click();
		driver.findElement(By.cssSelector(date)).click();
	}
	
	public void enterDepartingDate2(String d) {
		departure.sendKeys(d);
	}
	
	public void clickSearchButton(WebDriver driver) {
		searchButton.click();
	}
	
	
}
