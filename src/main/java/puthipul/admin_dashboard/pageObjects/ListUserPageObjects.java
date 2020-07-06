package puthipul.admin_dashboard.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListUserPageObjects {
public WebDriver driver;
	
	By link = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ol[1]	");
	By txtHeader = By.xpath("//h3[text()='All Customers']");
	By searchBox = By.xpath("//input[@type='text'][@placeholder='Search customers']");
	By sortList = By.xpath("//select[@name='sort']");
	By lblTitle1 = By.xpath("//th[text()='Phone Number']");
	By lblTitle2 = By.xpath("//th[text()='Name']");
	By lblTitle3 = By.xpath("//th[text()='Phone Verified']");
	By lblTitle4 = By.xpath("//th[text()='Registered Time']");
	By lblTitle5 = By.xpath("//th[text()='Actions']");
	
	public ListUserPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	
}
