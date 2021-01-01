package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.WalmartPage;
import utilities.ConfigReader;
import utilities.Driver;

public class WalmartStepDefination {
    WalmartPage walmartPage=new WalmartPage();
    @When("kullanici walmart anasayfaya gider")
    public void kullanici_walmart_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("walmart_url"));

    }

    @And("walmart sayfa basliginin {string} icerdigini test eder")
    public void walmart_sayfa_basliginin_icerdigini_test_eder(String arananKelime) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(arananKelime));

    }


    @Then("walmart sayfasinda{string} icin arama yapar")
    public void walmartSayfasindaIcinAramaYapar(String arananKelime) {
        walmartPage.searchbox.sendKeys(arananKelime+ Keys.ENTER);
    }
}
