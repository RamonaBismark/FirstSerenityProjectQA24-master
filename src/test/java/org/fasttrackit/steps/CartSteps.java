package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;


public class CartSteps extends BaseSteps {


    @Step
    public void clickAddProductToCart(){
        productPage.clickAddToCartButton();
    }

    @Step
    public void clickOnShoppingCart(){
        productPage.clickOnShoppingCart();
    }

    @Step
    public void clickOnRemoveFromCartButton(){
        productPage.clickOnRemoveFromCartButton();
    }

    @Step
    public void clickOnViewShoppingCart(){
        productPage.clickOnViewShoppingCart();
    }

    @Step
    public void clickOnEmptyCart (){
        productPage.clickOnEmptyCart();
    }

    @Step
    public void navigateToCart (){
        homePage.clickOnCartIcon ();
        homePage.clickOnViewShoppingCartLink ();
    }

    @Step
    public void checkSubtotalPriceIsDisplayedCorrectly(){
        Assert.assertTrue("The subtotal price is not correct!" , cartPage.isSubtotalPriceCorrect());
    }
}
