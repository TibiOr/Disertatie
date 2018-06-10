package com.steps;

import static org.junit.Assert.assertEquals;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;

public class CheckoutSteps extends GeneralSteps{
	
	private static final long serialVersionUID = 1L;

	@Step
	public void completeCheckoutWithBankWire() {
		getCheckoutPage().proceedToCheckput();
		getCheckoutPage().processAddress();
		getCheckoutPage().agreeeToTerms();
		getCheckoutPage().processCarrier();
		getCheckoutPage().selectBankWirePaymentMethod();
		getCheckoutPage().confirmOrder();
	}
	@Step
	public void completeCheckoutWithCheque() {
		getCheckoutPage().proceedToCheckput();
		getCheckoutPage().processAddress();
		getCheckoutPage().agreeeToTerms();
		getCheckoutPage().processCarrier();
		getCheckoutPage().selectCheckPaymentMethod();
		getCheckoutPage().confirmOrder();
	}
	
	public void verifyOrderConfirmationMessage() {
		String actualMessage = getDriver().findElement(By.cssSelector("#center_column h1")).getText();
		assertEquals("Checkout failed", "ORDER CONFIRMATION", actualMessage);
		String message = getDriver().findElement(By.cssSelector(".box ")).getText();
		Serenity.getCurrentSession().put("orderConfirmationMessage", message);
	}
	
	@Step
	public void navigateToOrderHistory() {
		getCheckoutPage().navigateToOrderHistory();
	}
	
}
