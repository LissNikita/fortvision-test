package org.fortvision.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    public SelenideElement titleLogo = $x("//img[@class = 'custom-logo']");
    public SelenideElement loginButton = $x("//a[@title = 'Login']");
    public SelenideElement solutionsButton = $(By.id("menu-item-234"));
    public SelenideElement marketingAutomationButton = $(By.id("menu-item-53"));
}
