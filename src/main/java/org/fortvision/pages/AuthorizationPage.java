package org.fortvision.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AuthorizationPage {

    public SelenideElement email = $x("//input[@id = 'email'] ");
    public SelenideElement password = $x("//input[@id = 'password'] ");
    public SelenideElement logInButton = $x("//button[contains(text(), ' LOG IN ')]");
}
