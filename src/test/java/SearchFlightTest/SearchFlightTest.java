package SearchFlightTest;

import POM_Pages.SearchFlight;
import TestBase.TestBase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchFlightTest extends TestBase {


    SearchFlight searchFlight;

    @BeforeTest
    public void setup(){

        searchFlight=new SearchFlight();

    }

    @Test
    public void setSearchFlight(){
        initialisation();
    }


    /*@AfterTest
    public void TearDown(){
        driver.quit();
    }
*/}
