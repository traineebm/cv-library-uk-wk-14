package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[class='search-header__title'] h1")
    WebElement resultText;

    public String verifyTheResult() {
        Reporter.log("verifying the results " + resultText.toString() + "</br>");
        return getTextFromElement(resultText);
    }
}
