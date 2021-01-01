package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;

public class DataTableStepDefinition {
DataTablesPage dataTablesPage=new DataTablesPage();
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataTablesPage.newButonu.click();
    }

    @Then("first name girer {string}")
    public void first_name_girer(String string) {
        dataTablesPage.firstNameTextBox.sendKeys(string);
    }

    @Then("last name girer {string}")
    public void last_name_girer(String string) {
        dataTablesPage.lastNameTextBox.sendKeys(string);
    }

    @Then("postion girer {string}")
    public void postion_girer(String string) {
        dataTablesPage.positionTextBox.sendKeys(string);
    }

    @Then("office girer {string}")
    public void office_girer(String string) {
        dataTablesPage.officeTextBox.sendKeys(string);
    }

    @Then("extention girer {string}")
    public void extention_girer(String string) {
        dataTablesPage.extensionTextBox.sendKeys(string);
    }

    @Then("start date girer {string}")
    public void start_date_girer(String string) {
        dataTablesPage.tarihTextBox.sendKeys(string);
    }

    @Then("Salary girer {string}")
    public void salary_girer(String string) {
        dataTablesPage.salaryTextBox.sendKeys(string);

    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dataTablesPage.createButonu.click();

    }





    @When("kullanici ilk isim ile arama yapar {string}")
    public void kullaniciIlkIsimIleAramaYapar(String string) {
        dataTablesPage.searchTextBox.sendKeys(string);
    }


    @Then("isim bolumunde isminin oldugunu dogrular {string}")
    public void isimBolumundeIsmininOldugunuDogrular(String string) {
        Assert.assertTrue(dataTablesPage.resultRow.getText().contains(string));
    }

    @And("{string} saniye bekler")
    public void saniyeBekler(String arg0) throws InterruptedException {
        int sure=Integer.parseInt(arg0);
        Thread.sleep(sure*1000);
    }
}
