package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.DataTablesPage;

public class DataTablesStepDefs {

    DataTablesPage dataTablesPage = new DataTablesPage();

    @When("user clicks on new button")
    public void user_clicks_on_new_button() {

        dataTablesPage.newButton.click();

    }

    @When("user enters first name as {string}")
    public void user_enters_first_name_as(String firstname) {

        dataTablesPage.firstname.sendKeys(firstname);

    }

    @When("user enters last name as {string}")
    public void user_enters_last_name_as(String lastname) {

    }

    @When("user enters position as {string}")
    public void user_enters_position_as(String position) {

    }

    @When("user enters office as {string}")
    public void user_enters_office_as(String office) {

    }

    @When("user enters extension as {string}")
    public void user_enters_extension_as(String extension) {

    }

    @When("user enters start date as {string}")
    public void user_enters_start_date_as(String startDate) {

    }

    @When("user enters salary as {string}")
    public void user_enters_salary_as(String salary) {

    }

    @When("user clicks on create button")
    public void user_clicks_on_create_button() {

    }




}
