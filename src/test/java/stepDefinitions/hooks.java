package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.BrowserUtils;
import utils.Driver;
import utils.configurationReader;

public class hooks extends BrowserUtils{
    @Before
    public void setup() {
        Driver.getDriver();
        BrowserUtils.setTime();
        driver.manage().window().maximize();
        driver.get(configurationReader.getProperties("url"));
    }
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            byte[]data= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data,"image/png", scenario.getName());
        }
    }
}
