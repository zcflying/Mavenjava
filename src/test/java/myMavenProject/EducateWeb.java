package myMavenProject;

import static org.testng.ITestResult.SUCCESS;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class EducateWeb {
	public WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	@BeforeTest
	public void setup() {
		report = new ExtentReports("D:\\Eclipse Project\\Mavenjava\\report\\test.html");
		test = report.startTest("test EducateWeb");
		driver = new FirefoxDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	@Test()
	public void testwebpage() {
		
		driver.findElement(By.cssSelector("#mousehover")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		test.log(LogStatus.INFO,"scroll down to the bottom");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS,"scroll down is verified");
	}
	
	@AfterTest
	public void teardown() throws InterruptedException, IOException {
		//if(result.getStatus() == ITestResult.SUCCESS ) {
		utilities.takeScreenshot(driver,"D:\\Eclipse Project\\Mavenjava\\output\\test.png");
		String imgpath = test.addScreenCapture("D:\\Eclipse Project\\Mavenjava\\output\\test.png");
		test.log(LogStatus.PASS, imgpath);
		//}
		Thread.sleep(3000);
		driver.close();
		report.endTest(test);
		report.flush();
	}
	
	
}
