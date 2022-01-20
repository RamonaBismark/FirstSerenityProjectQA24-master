package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {

    @FindBy(css = ".add-to-cart-buttons .btn-cart")
    private WebElementFacade addToCartButton;

    @FindBy(css = ".header-minicart a .label")
    private WebElementFacade clickOnCartButton;

    @FindBy(css = " a.remove")
    private WebElementFacade removeProductFromCart;

    @FindBy (css = " a.cart-link")
    private WebElementFacade viewShoppingCart;

    @FindBy (css = "empty_cart_button")
    private WebElementFacade emptyCartButton;


    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }

    public void clickOnShoppingCart() {
        clickOn (clickOnCartButton);
    }

    public void clickOnRemoveFromCartButton() {
        clickOn(removeProductFromCart);
    }

    public void clickOnViewShoppingCart() {
        clickOn(viewShoppingCart);
    }

    public void clickOnEmptyCart () {
        clickOn(emptyCartButton);
    }
}
