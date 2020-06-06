package specs;

import core.utils.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class PurchasePillow extends BaseTest {
    protected final Logger LOGGER = LoggerFactory.getLogger(PurchasePillow.class);

    @Test(description = "To verify, login feature of the application")
    public void testLoginToApplication() {
        helperActionsUtils.getUrl();
        commonActions.clickOnBuyNowButton();
    }

    @AfterMethod(description = "Added for taking the screenshot on failure and for any cases")
    public void takeScreenshot(ITestResult result) {
        getFailedScreenshot(result);
        getScreenshotOnAnyCase(result);
    }



}
