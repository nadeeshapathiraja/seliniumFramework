package puthipul.admin_dashboard.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NotificationPageObjects {
	
	public WebDriver driver;

	//In Dashboard 
	By selectNotification = By.linkText("Notifications");
	By selectDestination =By.xpath("//span[text()='Notifications']");
	
	//Side MenuBar  
	By SelectProductCatalog =By.xpath("//span[text()='Product Catalog']");
	By SelectListtProduct =By.xpath("//span[text()='List Products']");
	By SelectAddtProduct =By.xpath("//span[text()='Add Product']");
	By SelectLeadEngine =By.xpath("//span[text()='Lead Engine']");
	By SelectReport =By.xpath("//span[text()='Reports']");
	By TextHelp =By.xpath("//h6[text()='Need Help?']");
	By HelpDoc =By.xpath("//a[text()='Check our docs']");
	By DashboardVersion =By.xpath("//p[text()='Administration Dashboard Version 1.0.0']");
	
	//Header items
	By logo = By.xpath("//img[@alt='Logo']");
	By iconSearch = By.xpath("//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall']");
	By iconBell = By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/button[2]/span[1]/svg[1]");
	By iconAvatar = By.xpath("//*[@class='MuiSvgIcon-root MuiAvatar-fallback']");
	By iconAdminName = By.xpath("//h6[text()='Liongate Admin']");
	
	//Notification screen	
	By btnCompose = By.xpath("//span[text()='Compose']");
	By btnSelectallCheckBox = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]/input[1]");
	By txtSelectAll = By.xpath("//h6[text()='Select all']");
	By SelectNotification = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]");
	
	public NotificationPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	//Notification Screen
	public WebElement getbtnCompose() {
		return driver.findElement(btnCompose);
	}
	public WebElement getbtnSelectallCheckBox() {
		return driver.findElement(btnSelectallCheckBox);
	}
	public WebElement gettxtSelectAll() {
		return driver.findElement(txtSelectAll);
	}
	public WebElement getSelectNotification() {
		return driver.findElement(SelectNotification);
	}
	
	//Header items
	public WebElement getlogo() {
		return driver.findElement(logo);
	}
	public WebElement geticonSearch() {
		return driver.findElement(iconSearch);
	}
	public WebElement geticonBell() {
		return driver.findElement(iconBell);
	}
	public WebElement geticonAvatar() {
		return driver.findElement(iconAvatar);
	}
	public WebElement geticonAdminName() {
		return driver.findElement(iconAdminName);
	}
	
	
	
	
	
	
}
