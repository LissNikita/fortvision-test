package org.fortvision.steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.fortvision.pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

@Log4j2
public class CoreStep {

    MainPage mainPage = new MainPage();

    @Step("Find and check visible title on main page")
    public void findTitle(){
        log.info("Find and check visible title on main page");
        mainPage.titleLogo
                .shouldBe(visible);
    }
}
