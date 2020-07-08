package puthipul.admin_dashboard;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.corba.se.spi.orbutil.fsm.Action;

import puthipul.admin_dashboard.base.Base;
import puthipul.admin_dashboard.pageObjects.LoginPageObjects;
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
	     
	     NotificationPageObjects notification = new NotificationPageObjects(driver);
	     
	     assertEquals( notification.getbtnCompose().getText(), "Compose");	 
	     Assert.assertTrue(notification.getbtnCompose().isDisplayed());
	     
	     notification.getSelectDestination().click();
	     
	     Thread.sleep(50000);
	     //Assert.assertTrue(notification.getlogo().isDisplayed());
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