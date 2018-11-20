import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class TeaTestingApp {

	private String url = "http://www.practiceselenium.com";
	private WebDriver driver;

	@Given("^the correct web address$")
	public void the_correct_web_address() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Ahmeds Applications\\chrome driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() {

		LandingPage selectMenuFromPage = PageFactory.initElements(driver, LandingPage.class);
		selectMenuFromPage.selectMenu();

	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() {

		MenuPage menuString = PageFactory.initElements(driver, MenuPage.class);
		assertEquals("Menu", menuString.titleOfMenuPage());
		driver.quit();

	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() {

		LandingPage selectcheckout = PageFactory.initElements(driver, LandingPage.class);
		selectcheckout.checkout();

	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() {

		CheckoutPage checkout = PageFactory.initElements(driver, CheckoutPage.class);
		assertEquals("Enter your billing information", checkout.titleOfMenuPage());
		driver.quit();

	}

}
