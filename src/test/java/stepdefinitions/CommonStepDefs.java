package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GoogleHomePage;
import utilities.Driver;

public class CommonStepDefs {

    @Then("close the application")
    public void close_the_application() throws InterruptedException {

        Thread.sleep(3000);
        Driver.closeDriver();

    }


    @Given("user navigates to {string}")
    public void userNavigatesTo(String url) {
        Driver.getDriver().get(url);
    }




}
