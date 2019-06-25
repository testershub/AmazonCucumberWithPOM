package stepdefinition;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.ShoppingPage;
import webdriver.WebConnector;

public class Shopping {

	WebConnector con;
	WebDriver driver;
	ShoppingPage shoppingpage;

	public Shopping(WebConnector con) {

		System.out.println("in profile constructor");
		con.Openbrowser();
		System.out.println("con driver :-" + con.driver);
		this.driver = con.driver;
		System.out.println("driver :-" + driver);
	}

	@Before
	public void init() {
		System.out.println("in start");
		// WebConnector.Openbrowser();
		shoppingpage = new ShoppingPage(driver);
	}

	@After
	public void End() {
		// close browser
		driver.quit();

	}

	@Given("^user is on amazon page$")
	public void user_is_on_amazon_page() throws Throwable {

		// enter url
		driver.get("https://www.amazon.in");
	}

	@When("^user search Experiences of Test Automation: Case Studies of Software Test Automation book name$")
	public void user_search_Experiences_of_Test_Automation_Case_Studies_of_Software_Test_Automation_book_name()
			throws Throwable {
		// enter book name1
		shoppingpage.EnterBookName("Experiences of Test Automation: Case Studies of Software Test Automation");

	}

	@When("^click on search icon$")
	public void click_on_search_icon() throws Throwable {

		// click on search icon
		shoppingpage.clickOnSearchIcon();

	}

	@When("^click on Experiences of Test Automation: Case Studies of Software Test Automation book name$")
	public void click_on_Experiences_of_Test_Automation_Case_Studies_of_Software_Test_Automation_book_name()
			throws Throwable {

		// Click on book name
		shoppingpage.clickTestAutomationOnBookName();
	}

	@When("^click on add to cart button$")
	public void click_on_add_to_cart_button() throws Throwable {
		// switch to tab window
		Iterator<String> addcartitr = driver.getWindowHandles().iterator();
		String parent = addcartitr.next();
		String child = addcartitr.next();
		driver.switchTo().window(child);

		// Click on Add cart
		shoppingpage.clickOnAddCart();

	}

	@When("^user searched for Agile Testing: A Practical Guide for Testers and Agile Teams book name$")
	public void user_searched_for_Agile_Testing_A_Practical_Guide_for_Testers_and_Agile_Teams_book_name()
			throws Throwable {
		// enter book name2
		shoppingpage.EnterBookName("Agile Testing: A Practical Guide for Testers and Agile Teams");

	}

	@When("^click on paperback option and click on All Buying option button for agile book$")
	public void click_on_paperback_option_and_click_on_All_Buying_option_button_for_agile_book() throws Throwable {
		Thread.sleep(5000);
		// click on papererback edition
		shoppingpage.clickonpaperbackoptionforAgile();

		// switch to tab window
		Iterator<String> agileitr = con.driver.getWindowHandles().iterator();
		String agile = agileitr.next();
		String childagile = agileitr.next();
		String childagile1 = agileitr.next();
		con.driver.switchTo().window(childagile1);

		// click on all buying option button
		shoppingpage.clickonallbuyingoptionforAgile();
	}

	@When("^click on add to cart button for agile$")
	public void click_on_add_to_cart_button_for_agile() throws Throwable {
		// click on agile book name
		shoppingpage.clickOnAddtoCartforAgile();
	}

	@When("^click on Agile Testing: A Practical Guide for Testers and Agile Teams book name$")
	public void click_on_Agile_Testing_A_Practical_Guide_for_Testers_and_Agile_Teams_book_name() throws Throwable {
		// click on agile book name
		shoppingpage.clickOnAgileBookName();
	}

	@When("^click on add to cart button for agile testing book$")
	public void click_on_add_to_cart_button_for_agile_testing_book() throws Throwable {

		// switch to tab window
		System.out.println("windows :-" + driver.getWindowHandles().size());
		Iterator<String> addcartitr = driver.getWindowHandles().iterator();
		String parent = addcartitr.next();
		String child = addcartitr.next();
		String child1 = addcartitr.next();
		driver.switchTo().window(child1);

		// Click on Add cart
		shoppingpage.clickOnAddCart();
	}

	@When("^user searched for Selenium WebDriver (\\d+) Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, (\\d+)nd Edition book name$")
	public void user_searched_for_Selenium_WebDriver_Practical_Guide_End_to_end_automation_testing_for_web_and_mobile_browsers_with_Selenium_WebDriver_nd_Edition_book_name(
			int arg1, int arg2) throws Throwable {
		// enter book name 3
		shoppingpage.EnterBookName(
				"Selenium WebDriver 3 Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, 2nd Edition");

	}

