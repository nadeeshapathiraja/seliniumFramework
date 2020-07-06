package puthipul.admin_dashboard.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public WebDriver driver;
	
	
	By txtuserName = By.xpath("//input[@placeholder='Username']");
	By txtpassWord = By.xpath("//input[@placeholder='Password']");
	By btnLogin = By.xpath("//span[text()='Log In']");
	By lblTitle1 = By.xpath("//h2[@class='MuiTypography-root MuiTypography-h2 MuiTypography-colorTextPrimary']");
	By lblTitle2 = By.xpath("//h6[text()='Sign in to Admimistration Dashboard']");
	By icon = By.xpath("//div[@class='MuiAvatar-root MuiAvatar-circle jss55 MuiAvatar-colorDefault']");
	By logo = By.xpath("//img[@alt='Logo']");
	By lblLoggedIn = By.xpath("//a[text()='Liongate Admin']");
	

	
	public LoginPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement getUserName() {
		return driver.findElement(txtuserName);
	}
	
	public WebElement getPassword() {
		return driver.findElement(txtpassWord);
	}
	
	public WebElement getLoginBtn() {
		return driver.findElement(btnLogin);
	}
	
	public WebElement getTitle1() {
		return driver.findElement(lblTitle1);
	}
	
	public WebElement getTitle2() {
		return driver.findElement(lblTitle2);
	}
	
	public WebElement icon() {
		return driver.findElement(icon);
	}
	
	public WebElement logo() {
		return driver.findElement(logo);
	}

	public WebElement getLoggedIn() {
		return driver.findElement(lblLoggedIn);
	}
	
}
