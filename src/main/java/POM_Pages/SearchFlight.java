package POM_Pages;

import TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFlight extends TestBase {



    @FindBy(xpath ="//input[@id='RoundTrip']")
    WebElement RoundTripRadioButton;

    @FindBy(xpath = "//input[@id='FromTag']")
    WebElement FromTextBox;

    @FindBy(xpath = "(//li[@class='list']/a)[1]")
    WebElement sourceTextBox;

    @FindBy(xpath = "//input[@id='ToTag']")
    WebElement ToTextBox;

    @FindBy(xpath = "(//li[@class='list']/a)[1]")
    WebElement destinationTextBox;

    @FindBy(xpath = "//input[@id='DepartDate']")
    WebElement departDate;

    @FindBy(xpath = "//input[@id='ReturnDate']")
    WebElement Returndate;



}
