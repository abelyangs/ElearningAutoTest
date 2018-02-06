package com.cucu.ElearningAutoTest.steps;

import com.cucu.ElearningAutoTest.common.CommFun;
import com.cucu.ElearningAutoTest.pages.BlogPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;
import org.apache.log4j.Logger;

import static com.cucu.ElearningAutoTest.pages.BlogPage.searchButton;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.openqa.selenium.support.PageFactory.initElements;

public class BaseSteps implements En {

    static Logger log = Logger.getLogger(BaseSteps.class);
    private BlogPage blogPage = new BlogPage();

    @Given("^I enter my blog address \"([^\"]*)\" and go to Home page$")
    public void goUrl (String url) throws Throwable {
        DriverManager.getCurrentDriver().get(url);
    }

    @When("^I click the search button$")
    public void clickSearchBtn () throws InterruptedException {
        blogPage = initElements(DriverManager.getCurrentDriver(), BlogPage.class);
        CommFun.waitElementClickable(DriverManager.getCurrentDriver(), searchButton);
        blogPage.clickSearchButton();
    }

    @And("^I enter \"([^\"]*)\" in the input field$")
    public void enterSearchContent (String field) {
        blogPage.searchInput.clear();
        blogPage.inputSearchWording(field);
    }

    @And("^I click the first result of search$")
    public void clickFirstResult () {
        blogPage.clickFirstResultOfSearch();
    }

    @Then("^I go to the article page with title containing \"([^\"]*)\"$")
    public void goArticlePage (String keyword) {
        assertContainsIngoreCase(blogPage.getArticleTitle(), keyword);
    }

    public static void assertContainsIngoreCase(String set, String subset) {
        assertThat(set.toLowerCase(), containsString(subset.toLowerCase()));
    }
}
