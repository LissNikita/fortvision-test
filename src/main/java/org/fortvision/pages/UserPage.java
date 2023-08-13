package org.fortvision.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class UserPage {

    public SelenideElement titleOfUser = $x("//div[contains(text(), 'Good Evening Nikita Lisov!')]");
}
