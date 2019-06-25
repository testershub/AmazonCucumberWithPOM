package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage {

	WebDriver driver;

	public ShoppingPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("page driver :-" + driver);
	}

	// Using FindBy for locating elements
	// Search Field
	@FindBy(how = How.CSS, using = "input#twotabsearchtextbox")
	WebElement searchField;
	// Search icon
	@FindBy(how = How.CSS, using = "input.nav-input")
	WebElement searchicon;
	// 'Experiences of Test Automation: Case Studies of Software Test
	// Automation'book
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")
	WebElement clickonTestAutomationbookname;
	// click on test agile book name
	@FindBy(how = How.CSS, using = "a[title='Agile Testing: A Practical Guide for Testers and Agile Teams, 1e']")
	WebElement clickonAgileBookName;
	// click on paperback option for agile book
	@FindBy(how = How.XPATH, using = "//*[@id='search']/div[1]/div[2]/div/span[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/a")
	WebElement clickonpaperbackoptionforAgile;
	// click on all buying option for agile
	@FindBy(how = How.XPATH, using = "//*[@id='buybox-see-all-buying-choices-announce']")
	WebElement clickonallbuyingoptionforAgile;
	// click on add to cart for agile
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div[1]/div[1]/div/div/div[2]/div[5]/div/form/span/span/span/input")
	WebElement clickOnAddtoCartforAgile;
	// click on selenium book name
	@FindBy(how = How.CSS, using = "a[title='Selenium WebDriver 3 Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, 2nd Edition']")
	WebElement clickonSeleniumBookName;
	// click on paperback option for selenium book
	@FindBy(how = How.XPATH, using = "//*[@id='search']/div[1]/div[2]/div/span[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/a")
	WebElement clickonpaperbackoptionforSelenium;
	// click on all buying option for selenium
	@FindBy(how = How.XPATH, using = "//*[@id='buybox-see-all-buying-choices-announce']")
	WebElement clickonallbuyingoptionforSelenium;
	// click on add to cart for agile
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div[1]/div[1]/div/div/div[2]/div[5]/div/form/span/span/span/input")
	WebElement clickOnAddtoCartforSeleniumWebdriver;
	// add to cart
	@FindBy(how = How.CSS, using = "input#add-to-cart-button")
	WebElement addcart;
	// click on Cart icon
	@FindBy(how = How.CSS, using = "a#nav-cart")
	WebElement clickoncarticon;
	// click on 'save for later' option for Test automation book
	@FindBy(how = How.CSS, using = "input[aria-label='Save for later Experiences of Test Automation: Case Studies of Software Test Automation, 1e']")
	WebElement clickonsaveforlater;
	// click on 'Delete'option for agile
	@FindBy(how = How.CSS, using = "input[aria-label='Delete Agile Testing: A Practical Guide for Testers and Agile Teams, 1e']")
	WebElement clickondelete;
	// click on dropdown along with selenium book
	@FindBy(how = How.CSS, using = "#a-autoid-0-announce")
	WebElement clickonseleniumbookdropdown;
	// click on required qauntity
	@FindBy(how = How.CSS, using = "a#dropdown1_2")
	WebElement clickonrequiredquantity;
	// click on gift checkbox
	@FindBy(how = How.XPATH, using = "//div[@class='a-checkbox sc-gift-option a-align-top a-size-small a-spacing-top-micro']//input[@type='checkbox']")
	WebElement selectgiftcheckbox;

	public void EnterBookName(String bookname) {
		// enter book name in search field
		searchField.clear();
		searchField.sendKeys(bookname);

	}

	public void clickOnSearchIcon() {
		// click on search icon
		searchicon.click();

	}

	public void clickTestAutomationOnBookName() {

		// click on book name
		clickonTestAutomationbookname.click();

	}

	public void clickOnAddCart() throws InterruptedException {
		// click on add to cart button

		Thread.sleep(8000);
		addcart.click();
	}

	public void clickOnAgileBookName() {
		// click on agile book name
		clickonAgileBookName.click();

	}

	public void clickonSeleniumBook() {
		// click on selnium book name
		clickonSeleniumBookName.click();

	}

	public void clickOnCartIcon() {
		// click on cart icon
		clickoncarticon.click();
	}

	public void clickOnSaveForlate() {
		// click on save for later option
		clickonsaveforlater.click();
	}

	public void clickOnDelete() {
		// click on delete option
		clickondelete.click();

	}

	public void clickOnDropdownQuantity() {
		// click on dropdown
		clickonseleniumbookdropdown.click();

	}

	public void clickOnRequiredQuantity() {
		// click on any number quantity
		clickonrequiredquantity.click();

	}

	public void SelectGiftCheckbox() {
		// select gift checkbox
		selectgiftcheckbox.click();

	}

	public void clickonpaperbackoptionforAgile() {
		// TODO Auto-generated method stub
		clickonpaperbackoptionforAgile.click();
	}

	public void clickonallbuyingoptionforAgile() {
		// TODO Auto-generated method stub
		clickonallbuyingoptionforAgile.click();
	}

	public void clickOnAddtoCartforAgile() {
		// TODO Auto-generated method stub
		clickOnAddtoCartforAgile.click();
	}

	public void clickonpaperbackoptionforSelenium() {
		// TODO Auto-generated method stub
		clickonpaperbackoptionforSelenium.click();
	}

	public void clickonallbuyingoptionforSelenium() {
		// TODO Auto-generated method stub
		clickonallbuyingoptionforSelenium.click();
	}

	public void clickOnAddtoCartforSeleniumWebdriver() {
		// TODO Auto-generated method stub
		clickOnAddtoCartforSeleniumWebdriver.click();
	}

}
