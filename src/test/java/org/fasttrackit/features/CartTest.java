package org.fasttrackit.features;


import org.junit.Test;
import utils.EnvConstants;

public class CartTest extends BaseTest{

    @Test
    public void addToCartTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL,EnvConstants.USER_PASSWORD);
        searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
        cartSteps.clickAddProductToCart();
    }

    @Test
    public void addToCartSecondProductTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL,EnvConstants.USER_PASSWORD);
        searchSteps.searchAndSelectProduct("ISLA CROSSBODY HANDBAG");
        cartSteps.clickAddProductToCart();
    }
}
