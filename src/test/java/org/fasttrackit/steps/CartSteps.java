package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;


public class CartSteps extends BaseSteps {


    @Step
    public void clickAddProductToCart(){
        productPage.clickAddToCartButton();
    }
}
