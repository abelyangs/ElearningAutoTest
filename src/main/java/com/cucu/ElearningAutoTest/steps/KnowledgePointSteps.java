package com.cucu.ElearningAutoTest.steps;

import com.cucu.ElearningAutoTest.pages.KnowledgePointPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.support.PageFactory.initElements;

/**
 * Created by Administrator on 2018/1/29.
 */
public class KnowledgePointSteps {

    private WebDriver driver = new FirefoxDriver();

    private KnowledgePointPage knowledgePointPage =  new KnowledgePointPage();

    @Given("^I enter E-learning address \"([^\"]*)\"$")
    public void iEnterELearningAddress(String url) throws Throwable {
        driver.get(url);
    }

    @And("^User enter the user name is \"([^\"]*)\"$")
    public void userEnterTheUserNameIs(String username) throws Throwable {
        knowledgePointPage = initElements(driver, KnowledgePointPage.class);
        knowledgePointPage.inputUserName(username);
    }

    @And("^User enter the password is \"([^\"]*)\"$")
    public void userEnterThePasswordIs(String password) throws Throwable {
        knowledgePointPage.inputPassword(password);
    }

    @And("^User click the login button$")
    public void userClickTheLoginButton() throws Throwable {
        knowledgePointPage.clickLoginBtn();
    }

    @When("^User click the knowledge menu btn$")
    public void userClickTheKnowledgeMenuBtn() throws Throwable {
        knowledgePointPage.clickKnowledgePointMenuBtn();
    }

    @And("^Select the status value is \"([^\"]*)\"$")
    public void selectTheStatusValueIs(String status) throws Throwable {
        Thread.sleep(3000);
        Select s_status = new Select(knowledgePointPage.select_status);
        if(status.equals("Active")) {
            s_status.selectByIndex(0);
        }else if (status.equals("Inactive")) {
            s_status.selectByIndex(1);
        }else{
            s_status.selectByIndex(2);
        }
    }

    @Then("^Click the Search btn$")
    public void clickTheSearchBtn() throws Throwable {
        knowledgePointPage.clickSubSearchBtn();
    }

    @And("^The table will populate the data for active type$")
    public void theTableWillPopulateTheDataForActiveType() throws Throwable {
        Thread.sleep(3000);
        driver.close();
    }
}
