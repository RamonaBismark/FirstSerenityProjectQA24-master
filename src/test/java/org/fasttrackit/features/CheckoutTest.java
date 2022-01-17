package org.fasttrackit.features;

import org.junit.Test;
import utils.EnvConstants;

public class CheckoutTest extends BaseTest{

    @Test
    public void validCheckout(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL,EnvConstants.USER_PASSWORD);
        searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
        cartSteps.clickAddProductToCart();
    }
}
