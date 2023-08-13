package tests;

import io.qameta.allure.Issue;
import lombok.extern.log4j.Log4j2;
import org.fortvision.models.UserData;
import org.fortvision.steps.AuthorizationStep;
import org.fortvision.steps.CoreStep;
import org.fortvision.steps.UserPageStep;
import org.fortvision.utils.JsonReader;
import org.testng.annotations.Test;

@Log4j2
public class FortvisionTest extends BaseTest {

    private CoreStep coreStep = new CoreStep();
    private AuthorizationStep authorizationStep = new AuthorizationStep();
    private UserPageStep userPageStep = new UserPageStep();

    @Test
    public void findMainLogo() {

        log.info("Find and check visible title on main page");
        coreStep.findTitle();
    }

    @Issue("Element not found")
    @Test
    public void openLearningCenterPage() {

        log.info("Open learning center page");
        coreStep.clickOnLearningCenterButton();
        coreStep.findTitle();
    }

    @Test(dataProvider = "userData", dataProviderClass = JsonReader.class)
    public void verificationOfSuccessfulAuthorization(UserData userData) {

        log.info("Verification of successful authorization");
        coreStep.clickOnLoginButton();
        authorizationStep.setEmail(userData.getEmail());
        authorizationStep.setPassword(userData.getPassword());
        authorizationStep.clickOnLogInButton();
        userPageStep.verificationOfUserTitle();
    }
}
