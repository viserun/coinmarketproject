package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataComparisonStepdefs {
    public static WebDriver driver = null;
    @Given("a user navigates on the URL")
    public void aUserNavigatesOnTheURL() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\44788\\Desktop\\PrepMajorTraining\\src\\test\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://coinmarketcap.com");
        driver.manage().window(). maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        Thread.sleep(3000);
    }

    @When("a user clicks on sets row")
    public void aUserClicksOnSetsRow() throws InterruptedException {
        driver.findElement(By.id("//*[@id=\"__next\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"tippy-1\"]/div/div[1]/div/div/button[3]")).click();
    }

    @And("a user select rows to {int}")
    public void aUserSelectRowsTo(int arg0) {
    }

    @And("a user clicks on filter")
    public void aUserClicksOnFilter() {
    }

    @And("a user clicks on Algorith")
    public void aUserClicksOnAlgorith() {
    }

    @And("a user clicks on PoW")
    public void aUserClicksOnPoW() {
    }

    @And("a user clicks on + Add Filter")
    public void aUserClicksOnAddFilter() {
    }

    @And("a user clicks on toggle Mineable")
    public void aUserClicksOnToggleMineable() {
    }

    @And("a user selects All cryptocurrencies")
    public void aUserSelectsAllCryptocurrencies() {
    }

    @And("a user selects Coins")
    public void aUserSelectsCoins() {
    }

    @And("a user selects price and set min value {int} and max value to {int}")
    public void aUserSelectsPriceAndSetMinValueAndMaxValueTo(int arg0, int arg1) {
    }

    @Then("a user can conpare page content to the content in step {int}")
    public void aUserCanConparePageContentToTheContentInStep(int arg0) {
    }
}
