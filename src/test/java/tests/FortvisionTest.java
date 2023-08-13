package tests;

import io.qameta.allure.Issue;
import lombok.extern.log4j.Log4j2;
import org.fortvision.steps.CoreStep;
import org.testng.annotations.Test;

@Log4j2
public class FortvisionTest extends BaseTest {

    private CoreStep coreStep = new CoreStep();

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
}
