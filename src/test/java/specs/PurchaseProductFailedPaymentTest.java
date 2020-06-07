package specs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class PurchaseProductFailedPaymentTest extends BaseTest {

    protected final Logger LOGGER = LoggerFactory.getLogger(PurchaseProductFailedPaymentTest.class);
    private String AMOUNT = "50000";
    private String CUSTOMER_NAME = "Satyam Mishra";
    private String CUSTOMER_EMAIL = "satyam@yopmail.com";
    private String CUSTOMER_PHONE_NUMBER = "9876541231";
    private String CUSTOMER_CITY = "Bangalore";
    private String CUSTOMER_ADDRESS = "BTM Bangalore, karnataka, India";
    private int CUSTOMER_POSTAL_CODE = 560026;
    private String FAILED_PAYMENT_CARD_NUMBER = "4911111111111113";
    private String CARD_EXPIRY_DATE = "0521";
    private String CARD_CVV_NUMBER = "123";
    private String CARD_OTP_NUMBER = "112233";

    @Test(description = "To verify, user is able to view the shopping cart.", priority = 0)
    public void testShoppingCart() {
        helperActionsUtils.getUrl();
        purchaseProductActions.clickOnBuyNowButton();
        purchaseProductActions.verifyShoppingCartModalPopup();
        softAssert.assertAll();
    }

    @Test(description = "To verify, user is able to add the details in the cart.", priority = 1)
    public void testUpdateDetails() {
        purchaseProductActions.clearProductAmount();
        purchaseProductActions.enterProductAmount(AMOUNT);
        purchaseProductActions.verifyTotalAmount(AMOUNT);
        purchaseProductActions.enterCustomerDetails(CUSTOMER_NAME, CUSTOMER_EMAIL, CUSTOMER_PHONE_NUMBER,
                CUSTOMER_CITY, CUSTOMER_ADDRESS, CUSTOMER_POSTAL_CODE);
        purchaseProductActions.clickOnCheckOutButton();
        softAssert.assertAll();
    }

    @Test(description = "To verify, user is able verify the order summary", priority = 2)
    public void testVerifyOrderSummary() {
        purchaseProductActions.verifyOrderAmount(AMOUNT);
        purchaseProductActions.verifyOrderProductName();
        purchaseProductActions.clickOnShippingDetails();
        purchaseProductActions.verifyUserName(CUSTOMER_NAME);
        purchaseProductActions.verifyUserPhoneNumber(CUSTOMER_PHONE_NUMBER);
        purchaseProductActions.verifyUserEmail(CUSTOMER_EMAIL);
        purchaseProductActions.clickOnContinueButton();
        purchaseProductActions.selectCreditCardPaymentMethod();
        softAssert.assertAll();
    }

    @Test(description = "To verify, user is able make the successful payment", priority = 3)
    public void testMakeSuccessfulPayment() throws AWTException {
        purchaseProductActions.enterCardNumber(FAILED_PAYMENT_CARD_NUMBER);
        purchaseProductActions.enterExpiryDate(CARD_EXPIRY_DATE);
        purchaseProductActions.enterCardCvvNumber(CARD_CVV_NUMBER);
        purchaseProductActions.clickOnPayNowButton();
        purchaseProductActions.enterOtpNumber(CARD_OTP_NUMBER);
        purchaseProductActions.clickOnOkButton();
        softAssert.assertAll();
    }

    @Test(description = "To verify, user is able view the Failed transaction screen after successful payment", priority = 4,
            dependsOnMethods = "testMakeSuccessfulPayment")
    public void testToVerifyFailedTransactionScreen() {
        purchaseProductActions.verifyPaymentFailureScreen();
        softAssert.assertAll();
    }

    @AfterMethod(description = "Added for taking the screenshot on failure and for any cases")
    public void takeScreenshot(ITestResult result) {
        getFailedScreenshot(result);
        getScreenshotOnAnyCase(result);
    }

}
