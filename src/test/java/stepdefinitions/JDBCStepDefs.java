package stepdefinitions;

import io.cucumber.java.en.*;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class JDBCStepDefs {

    @Given("user connects to the application database")
    public void user_connects_to_the_application_database() {
        DBUtils.createConnection();
    }

    @When("user gets the column {string} from the table {string}")
    public void user_gets_the_column_from_the_table(String columnName, String tableName) {

        String query = "SELECT " + columnName + " FROM " + tableName;

        DBUtils.executeQuery(query);

    }

    @Then("user reads all column {string} data")
    public void user_reads_all_column_data(String columnName) throws SQLException {

        DBUtils.getResultset().next();//This will move the pointer to the 1st row
        Object object1 = DBUtils.getResultset().getObject(columnName);
        System.out.println("1: " + object1);
        DBUtils.getResultset().next();//This will move the pointer to the 2nd row
        Object object2 = DBUtils.getResultset().getObject(columnName);
        System.out.println("2: " + object2);

        int counter = 2;
        while (DBUtils.getResultset().next()) {
            counter++;
            Object object = DBUtils.getResultset().getObject(columnName);
            System.out.println(counter + ": " + object);
        }
    }


    @Then("verify table {string} and column {string} contains following data {string}")
    public void verify_table_and_column_contains_following_data(String tableName, String columnName, String data) {

        String query = "SELECT "+columnName+" FROM "+tableName;

        List<Object> columnList = DBUtils.getColumnData(query, columnName);
        System.out.println("columnList = " + columnList);
        assertTrue(columnList.contains(data));

    }
    @And("close the connection")
    public void closeTheConnection() {

        DBUtils.closeConnection();

    }
}