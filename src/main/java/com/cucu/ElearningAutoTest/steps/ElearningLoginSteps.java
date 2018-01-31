package com.cucu.ElearningAutoTest.steps;

import com.cucu.ElearningAutoTest.common.CommFun;
import com.cucu.ElearningAutoTest.pages.ElearningLoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import static org.openqa.selenium.support.PageFactory.initElements;

/**
 * Created by Administrator on 2018/1/31.
 */
public class ElearningLoginSteps {

    private ElearningLoginPage elearningLoginPage;

    @Given("^Enter E-learning address \"([^\"]*)\"$")
    public void iEnterELearningAddress(String url) throws Throwable {
        DriverManager.getCurrentDriver().get(url);
    }

    @And("^User enter the user name is \"([^\"]*)\"$")
    public void userEnterTheUserNameIs(String username) throws Throwable {
        elearningLoginPage = initElements(DriverManager.getCurrentDriver(), ElearningLoginPage.class);
        elearningLoginPage.userNameBox.clear();
        elearningLoginPage.inputUserName(username);
    }

    @And("^User enter the password is \"([^\"]*)\"$")
    public void userEnterThePasswordIs(String password) throws Throwable {
        elearningLoginPage.passwordBox.clear();
        elearningLoginPage.inputPassword(password);
    }

    @And("^User click the login button$")
    public void userClickTheLoginButton() throws Throwable {
        CommFun.waitElementClickable(DriverManager.getCurrentDriver(),elearningLoginPage.submitBtn);
        elearningLoginPage.clickLoginBtn();
    }

    @Then("^The user login status is \"([^\"]*)\"$")
    public void theUserLoginStatusIs(String status) throws InterruptedException {
        if (status.equals("successfully")) {
            CommFun.waitElementAppear(DriverManager.getCurrentDriver(), elearningLoginPage.by_elearningLogo);
            Assert.assertTrue(elearningLoginPage.elearningLogo.isDisplayed());
        }else if (status.equals("failed")) {
            try {
                Assert.assertFalse(elearningLoginPage.elearningLogo.isDisplayed());
                Assert.fail("element is not exist!");
            }catch (NoSuchElementException e) {

            }

        }
    }
}
