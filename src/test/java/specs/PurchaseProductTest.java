package specs;

import core.utils.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class PurchaseProductTest extends BaseTest {
    protected final Logger LOGGER = LoggerFactory.getLogger(PurchaseProductTest.class);
    private String AMOUNT = "50000";
    private String CUSTOMER_NAME = "Satyam Mishra";
    private String CUSTOMER_EMAIL = "satyam@yopmail.com";
    private String CUSTOMER_PHONE_NUMBER = "9874563211";
    private String CUSTOMER_CITY = "Bangalore";
    private String CUSTOMER_ADDRESS = "BTM Bangalore, karnataka, India";
    private int CUSTOMER_POSTAL_CODE = 560026;

    @Test(description = "To verify, user is able to view the shopping cart.", priority = 0)
    public void testShoppingCart() {
        helperActionsUtils.getUrl();
        commonActions.clickOnBuyNowButton();
        commonActions.verifyShoppingCartModalPopup();
        softAssert.assertAll();
    }

    @Test(description = "To verify, user is able to add the details in the cart.", priority = 1)
    public void testUpdateDetails() {
        commonActions.clearProductAmount();
        commonActions.enterProductAmount(AMOUNT);
        commonActions.verifyTotalAmount(AMOUNT);
        commonActions.enterCustomerDetails(CUSTOMER_NAME, CUSTOMER_EMAIL, CUSTOMER_PHONE_NUMBER,
                CUSTOMER_CITY, CUSTOMER_ADDRESS, CUSTOMER_POSTAL_CODE);
        commonActions.clickOnCheckOutButton();
        softAssert.assertAll();
    }

    @Test(description = "To verify, user is able verify the order summary", priority = 1)
    public void testVerifyOrderSummary() {

    }

    @AfterMethod(description = "Added for taking the screenshot on failure and for any cases")
    public void takeScreenshot(ITestResult result) {
        getFailedScreenshot(result);
        getScreenshotOnAnyCase(result);
    }
}
