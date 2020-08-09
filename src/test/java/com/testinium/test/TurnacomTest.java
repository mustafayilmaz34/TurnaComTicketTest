package com.testinium.test;

import com.testinium.base.BaseTest;
import com.testinium.page.FirstPage;
import org.junit.Before;
import org.junit.Test;

public class TurnacomTest extends BaseTest {

    FirstPage demoPage;

    @Before
    public void before() {

        demoPage = new FirstPage(getDriver());
        getDriver().navigate().to("https://www.turna.com/");
    }


    @Test
    public void wakeUpChromeTest() throws InterruptedException {
        demoPage.progress().secondProgress().fillForm();
    }

}
