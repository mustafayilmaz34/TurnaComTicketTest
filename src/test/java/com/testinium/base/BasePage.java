package com.testinium.base;

import com.testinium.page.FirstPage;
import com.testinium.page.SecondPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;
    public  Actions actions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.actions=new Actions(driver);
        this.wait = new WebDriverWait(driver, 10);

    }

    public WebElement findElement(By by) {
        untilElementAppear(by);
        return driver.findElement(by);
    }

    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    public void clickElement(By by) {
        untilElementClickable(by);
        findElement(by).click();
    }

    public void sendKeys(By by, String text) {
        isElementDisplayed(by);
        findElement(by).sendKeys(text);
    }

    public void selectOptionByValue(By by, String value) {
        Select select = new Select(findElement(by));
        select.selectByValue(value);
    }

    public boolean isElementDisplayed(By by) {

        return findElement(by).isDisplayed();
    }


    public void untilElementAppear(By by) {
        System.out.println("Elementin var olması bekleniyor...");
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void untilElementClickable(By by) {
        System.out.println("Elementin tıklanabilir olması bekleniyor...");
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public void waitSeconds (int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void cleanElement(By by){
        WebElement webElement = getDriver().findElement(by);
        webElement.clear();
    }


    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public FirstPage getDemoPage() {
        return new FirstPage(driver);
    }

    public SecondPage getLoginPage() {
        return new SecondPage(driver);
    }

}
