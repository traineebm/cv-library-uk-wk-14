package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "keywords")
    WebElement jobTitleField;

    @FindBy(id = "location")
    WebElement locationField;

    @FindBy(xpath = "//select[@id='distance']//option[@value='5']")
    WebElement distanceDropDown;

    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;

    @FindBy(id = "salarymin")
    WebElement salaryMin;

    @FindBy(id = "salarymax")
    WebElement salaryMax;

    @FindBy(xpath = "//select[@id='salarytype']//option[@value='month']")
    WebElement salaryTypeDropDown;

    @FindBy(xpath = "//select[@id='tempperm']//option[@value='Permanent']")
    WebElement jobTypeDropDown;

    @FindBy(id = "hp-search-btn")
    WebElement findJobsButton;

    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;

    @FindBy(id = "gdpr-consent-notice")
    WebElement iframe;

    public void acceptAllCookies() throws InterruptedException {
        Thread.sleep(2000);
        driver.switchTo().frame("gdpr-consent-notice");
        driver.switchTo().defaultContent();
        clickOnElement(acceptCookies);
    }

    public void enterJobTitle(String jobTitle){
        Reporter.log("Entering Job Title "+jobTitleField.toString()+"</br>");
        sendTextToElement(jobTitleField, jobTitle);
    }

    public void enterLocation(String location){
        Reporter.log("Entering Location "+ locationField.toString()+"</br>");
        sendTextToElement(locationField, location);
    }

    public void selectDistance(String distance) throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Selecting Distance "+distanceDropDown.toString()+"</br>");
        selectByValueFromDropDown(distanceDropDown, distance);
    }

    public void clickOnMoreSearchOptionLink(){
        Reporter.log("Clicking on more search Option Link "+moreSearchOptionsLink.toString()+"</br>");
        clickOnElement(moreSearchOptionsLink);
    }

    public void enterMinimumSalary(String minSalary){
        Reporter.log("Entering Minimum Salary "+salaryMin.toString()+"</br>");
        sendTextToElement(salaryMin, minSalary);
    }

    public void enterMaximumSalary(String maxSalary){
        Reporter.log("Entering Max Salary "+salaryMax.toString()+"</br>");
        sendTextToElement(salaryMax, maxSalary);
    }

    public void selectSalaryType(String salaryType){
        Reporter.log("Selecting Salary Type "+salaryTypeDropDown.toString()+"</br>");
        selectByValueFromDropDown(salaryTypeDropDown, salaryType);
    }

    public void selectJobType(String jobType){
        Reporter.log("Selecting Job Type "+jobTypeDropDown.toString()+"</br>");
       selectByValueFromDropDown(jobTypeDropDown, jobType);
    }

    public void clickOnFindJobsButton(){
        Reporter.log("Clicking on find jobs button "+findJobsButton.toString()+"</br>");
        clickOnElement(findJobsButton);
    }
}
