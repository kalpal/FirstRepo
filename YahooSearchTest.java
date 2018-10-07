testSearch_renamedpackage YahooSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

public class YahooSearchTest {
    private WebDriver ydriver;

    @BeforeTest
    public void setupDriver(){
//C:\Users\kpalaniswamy\IdeaProjects\Webdriverbootcamp\src\test\resource\geckodriver.exe
        File file = new File("src/test/resource");
        String path = file.getAbsolutePath();
        System.setProperty("webdriver.gecko.driver", path+"\\geckodriver.exe");
        //System.out.println(path+"\\geckodriver.exe");
        ydriver = new FirefoxDriver();
    }
    @Test
    public void MYCOOLTEST() throws Exception{
        navigateToMainPage();
        typeRequestInSearchInput();
       /*submitSearch();
        printAmountOfResult();*/
    }
    private void navigateToMainPage(){
        String url = "https://yahoo.com";
        ydriver.get(url);

    }
    private void typeRequestInSearchInput(){
        ydriver.findElement(By.id("uh-search-box")).sendKeys("What is the weather today");
    }

}
