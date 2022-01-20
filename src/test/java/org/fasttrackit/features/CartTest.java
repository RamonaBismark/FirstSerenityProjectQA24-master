package org.fasttrackit.features;


import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.junit.Test;
import utils.EnvConstants;

public class CartTest extends BaseTest{

    @Test
    public void addToCartTest (){
        loginSteps.doLogin(EnvConstants.USER_EMAIL,EnvConstants.USER_PASSWORD);
        searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
        cartSteps.clickAddProductToCart();
    }

    @Test
    public void checkCartTotalSummaryTest (){
        loginSteps.doLogin(EnvConstants.USER_EMAIL,EnvConstants.USER_PASSWORD);
        searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
        cartSteps.clickAddProductToCart();
        searchSteps.searchAndSelectProduct("ISLA CROSSBODY HANDBAG");
        cartSteps.clickAddProductToCart();
        searchSteps.searchAndSelectProduct("HERALD GLASS VASE");
        cartSteps.clickAddProductToCart();
        cartSteps.checkSubtotalPriceIsDisplayedCorrectly();

    }

    @Test
    public void removeFromCartProduct (){
        loginSteps.doLogin(EnvConstants.USER_EMAIL,EnvConstants.USER_PASSWORD);
        cartSteps.clickOnShoppingCart();
        cartSteps.clickOnRemoveFromCartButton();
    }

    @Test
    public void emptyCart (){
        loginSteps.doLogin(EnvConstants.USER_EMAIL,EnvConstants.USER_PASSWORD);
        cartSteps.clickOnShoppingCart();
        cartSteps.clickOnViewShoppingCart();
        cartSteps.clickOnEmptyCart();
    }





}
