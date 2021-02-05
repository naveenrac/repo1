package TestCode;

import java.text.NumberFormat;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * The Class LoginPage.
 *
 * @author: Naveen
 * @mail: naveen29rac@gmail.com
 * @date: 5th Feb 2021 * purpose of this class is to store all the pages object
 *        related to login.
 */
public class LoginPage extends TestBase{

	private WebDriver driver;
	NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Finding label1
	@FindBy(id = "lbl_val_1")
	private WebElement lbl_val_1;

	// Finding label2
	@FindBy(id = "lbl_val_2")
	private WebElement lbl_val_2;

	// Finding label3
	@FindBy(id = "lbl_val_3")
	private WebElement lbl_val_3;

	// Finding label4
	@FindBy(id = "lbl_val_4")
	private WebElement lbl_val_4;

	// Finding label5
	@FindBy(id = "lbl_val_5")
	private WebElement lbl_val_5;

	// Finding totallabel5
	@FindBy(id = "lbl_ttl_value")
	private WebElement lbl_ttl_value;

	// Finding text_val_1
	@FindBy(id = "txt_val_1")
	private WebElement txt_val_1;

	// Finding text_val_2
	@FindBy(id = "txt_val_2")
	private WebElement txt_val_2;

	// Finding text_val_3
	@FindBy(id = "txt_val_3")
	private WebElement txt_val_3;

	// Finding text_val_4
	@FindBy(id = "txt_val_4")
	private WebElement txt_val_4;

	// Finding text_val_5
	@FindBy(id = "txt_val_5")
	private WebElement txt_val_5;

	// Finding text_ttl_val
	@FindBy(id = "txt_ttl_val")
	public WebElement txt_ttl_val;

	// Setting up textvalue
	public void settxt_val_1(String val1) {
		txt_val_1.clear();
		txt_val_1.sendKeys(currency.format(val1));
	}

	public void settext_val_2(String val2) {
		txt_val_2.clear();
		txt_val_2.sendKeys(currency.format(val2));
	}

	public void settext_val_3(String val3) {
		txt_val_3.clear();
		txt_val_3.sendKeys(currency.format(val3));
	}

	public void settext_val_4(String val4) {
		txt_val_4.clear();
		txt_val_4.sendKeys(currency.format(val4));
	}

	public void settext_val_5(String val5) {
		txt_val_5.clear();
		txt_val_5.sendKeys(currency.format(val5));
	}
	public void settxt_ttl_val(double totalValue){
		totalValue=getTotalCount();
		txt_ttl_val.clear();
		txt_ttl_val.sendKeys(currency.format(totalValue));
	}

	public double getTotalCount() {
		double totalCount;
		double val1 = Double.parseDouble(txt_val_1.getText());
		double val2 = Double.parseDouble(txt_val_2.getText());
		double val3 = Double.parseDouble(txt_val_3.getText());
		double val4 = Double.parseDouble(txt_val_4.getText());
		double val5 = Double.parseDouble(txt_val_5.getText());;
		return totalCount = val1 + val2 + val3 + val4 + val5;
	}

	

}
