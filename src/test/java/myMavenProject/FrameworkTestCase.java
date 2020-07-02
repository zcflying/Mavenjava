package myMavenProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.searchPagefactory;

public class FrameworkTestCase {
	private WebDriver driver;
	private String baseURL;
	searchPagefactory searchPage ;
	
	@BeforeClass
	@Parameters({"browser"})
	public void initialize(String browser) throws IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("D:\\Eclipse Project\\Mavenjava\\src\\main\\java\\myMavenProject\\config.properties");
		
		prop.load(file);
		String browserName = prop.getProperty("browser");
		
		if(browser.equals("chrome")){
			  driver = new ChromeDriver();
		}else if(browserName.equals("ie")) {
		   // driver = new IeDriver();
		  }else if(browserName.equals("firefox")) {
			  driver = new FirefoxDriver();
		  }

		baseURL = prop.getProperty("URL");
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		searchPage = new searchPagefactory(driver);
		
		
	}
	
	@Test
	public void test() {
		SoftAssert sa = new SoftAssert();
		searchPage.selectFights();
		searchPage.selectOneWay();
		sa.assertTrue(true);
		sa.assertEquals(1+2, 3);
		sa.assertAll();
	}
	
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
}
