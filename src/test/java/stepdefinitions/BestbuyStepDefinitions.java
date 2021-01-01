package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class BestbuyStepDefinitions {
    @Given("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }


    @Then("{string} de oldugunu test eder")
    public void deOldugunuTestEder(String istenenUrl) {
        Assert.assertEquals(ConfigReader.getProperty(istenenUrl),Driver.getDriver().getCurrentUrl());
    }
}
