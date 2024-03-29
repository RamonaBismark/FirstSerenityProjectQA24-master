package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.*;
import utils.EnvConstants;

public class BaseSteps extends ScenarioSteps {
    public ProductPage productPage;
    public HomePage homePage;
    public LoginPage loginPage;
    public MyAccountPage myAccountPage;
    public SearchResultsPage searchResultsPage;
    public CartPage cartPage;



    @Step
    public void navigateToAdminHomepage () {
        getDriver().get(EnvConstants.ADMINBASE_URL);
    }


    @Step
    public void navigateToHomePage (){
        getDriver().get(EnvConstants.BASE_URL);
    }




}
