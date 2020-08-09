package com.testinium.page;
import com.testinium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static com.testinium.constants.ConstantMainPage.*;
import static com.testinium.constants.ConstantSecondPage.SELECT_FIRST_TICKET;

public class FirstPage extends BasePage {

    public FirstPage(WebDriver driver) {

        super(driver);
    }
    public SecondPage progress()throws InterruptedException{
        cityNameKeysTest();
        datePickTest();

        return new SecondPage(getDriver());
    }


    public void cityNameKeysTest() throws InterruptedException {
        untilElementAppear(FLIGHT_FROM_BOX);
        clickElement(ROUND_TRIP);
        sendKeys(FLIGHT_FROM_BOX, "İstanbul");
        sendKeys(FLIGHT_TO_BOX, "İzmir");
        clickElement(CLICK_TO_CITY2);
        waitSeconds(1);

    }

    public void datePickTest() throws InterruptedException {
        clickElement(FIRST_DATE_BOX);

        clickElement(FIRST_DATE);

        clickElement(By.className("popup-close"));
        clickElement(SECOND_DATE_BOX);

        clickElement(SECOND_DATE);

        clickElement(SEARCH_BUTTON);
        untilElementAppear(SELECT_FIRST_TICKET);


    }
}
