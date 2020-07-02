package puthipul.admin_dashboard;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import puthipul.admin_dashboard.base.Base;
import puthipul.admin_dashboard.pageObjects.LoginPageObjects;

public class LoginPageTest extends Base{
	
	
	@BeforeTest
	public void initialize() throws IOException {
		driver =initializeDriver();
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username,String Password) throws IOException, InterruptedException {		
		 driver.get(website);
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     LoginPageObjects login = new LoginPageObjects(driver);
	     assertEquals( login.getTitle1().getText(), "Sign In");	 
	     Assert.assertTrue(login.getTitle1().isDisplayed());
	     assertEquals( login.getTitle2().getText(), "Sign in to Admimistration Dashboard");	 
	     Assert.assertTrue(login.getTitle2().isDisplayed());
	     login.getUserName().sendKeys(Username);
	     login.getPassword().sendKeys(Password);
	     login.getLoginBtn().click();
	     Thread.sleep(50000);
	     Assert.assertTrue(login.getLoggedIn().isDisplayed());
	     Thread.sleep(50000);
	}

	@AfterTest
	public void teardown() {
		tearDownDriver();
	}
	
	@DataProvider
	public Object[][] getData(){
		//row stands for how many different data types test should run
		//column stands for how many values each test
		
		Object[][] data=new Object[1][2];
		
		data[0][0]="admin";
		data[0][1]="Admin123";
		
		return data;
	}

}
