package com.testinium.constants;

import org.openqa.selenium.By;

public class ConstantThirdPage {
    public static final By GENDER = By.xpath("//span[contains(.,'Erkek')]");
    public static final By CUSTOMER_NAME = By.xpath("(//input[@maxlength='20'])[1]");
    public static final By CUSTOMER_SURNAME = By.xpath("(//input[@maxlength='20'])[2]");
    public static final By BIRTH_DAY = By.xpath("//select[@class='datepicker-select day-select day-of-birth']");
    public static final By BIRTH_MONTH = By.xpath("//select[@class='datepicker-select month-select month-of-birth']");
    public static final By BIRTH_YEAR = By.xpath("//select[@class='datepicker-select year-select year-of-birth']");
    public static final By CUSTOMER_ID = By.xpath("(//input[contains(@maxlength,'11')])[1]");
    public static final By HES_CODE = By.xpath("//input[@placeholder='HES Kodu']");
    public static final By PHONE = By.id("txtPhone");
    public static final By E_MAIL = By.id("txtEmail");
    public static final By PAY_BUTTON = By.xpath("//button[contains(.,'Ödemeye İlerle')]");

}





