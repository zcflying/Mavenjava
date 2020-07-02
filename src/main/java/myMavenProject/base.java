package myMavenProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class base {
public WebDriver driver;
public String baseURL;
public static org.apache.logging.log4j.Logger log ;
@BeforeSuite
public WebDriver initializeDriver() throws IOException {
	Properties prop = new Properties();
	FileInputStream file = new FileInputStream("D:\\Eclipse Project\\Mavenjava\\src\\main\\java\\myMavenProject\\config.properties");
	
	prop.load(file);
	String browserName = prop.getProperty("browser");
	
	if(browserName.equals("chrome")){
		  driver = new ChromeDriver();
	}else if(browserName.equals("ie")) {
	   // driver = new IeDriver();
	  }else if(browserName.equals("firefox")) {
		  driver = new FirefoxDriver();
	  }
	
	baseURL = prop.getProperty("URL");
	
	log =  LogManager.getLogger(base.class.getName());
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
}

	@AfterSuite
	public void teardown() {
		driver.close();
	}
}