	@When("^click on Selenium WebDriver (\\d+) Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, (\\d+)nd Edition book name$")
	public void click_on_Selenium_WebDriver_Practical_Guide_End_to_end_automation_testing_for_web_and_mobile_browsers_with_Selenium_WebDriver_nd_Edition_book_name(
			int arg1, int arg2) throws Throwable {
		// click on selenium book
		shoppingpage.clickonSeleniumBook();

	}

	@When("^click on paperback option and click on All Buying option button for selenium webdriver book$")
	public void click_on_paperback_option_and_click_on_All_Buying_option_button_for_selenium_webdriver_book()
			throws Throwable {
		Thread.sleep(5000);
		// click on papererback edition
		shoppingpage.clickonpaperbackoptionforSelenium();

		// switch to tab window
		Thread.sleep(5000);
		Iterator<String> seleniumwindowitr = con.driver.getWindowHandles().iterator();
		System.out.println("handles:-" + con.driver.getWindowHandles().size());
		String selenium = seleniumwindowitr.next();
		String paperback = seleniumwindowitr.next();
		String paperback1 = seleniumwindowitr.next();
		String paperback2 = seleniumwindowitr.next();
		con.driver.switchTo().window(paperback2);
		// click on all buying option button
		Thread.sleep(5000);
		shoppingpage.clickonallbuyingoptionforSelenium();
	}

	@When("^click on add to cart button for selenium webdriver$")
	public void click_on_add_to_cart_button_for_selenium_webdriver() throws Throwable {
		// click on agile book name
		shoppingpage.clickOnAddtoCartforSeleniumWebdriver();
	}

	@When("^click on add to cart button for selenium book$")
	public void click_on_add_to_cart_button_for_selenium_book() throws Throwable {
		// switch to tab window
		System.out.println("windows :-" + driver.getWindowHandles().size());
		Iterator<String> addcartitr = driver.getWindowHandles().iterator();
		String parent = addcartitr.next();
		String child = addcartitr.next();
		String child1 = addcartitr.next();
		String child2 = addcartitr.next();
		driver.switchTo().window(child2);

		// Click on Add cart
		shoppingpage.clickOnAddCart();
	}

	@When("^click on cart icon$")
	public void click_on_cart_icon() throws Throwable {
		// Click on Cart icon
		shoppingpage.clickOnCartIcon();
	}

	@When("^click on Save For Later option for Experiences of Test Automation: Case Studies of Software Test Automation book$")
	public void click_on_Save_For_Later_option_for_Experiences_of_Test_Automation_Case_Studies_of_Software_Test_Automation_book()
			throws Throwable {

		// click on 'Save for option' for test automation book
		Thread.sleep(6000);
		shoppingpage.clickOnSaveForlate();

	}

	@When("^click on Delete option for Agile Testing: A Practical Guide for Testers and Agile Teams book$")
	public void click_on_Delete_option_for_Agile_Testing_A_Practical_Guide_for_Testers_and_Agile_Teams_book()
			throws Throwable {
		// click on delete for agile
		shoppingpage.clickOnDelete();
	}

	@When("^increse the quantity to three for Selenium WebDriver (\\d+) Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, (\\d+)nd Edition book$")
	public void increse_the_quantity_to_three_for_Selenium_WebDriver_Practical_Guide_End_to_end_automation_testing_for_web_and_mobile_browsers_with_Selenium_WebDriver_nd_Edition_book(
			int arg1, int arg2) throws Throwable {
		// Click on quantity dropdown box for selenium
		Thread.sleep(5000);
		shoppingpage.clickOnDropdownQuantity();

		// click on required quantity for selenium book(quantity=3)
		shoppingpage.clickOnRequiredQuantity();

	}

	@When("^click on gift checkox for Selenium WebDriver (\\d+) Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, (\\d+)nd Edition book$")
	public void click_on_gift_checkox_for_Selenium_WebDriver_Practical_Guide_End_to_end_automation_testing_for_web_and_mobile_browsers_with_Selenium_WebDriver_nd_Edition_book(
			int arg1, int arg2) throws Throwable {
		Thread.sleep(8000);
		shoppingpage.SelectGiftCheckbox();

	}

	@Then("^user should be able to see the appropriate books added with selected quantity$")
	public void user_should_be_able_to_see_the_appropriate_books_added_with_selected_quantity() throws Throwable {

		String expres = "Selenium WebDriver 3 Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, 2nd Edition";
		String actres = con.driver
				.findElement(By.cssSelector("span[class='a-size-medium sc-product-title a-text-bold']")).getText();

		String actquantity = con.driver.findElement(By.cssSelector("span[class='a-dropdown-prompt']")).getText();
		String expquantity = "3";

		Assert.assertEquals(expres, actres);
		Assert.assertEquals(expquantity, actquantity);

	}

}
