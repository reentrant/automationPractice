package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePageLocators {

	private By signInButton = By.className("login");
	private By emailForm = By.id("create-account_form");
	private By emailBox = By.id("email_create");
	private By emailError = By.id("create_account_error");
	private By accountForm = By.id("account-creation_form"); 
	private By titleButton = By.id("id_gender1");
	private By firstNameInput = By.id("customer_firstname");
	private By lastNameInput = By.id("customer_lastname");
	private By passwordInput = By.id("passwd");
	private By dayOfBirth = By.id("days");
	private By monthOfBirth = By.id("months");
	private By yearOfBirth = By.id("years");
	private By companyBox = By.id("company");
	private By AddressBox = By.id("address1");
	private By AddressLine2 = By.id("address2");
	private By cityTextBox = By.id("city");
	private By stateDropBox = By.id("id_state");
	private By zipTextBox = By.id("postcode");
	private By phoneTextBox = By.id("phone_mobile");
	private By addressAliasTextBox = By.id("alias");
	private By registerButton = By.id("submitAccount");
	private By myAccountHeader = By.tagName("h1");
	WebDriver driver;
	
	public HomePageLocators(BaseHomePage page) {
		driver = page.getDriver();
	}
	
	public WebElement getSignInButton() {
		return driver.findElement(signInButton);
	}
	
	public WebElement getEmailForm() {
		return driver.findElement(emailForm);
	}
	
	public WebElement getEmailBox() {
		return driver.findElement(emailBox);
	}
	
	public WebElement getEmailAlreadyRegisteredError() {
		return driver.findElement(emailError);
	}
	
	public WebElement getAccountCreationForm() {
		return driver.findElement(accountForm);
	}
	
	public void selectMrTitle() {
		WebElement radioButton = driver.findElement(titleButton);
		radioButton.click();
	}
	
	public void fillCustomerFirstName(String firstName) {
		WebElement inputForm = driver.findElement(firstNameInput);
		inputForm.sendKeys(firstName);
	}
	
	public void fillCustomerLastName(String lastName) {
		WebElement inputForm = driver.findElement(lastNameInput);
		inputForm.sendKeys(lastName);
	}
	
	public void fillPassWord(String password) {
		WebElement passWordInput = driver.findElement(passwordInput);
		passWordInput.sendKeys(password);
	}
	
	public void selectDayOfBirth(Integer dayNumber) {
		Select select = new Select(driver.findElement(dayOfBirth));
		select.selectByValue(dayNumber.toString());
	}
	
	public void selectMonthOfBirth(Integer monthNumber) {
		Select select = new Select(driver.findElement(monthOfBirth));
		select.selectByValue(Integer.toString(monthNumber));
	}
	
	public void selectYearOfBirth(Integer year) {
		Select select = new Select(driver.findElement(yearOfBirth));
		select.selectByValue(year.toString());
	}
	
	public void fillCompanyName(String company) {
		WebElement textBox = driver.findElement(companyBox);
		textBox.sendKeys(company);
	}
	
	public void fillCompanyAddress(String address) {
		WebElement textBox = driver.findElement(AddressBox);
		textBox.sendKeys(address);
	}
	
	public void fillAddressLine2(String address) {
		WebElement textBox = driver.findElement(AddressLine2);
		textBox.sendKeys(address);
	}
	
	public void fillCity(String city) {
		WebElement textBox = driver.findElement(cityTextBox);
		textBox.sendKeys(city);
	}
	
	public void selectState(String state) {
		Select select = new Select(driver.findElement(stateDropBox));
		select.selectByVisibleText(state);
	}
	
	public void fillZipCode(String zipCode) {
		WebElement textBox = driver.findElement(zipTextBox);
		textBox.sendKeys(zipCode);
	}
	
	public void fillMobilePhone(String phone) {
		WebElement textBox = driver.findElement(phoneTextBox);
		textBox.sendKeys(phone);
	}
	
	public void fillAddressAlias(String alias) {
		WebElement textBox = driver.findElement(addressAliasTextBox);
		textBox.sendKeys(alias);
	}
	
	public WebElement getRegisterButton() {
		WebElement button = driver.findElement(registerButton);
		return button;
	}
	
	public WebElement getMainHeader() {
		return driver.findElement(myAccountHeader);
	}
}
