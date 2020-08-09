package com.testinium.page;
import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;
import static com.testinium.constants.ConstantThirdPage.*;

public class ThirdPage extends BasePage {

    public ThirdPage(WebDriver driver) {
        super(driver);
    }

    public void fillForm(){
        untilElementAppear(CUSTOMER_NAME);
        clickElement(GENDER);
        sendKeys(CUSTOMER_NAME,"Mustafa");
        untilElementAppear(CUSTOMER_SURNAME);
        sendKeys(CUSTOMER_SURNAME,"Yılmaz");
        selectOptionByValue(BIRTH_DAY,"27");
        selectOptionByValue(BIRTH_MONTH,"08");
        selectOptionByValue(BIRTH_YEAR,"1990");
        sendKeys(CUSTOMER_ID,"11111111111");
        sendKeys(HES_CODE,"4444444444");
        sendKeys(PHONE,"5555555555");
        sendKeys(E_MAIL,"info@deneme.com");
        clickElement(PAY_BUTTON);
    }
}
