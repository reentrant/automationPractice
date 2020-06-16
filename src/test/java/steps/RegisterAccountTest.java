package steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import automationPractice.BaseHomePage;
import automationPractice.EmailCreator;
import automationPractice.HomePageLocators;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterAccountTest {
	BaseHomePage pageUnderTest;
	HomePageLocators locators;
	WebElement currentElement;
	
	@Before()
	public void setup() {
		pageUnderTest = new BaseHomePage();
		locators = new HomePageLocators(pageUnderTest);
	}
	
	
	@Given("I open the Home Page")
	public void i_open_the_Home_Page() {
		pageUnderTest.openUrl("http://automationpractice.com");
		Assert.assertEquals("My Store", pageUnderTest.getDriver().getTitle());
	}

	@When("I locate the sign in button")
	public void i_locate_the_sign_in_button() {
		currentElement = locators.getSignInButton();
		Assert.assertTrue(currentElement.isDisplayed());
	}

	@Then("I click it and I reach the registering page")
	public void i_reach_the_registering_page() {
		currentElement.click();
		Assert.assertEquals("Login - My Store", pageUnderTest.getDriver().getTitle());

	}

	@Given("I am in the authentication page")
	public void i_am_in_the_authentication_page() {
		currentElement = locators.getEmailForm();
		Assert.assertTrue(currentElement.isDisplayed());
	}


	@When("I fill the email address to create an account with an unique email")
	public void i_fill_the_email_address_to_create_an_account() {
		String emailString = new EmailCreator().getUniqueEmail();
		WebElement emailBox = locators.getEmailBox();
		emailBox.sendKeys(emailString + "\n");
		currentElement = locators.getEmailAlreadyRegisteredError();
		Assert.assertFalse(currentElement.isDisplayed());
		
	}

	@Then("I get the create an account form")
	public void i_get_the_create_an_account_form() {
		WebElement createAccountForm = locators.getAccountCreationForm();
		Assert.assertTrue(createAccountForm.isDisplayed());
	}


	@Given("I fill the fields with correct data")
	public void i_fill_the_fields_with_correct_data() {
		locators.selectMrTitle();
		locators.fillCustomerFirstName("Data");
		locators.fillCustomerLastName("Zoom");
		locators.fillPassWord("pAssW0rd!23");
		locators.selectDayOfBirth(1);
		locators.selectMonthOfBirth(1);
		locators.selectYearOfBirth(2017);
		locators.fillCompanyName("Data Zoom");
		locators.fillCompanyAddress("600 Third Avenue");
		locators.fillAddressLine2("2nd Floor");
		locators.fillCity("New York");
		locators.selectState("New York");
		locators.fillZipCode("10016");
		locators.fillMobilePhone("(347) 669-9679");
		locators.fillAddressAlias("company address");
		currentElement = locators.getRegisterButton();
		Assert.assertTrue(currentElement.isDisplayed());
	}

	@When("I click the register button")
	public void i_click_the_register_button() {
		currentElement.click();
		Assert.assertEquals("My account - My Store", pageUnderTest.getDriver().getTitle());
	}

	@Then("my account is created")
	public void my_account_is_created() {
		Assert.assertEquals("MY ACCOUNT", locators.getMainHeader().getText());
	}



}
