package myMavenProject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class utilities {
	
	public static void takeScreenshot(WebDriver driver,String file) throws IOException {
		File soureFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(soureFile,new File(file));
	}
}
