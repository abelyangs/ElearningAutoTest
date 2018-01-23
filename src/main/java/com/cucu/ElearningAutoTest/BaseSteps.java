package com.cucu.ElearningAutoTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.openqa.selenium.support.PageFactory.initElements;

public class BaseSteps implements En {

    private WebDriver driver = new FirefoxDriver();
    private BlogPage blogPage = new BlogPage();

    @Given("^I enter my blog address \"([^\"]*)\" and go to Home page$")
    public void goUrl (String url) {
        driver.get(url);
    }

    @When("^I click the search button$")
    public void clickSearchBtn () {
        blogPage = initElements(driver, BlogPage.class);
        blogPage.clickSearchButton();
    }

    @And("^I enter \"([^\"]*)\" in the input field$")
    public void enterSearchContent (String keyword) {
        blogPage.inputSearchWording(keyword);
    }

    @And("^I click the first result of search$")
    public void clickFirstResult () {
        blogPage.clickFirstResultOfSearch();
    }

    @Then("^I go to the article page with title containing \"([^\"]*)\"$")
    public void goArticlePage (String keyword) {
//        assertContainsIngoreCase(blogPage.getArticleTitle(), keyword);
    }

//    public static void assertContainsIngoreCase(String set, String subset) {
//        assertThat(set.toLowerCase(), containsString(subset.toLowerCase()));
//    }
}
