package myMavenProject;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name = "search")
	public Object[][] getData(){
		return new Object[][] {
				{"Melbourne (MEL-All Airports)","Sydney, NSW (SYD-Kingsford Smith Intl.)","06/30/2020"},
				{"Sydney, NSW (SYD-Kingsford Smith Intl.)","Melbourne (MEL-All Airports)","07/01/2020"}
		};
	}
	
}
