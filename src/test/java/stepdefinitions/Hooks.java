package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @Before  //her senaryodan önce çalışır. junitteki before ve testng deki beforeMethod gibi
    public void setup(){
        System.out.println("before method çalıştı");
    }

    @After  //her senaryodan sonra çalışır junitteki after ve testng deki afterMethod gibi

       public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();
    }

}
