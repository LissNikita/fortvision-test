package org.fortvision.steps;

import io.qameta.allure.Step;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.fortvision.pages.AuthorizationPage;

@Data
@Log4j2
public class AuthorizationStep {

    AuthorizationPage authorizationPage = new AuthorizationPage();

    @Step("Set email")
    public void setEmail(String email) {
        log.info("Set email");
        authorizationPage.email
                .sendKeys(email);
    }

    @Step("Set password")
    public void setPassword(String password) {
        log.info("Set password");
        authorizationPage.password
                .sendKeys(password);
    }

    @Step("Click on LOG IN button")
    public void clickOnLogInButton() {
        log.info("Click on LOG IN button");
        authorizationPage.logInButton
                .click();
    }
}
