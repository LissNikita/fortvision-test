package org.fortvision.steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.fortvision.pages.UserPage;

import static com.codeborne.selenide.Condition.text;

@Log4j2
public class UserPageStep {

    private final String titleForUser = "Good Evening Nikita Lisov!";

    UserPage userPage = new UserPage();

    @Step("Verification of user title")
    public void verificationOfUserTitle() {
        log.info("Verification of user title");
        userPage.titleOfUser
                .shouldHave(text(titleForUser));
    }
}
