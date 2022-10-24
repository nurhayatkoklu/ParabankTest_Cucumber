package StepDefinitions;

import Utilities.GenelWebDriver;
import org.junit.*;

public class Hooks {
    @Before
    public void before()
    {
        System.out.println("Senaryo başladı");
    }

    @After
    public void after()
    {
            GenelWebDriver.quitDriver();
    }
}
