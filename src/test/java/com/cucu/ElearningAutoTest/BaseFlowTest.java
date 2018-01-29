package com.cucu.ElearningAutoTest;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
        jsonUsageReport = "target/cucumber-usage.json",
        retryCount = 0,
        reportPrefix = "E-learning",
        overviewReport = true,
        coverageReport = true,
        featureOverviewChart = true,
        toPDF = true,
        detailedReport = true,
        detailedAggregatedReport = true,
        breakdownReport = true,
        systemInfoReport = true,
        usageReport = true,
        outputFolder = "target")
@CucumberOptions(plugin = { "html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" },
        features = {"target/test-classes/features"},
        tags = {"@knowledge_login"})
public class BaseFlowTest {
}