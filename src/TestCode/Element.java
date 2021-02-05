
package TestCode;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * The Class Element.
 *
 * @author: Naveen
 * @mail: naveen29rac@gmail.com
 * @date: Feb 5, 2020
 */
public class Element {

	/**
	 * Click.
	 *
	 * @param driver
	 *            the driver
	 * @param by
	 *            the by
	 */
	public static void click(WebDriver driver, By by) {
		try {
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.elementToBeClickable(by)).click();
		} catch (Exception e) {
			
			try {
				driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 15);
				wait.until(ExpectedConditions.elementToBeClickable(by)).click();
			} catch (Exception ex) {
			}
		} finally {
			driver.manage().timeouts()
					.implicitlyWait(1000, TimeUnit.SECONDS);
		}
	}

	
	/**
	 * Checks if is clickable.
	 *
	 * @param driver
	 *            the driver
	 * @param by
	 *            the by
	 * @return true, if is clickable
	 */
	public static boolean isClickable(WebDriver driver, By by) {
		WebElement element;
		try {
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver,
					1000);
			element = wait.until(ExpectedConditions.elementToBeClickable(by));
			return true;
		} catch (Exception e) {
			
			return false;
		} finally {
			driver.manage().timeouts()
					.implicitlyWait(1000, TimeUnit.SECONDS);
		}
	}

	/**
	 * Checks if is clickable.
	 *
	 * @param driver
	 *            the driver
	 * @param element
	 *            the element
	 * @return true, if is clickable
	 */
	public static boolean isClickable(WebDriver driver, WebElement element) {
		try {
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver,
					1000);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			driver.manage().timeouts()
					.implicitlyWait(1000, TimeUnit.SECONDS);
		}
	}

	/**
	 * Checks if is element present instant.
	 *
	 * @param driver
	 *            the driver
	 * @param by
	 *            the by
	 * @return true, if is element present instant
	 */
	public static boolean isElementPresentInstant(WebDriver driver, By by) {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		} catch (Exception otherException) {
			return false;
		} finally {
			driver.manage().timeouts()
					.implicitlyWait(1000, TimeUnit.SECONDS);
		}
	}

}
