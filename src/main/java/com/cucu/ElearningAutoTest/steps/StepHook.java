package com.cucu.ElearningAutoTest.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by Administrator on 2018/1/24.
 */
public class StepHook {

    @Before
    public void setUp () throws Exception {
    }

    @After
    public void embedScreenshot (Scenario scenario) throws Exception {
        if(scenario.isFailed()){
            //Take screenshot logic goes here
            System.out.println("The scenario is failed!!!");
            System.out.println(scenario.getName());
        }
    }

    @After("@EL_login_logout")
    public void close_browser () throws InterruptedException {
        Thread.sleep(3000);
        DriverManager.close();
    }
}
