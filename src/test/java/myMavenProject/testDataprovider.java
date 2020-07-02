package myMavenProject;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testDataprovider {

	@DataProvider(name="input")
	public Object[][] getData() {
		Object[][] a = new Object[][] {
		{"usera","passa"},
		{"userb","passb"},
		{"userc","passc"}
		};
		return a;
    }
	
	@Test(dataProvider = "input")
	public void testdata(String username,String password) {
		System.out.println("username is " + username);
		System.out.println("password is " + password);
		
	}
}