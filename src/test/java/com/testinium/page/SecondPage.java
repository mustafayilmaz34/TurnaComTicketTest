package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.testinium.constants.ConstantSecondPage.*;

public class SecondPage extends BasePage {

    public SecondPage(WebDriver driver) {
        super(driver);
    }


    public ThirdPage secondProgress() throws InterruptedException {
        ticketTest();
        return new ThirdPage(getDriver());
    }

    public void ticketTest() throws InterruptedException {
        untilElementAppear(SELECT_FIRST_TICKET);
        clickElement(SELECT_FIRST_TICKET);
        untilElementAppear(SELECT_SECOND_TICKET);
        clickElement(SELECT_SECOND_TICKET);
        untilElementAppear(CONTINUE);
        clickElement(CONTINUE);

    }

}
