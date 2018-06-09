package com.pages;

import net.serenitybdd.core.annotations.findby.By;

public class CheckoutPage extends GeneralPage {
	//use click on button based on button name from general page
	public void proceedToCheckput() {
		waitUntilContentLoads();
		getDriver().findElement(By.cssSelector(".cart_navigation.clearfix a[title=\"Proceed to checkout\"]")).click();
	}
	
	public void processAddress() {
		waitUntilContentLoads();
		getDriver().findElement(By.cssSelector("button[name=\"processAddress\"]")).click();
	}
	
	public void processCarrier() {
		waitUntilContentLoads();
		getDriver().findElement(By.cssSelector("button[name=\"processCarrier\"]")).click();
	}
	
	public void agreeeToTerms() {
		waitUntilContentLoads();
		getDriver().findElement(By.id("cgv")).click();
	}
	
	public void selectPaymentMethod() {
		waitUntilContentLoads();
		getDriver().findElement(By.className("bankwire")).click();
	}
	public void confirmOrder() {
		waitUntilContentLoads();
		getDriver().findElement(By.cssSelector("#cart_navigation button")).click();
	}
	public void navigateToOrderHistory() {
		waitUntilContentLoads();
		getDriver().findElement(By.cssSelector(".button-exclusive")).click();
	}
}
