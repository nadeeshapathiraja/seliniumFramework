package puthipul.admin_dashboard.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListUserPageObjects {
public WebDriver driver;
	

	//Side MenuBar Objects  
	By SelectProductCatalog =By.xpath("//span[text()='Product Catalog']");
	By SelectListtProduct =By.xpath("//span[text()='List Products']");
	By SelectAddtProduct =By.xpath("//span[text()='Add Product']");
	By SelectLeadEngine =By.xpath("//span[text()='Lead Engine']");
	By SelectReport =By.xpath("//span[text()='Reports']");
	By TextHelp =By.xpath("//h6[text()='Need Help?']");
	By HelpDoc =By.xpath("//a[text()='Check our docs']");
	By DashboardVersion =By.xpath("//p[text()='Administration Dashboard Version 1.0.0']");

	//Header Objects
	By logo = By.xpath("//img[@alt='Logo']");
	By iconSearch = By.xpath("//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall']");
	By iconBell = By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/button[2]/span[1]/svg[1]");
	By iconAvatar = By.xpath("//*[@class='MuiSvgIcon-root MuiAvatar-fallback']");
	By iconAdminName = By.xpath("//h6[text()='Liongate Admin']");

	//List User Objects
	By txtHeader = By.xpath("//h3[text()='All Customers']");
	By searchBox = By.xpath("//input[@type='text'][@placeholder='Search customers']");
	By sortList = By.xpath("//select[@name='sort']");
	By lblTitle1 = By.xpath("//th[text()='Phone Number']");
	By lblTitle2 = By.xpath("//th[text()='Name']");
	By lblTitle3 = By.xpath("//th[text()='Phone Verified']");
	By lblTitle4 = By.xpath("//th[text()='Registered Time']");
	By lblTitle5 = By.xpath("//th[text()='Actions']");
	By editButton = By.xpath("//tr[1]//td[6]//button[1]//span[1]//*[local-name()='svg']");
	By deleteButton = By.xpath("//tr[1]//td[6]//button[2]//span[1]//*[local-name()='svg']");
	By lblTitle6 = By.xpath("//p[contains(text(),'Rows per page:')]");
	By numberPerPage = By.xpath("//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiTablePagination-menuItem Mui-selected MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button Mui-selected']");
	By nextPageButton = By.xpath("//div[@class='MuiTablePagination-actions']//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit']//span[@class='MuiIconButton-label']//*[local-name()='svg']");
	
	
	public ListUserPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	//Side MenuBar
	public WebElement getSelectProductCatalog() {
		return driver.findElement(SelectProductCatalog);
	}
	public WebElement getSelectListtProduct() {
		return driver.findElement(SelectListtProduct);
	}
	public WebElement getSelectAddtProduct() {
		return driver.findElement(SelectAddtProduct);
	}
	public WebElement getSelectLeadEngine() {
		return driver.findElement(SelectLeadEngine);
	}
	public WebElement getSelectReport() {
		return driver.findElement(SelectReport);
	}
	public WebElement getTextHelp() {
		return driver.findElement(TextHelp);
	}
	public WebElement getHelpDoc() {
		return driver.findElement(HelpDoc);
	}
	public WebElement getDashboardVersion() {
		return driver.findElement(DashboardVersion);
	}
		
		
	//Header items
	public WebElement getLogo() {
		return driver.findElement(logo);
	}
	public WebElement getIconSearch() {
		return driver.findElement(iconSearch);
	}
	public WebElement getIconBell() {
		return driver.findElement(iconBell);
	}
	public WebElement getIconAvatar() {
		return driver.findElement(iconAvatar);
	}
	public WebElement getIconAdminName() {
		return driver.findElement(iconAdminName);
	}
		
	//Notification Screen
	public WebElement getTxtHeader() {
		return driver.findElement(txtHeader);
	}
	public WebElement getSearchBox() {
		return driver.findElement(searchBox);
	}
	public WebElement getSortList() {
		return driver.findElement(sortList);
	}
	public WebElement getLblTitle1() {
		return driver.findElement(lblTitle1);
	}
	public WebElement getLblTitle2() {
		return driver.findElement(lblTitle2);
	}
	public WebElement getLblTitle3() {
		return driver.findElement(lblTitle3);
	}
	public WebElement getLblTitle4() {
		return driver.findElement(lblTitle4);
	}
	public WebElement getLblTitle5() {
		return driver.findElement(lblTitle5);
	}
	public WebElement getEditButton() {
		return driver.findElement(editButton);
	}
	public WebElement getDeleteButton() {
		return driver.findElement(deleteButton);
	}
	public WebElement getLblTitle6() {
		return driver.findElement(lblTitle6);
	}
	public WebElement getNumberPerPage() {
		return driver.findElement(numberPerPage);
	}
	public WebElement getNextPageButton() {
		return driver.findElement(nextPageButton);
	}
		
		
	
	
}
