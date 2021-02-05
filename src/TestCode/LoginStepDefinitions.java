package TestCode;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import TestCode.LoginPage;

public class LoginStepDefinitions {
	WebDriver driver;
	LoginPage loginpage;
	@Given("^a user is on exercise.com$")
	public void a_user_is_on_exercis_com() throws Throwable {
	   driver= new ChromeDriver();
	   System.setProperty("webdriver.gecko.driver","C:\\CucumberStandalone\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
       String baseUrl = "https://www.exercise1.com/values";
       // launch Chrome and direct it to the Base URL
       driver.get(baseUrl);
      
       //close Chrome
       driver.close();
	}

	@When("^user enters all the fields values$")
	public void user_enters_values_into_textfields() throws Throwable {
		 loginpage=new LoginPage();
		loginpage.settxt_val_1("122365.24");
		loginpage.settext_val_2("599.00");
		loginpage.settext_val_3("850139.99");
		loginpage.settext_val_4("23329.50");
		loginpage.settext_val_5("566.27");
	   
	}

	@Then("^user entered values equal to total balance amount$")
	public void verify_count_ofvalues_withtotal() throws Throwable {
	    Assert.assertEquals(loginpage.getTotalCount(),Double.parseDouble(loginpage.txt_ttl_val.getText()) );
	}

	

}
