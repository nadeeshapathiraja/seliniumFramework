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
import puthipul.admin_dashboard.pageObjects.NotificationPageObjects;

public class NotificationPageTest extends Base {
	@BeforeTest
	public void initialize() throws IOException {
		driver =initializeDriver();
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username,String Password) throws IOException, InterruptedException {		
		 driver.get(website);
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     NotificationPageObjects NotificationPage = new NotificationPageObjects(driver);
//	     assertEquals( NotificationPage.getTitle1().getText(), "Sign In");	 
//	     Assert.assertTrue(NotificationPage.getTitle1().isDisplayed());
//	     assertEquals( NotificationPage.getTitle2().getText(), "Sign in to Admimistration Dashboard");	 
//	     Assert.assertTrue(NotificationPage.getTitle2().isDisplayed());
//	     NotificationPage.getUserName().sendKeys(Username);
//	     NotificationPage.getPassword().sendKeys(Password);
//	     NotificationPage.getLoginBtn().click();
//	     Thread.sleep(50000);
//	     Assert.assertTrue(NotificationPage.getLoggedIn().isDisplayed());
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
