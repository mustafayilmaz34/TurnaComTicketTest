package com.testinium.constants;

import com.testinium.base.BasePage;
import com.testinium.page.FirstPage;
import org.openqa.selenium.By;

public class ConstantMainPage {

    public static final By ROUND_TRIP = By.xpath("//span[@class='label'][contains(.,'Gidiş - Dönüş')]");



    public static final By FLIGHT_FROM_BOX = By.id("flight-from");

    public static final By FLIGHT_TO_BOX = By.id("flight-to");

    public static final By CLICK_TO_CITY1 = By.xpath("(//li[contains(@tabindex,'-1')])[1]");


    public static final By CLICK_TO_CITY2 = By.xpath("//li[@tabindex='-1']");

    public static final By FIRST_DATE_BOX = By.xpath("//input[@placeholder='Gidiş Tarihi']");

    public static final By FIRST_DATE = By.xpath("(//a[contains(.,'27')])[1]");

    public static final By SECOND_DATE_BOX= By.xpath("//input[@placeholder='Dönüş Tarihi']");

    public static final By SECOND_DATE = By.xpath("(//a[@href='#'])[18]");

    public static final By SEARCH_BUTTON = By.xpath("//div[@id='btnSearch']");

    //public static final By ONLY = By.xpath("(//span[@class='label'][contains(.,'Tek Yön')]");

}


