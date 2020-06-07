package core.pageModules.pagesActions;

import core.helperActions.HelperActionsUtils;
import core.pageModules.iPageRepository.PurchaseProductLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class PurchaseProductActions extends HelperActionsUtils implements PurchaseProductLocators {

    WebDriver driver;
    protected final Logger LOGGER = LoggerFactory.getLogger(PurchaseProductActions.class);
    private String mainProductName = "";

    public PurchaseProductActions(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickOnBuyNowButton() {
        getProductName();
        softAssert.assertEquals(isDisplayed(BUY_NOW_BUTTON), true,
                "Buy Now button not displayed");
        safeClick(BUY_NOW_BUTTON);
        LOGGER.info("Successfully clicked on Buy Now button!!");
    }

    public String getProductName() {
        mainProductName = getText(PRODUCT_NAME);
        LOGGER.info("Successfully fetched the product name and it is: " + mainProductName);
        return mainProductName;
    }

    public void verifyShoppingCartModalPopup() {
        softAssert.assertEquals(isDisplayed(SHOPPING_CART_MODAL_POPUP), true,
                "Buy Now button not displayed");
        LOGGER.info("Successfully displayed the shopping cart!!");
    }

    public void clearProductAmount() {
        softAssert.assertEquals(isDisplayed(AMOUNT_FIELD), true,
                "Amount Field not displayed");
        safeClear(AMOUNT_FIELD);
        LOGGER.info("Successfully cleared the amount!!");
    }

    public void enterProductAmount(String amount) {
        safeType(AMOUNT_FIELD, amount);
        LOGGER.info("Successfully entered the amount!!");
    }

    public void verifyTotalAmount(String enteredAmount) {
        String fetchedAmount = getText(TOTAL_AMOUNT_FIELD).replaceAll(",", "");
        softAssert.assertEquals(fetchedAmount, enteredAmount, "Total amount is not matching!!");
        LOGGER.info("Successfully fetched the total amount and it is: " + fetchedAmount);
    }

    public void enterUpdatedCustomerName(String name) {
        softAssert.assertEquals(isDisplayed(NAME_FIELD), true,
                "Name Field not displayed");
        safeClear(NAME_FIELD);
        LOGGER.info("Successfully cleared the customer name!!");
        safeType(NAME_FIELD, name);
        LOGGER.info("Successfully entered the customer name!!");
    }

    public void enterUpdatedCustomerEmail(String email) {
        softAssert.assertEquals(isDisplayed(EMAIL_FIELD), true,
                "Email Field not displayed");
        safeClear(EMAIL_FIELD);
        LOGGER.info("Successfully cleared the customer email!!");
        safeType(EMAIL_FIELD, email);
        LOGGER.info("Successfully entered the customer email!!");
    }

    public void enterUpdatedCustomerPhoneNumber(String  phoneNumber) {
        softAssert.assertEquals(isDisplayed(PHONE_NUMBER_FIELD), true,
                "Phone number Field not displayed");
        safeClear(PHONE_NUMBER_FIELD);
        LOGGER.info("Successfully cleared the customer phone number!!");
        safeType(PHONE_NUMBER_FIELD, phoneNumber);
        LOGGER.info("Successfully entered the customer phone number!!");
    }

    public void enterUpdatedCustomerCity(String city) {
        softAssert.assertEquals(isDisplayed(CITY_FIELD), true,
                "City Field not displayed");
        safeClear(CITY_FIELD);
        LOGGER.info("Successfully cleared the customer phone number!!");
        safeType(CITY_FIELD, city);
        LOGGER.info("Successfully entered the customer phone number!!");
    }

    public void enterUpdatedCustomerAddress(String address) {
        softAssert.assertEquals(isDisplayed(ADDRESS_FIELD), true,
                "Address Field not displayed");
        safeClear(ADDRESS_FIELD);
        LOGGER.info("Successfully cleared the customer Address!!");
        safeType(ADDRESS_FIELD, address);
        LOGGER.info("Successfully entered the customer Address!!");
    }

    public void enterUpdatedCustomerPostalCode(int postalCode) {
        softAssert.assertEquals(isDisplayed(POSTAL_CODE_FIELD), true,
                "Address Field not displayed");
        safeClear(POSTAL_CODE_FIELD);
        LOGGER.info("Successfully cleared the customer postal code!!");
        safeType(POSTAL_CODE_FIELD, String.valueOf(postalCode));
        LOGGER.info("Successfully entered the customer postal code!!");
    }


    public void enterCustomerDetails(String name, String email, String  phoneNumber,
                                     String city, String address, int postalCode) {
        enterUpdatedCustomerName(name);
        enterUpdatedCustomerEmail(email);
        enterUpdatedCustomerPhoneNumber(phoneNumber);
        enterUpdatedCustomerCity(city);
        enterUpdatedCustomerAddress(address);
        enterUpdatedCustomerPostalCode(postalCode);
    }

    public void clickOnCheckOutButton() {
        softAssert.assertEquals(isDisplayed(CHECKOUT_BUTTON), true,
                "Check out button not displayed");
        safeClick(CHECKOUT_BUTTON);
        LOGGER.info("Successfully clicked on the checkout button!!");
    }

    public void verifyOrderAmount(String amount) {
        WebElement element = driver.findElement(By.id("snap-midtrans"));
        driver.switchTo().frame(element);
        softAssert.assertEquals(isDisplayed(ORDER_SUMMARY_MODAL_POPUP), true,
                "Order summary modal popup not displayed");
        String fetchedProductAmount = getText(PRODUCT_AMOUNT).replaceAll(",", "");
        softAssert.assertEquals(fetchedProductAmount, amount, "Fetched product amount is not matching");
        LOGGER.info("Successfully verified product amount and it is: " + fetchedProductAmount);
    }

    public void verifyOrderProductName() {
        String fetchedProductName = getText(ITEM_NAME);
        softAssert.assertEquals(fetchedProductName, mainProductName, "Fetched product name is not matching");
        LOGGER.info("Successfully verified product name and it is: " + fetchedProductName);
    }

    public void clickOnShippingDetails() {
        softAssert.assertEquals(isDisplayed(SHIPPING_DETAILS_TAB), true,
                "Shipping details tab not displayed");
        safeClick(SHIPPING_DETAILS_TAB);
        LOGGER.info("Successfully clicked on shipping details tab!!");
    }

    public void verifyUserName(String name) {
        String fetchedUserName = getText(SHIPPING_DETAILS_USER_NAME);
        LOGGER.info("Successfully fetched the user name from order summary and it is: " + fetchedUserName);
        softAssert.assertEquals(fetchedUserName, name, "Fetched user name is not matching");
    }

    public void verifyUserPhoneNumber(String phoneNumber) {
        String fetchedPhoneNumber = getText(SHIPPING_DETAILS_PHONE_NUMBER);
        LOGGER.info("Successfully fetched the user phoneNumber from order summary and it is: " + fetchedPhoneNumber);
        softAssert.assertEquals(fetchedPhoneNumber, phoneNumber, "Fetched phone number is not matching");
    }

    public void verifyUserEmail(String email) {
        String fetchedEmail = getText(SHIPPING_DETAILS_EMAIL);
        LOGGER.info("Successfully fetched the user email from order summary and it is: " + fetchedEmail);
        softAssert.assertEquals(fetchedEmail, email, "Fetched email is not matching");
    }

    public void verifyUserAddress(String address) {
        String fetchedAddress = getText(SHIPPING_DETAILS_ADDRESS);
        LOGGER.info("Successfully fetched the user address from order summary and it is: " + fetchedAddress);
        softAssert.assertEquals(fetchedAddress, address, "Fetched address is not matching");
    }

    public void clickOnContinueButton() {
        softAssert.assertEquals(isDisplayed(CONTINUE_BUTTON), true,
                "Continue button not displayed");
        safeClick(CONTINUE_BUTTON);
        LOGGER.info("Successfully clicked on the continue button!!");
    }

    public void selectCreditCardPaymentMethod() {
        softAssert.assertEquals(isDisplayed(CREDIT_CARD_PAYMENT_OPTION), true,
                "Credit Card payment option not displayed");
        safeClick(CREDIT_CARD_PAYMENT_OPTION);
        LOGGER.info("Successfully selected the credit card payment option button!!");
    }

    public void enterCardNumber(String cardNumber) {
        softAssert.assertEquals(isDisplayed(CARD_NUMBER_FIELD), true,
                "Card number field not displayed not displayed");
        safeType(CARD_NUMBER_FIELD, cardNumber);
        LOGGER.info("Successfully entered the card number in the text field!!");
    }

    public void enterExpiryDate(String expiryDate) {
        softAssert.assertEquals(isDisplayed(CARD_NUMBER_EXPIRY_DATE), true,
                "Card Expiry date field not displayed");
        safeType(CARD_NUMBER_EXPIRY_DATE, expiryDate);
        LOGGER.info("Successfully entered the card number expiry date in the text field!!");
    }

    public void enterCardCvvNumber(String cvvNumber) {
        softAssert.assertEquals(isDisplayed(CARD_NUMBER_CVV_FILED), true,
                "Card CVV number field not displayed");
        safeType(CARD_NUMBER_CVV_FILED, cvvNumber);
        LOGGER.info("Successfully entered the card number in the text field!!");
    }

    public void clickOnPayNowButton() throws AWTException {
        softAssert.assertEquals(isDisplayed(PAY_NOW_BUTTON), true,
                "Pay Now button not displayed");
        waitForElementToBeClickAble(PAY_NOW_BUTTON, 20);
        safeClick(PAY_NOW_BUTTON);
        LOGGER.info("Successfully click on the pay now button!!");
        zoomOut();
    }

    public void zoomOut() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SUBTRACT);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_SUBTRACT);
    }

    public void enterOtpNumber(String otpNumber) {
        waitForElementToBeClickAble(OTP_FIELD, 30);
        driver.switchTo().frame(0);
        softAssert.assertEquals(isDisplayed(OTP_FIELD), true,
                "Enter OTP number field not displayed");
        safeType(OTP_FIELD, otpNumber);
        LOGGER.info("Successfully entered the OTP number in the text field!!!");
    }

    public void clickOnOkButton() {
        waitForElementToBeClickAble(BANK_PAGE_OK_BUTTON, 30);
        softAssert.assertEquals(isDisplayed(BANK_PAGE_OK_BUTTON), true,
                "Bank OK button not displayed");
        driver.findElement(BANK_PAGE_OK_BUTTON).submit();
        LOGGER.info("Successfully clicked on the OK button!!");
    }

    public void verifyPaymentSuccessScreen() {
        driver.switchTo().defaultContent();
        waitForElementToBeDisplay(TRANSACTION_SUCCESS, 30);
        softAssert.assertEquals(isDisplayed(TRANSACTION_SUCCESS), true,
                "Success screen not displayed");
        LOGGER.info("Successfully verified the success message after purchase!!");
    }

    public void verifyPaymentFailureScreen() {
        driver.switchTo().parentFrame();
        waitForElementToBeDisplay(FAILED_TRANSACTION_SCREEN_TEXT, 30);
        softAssert.assertEquals(isDisplayed(FAILED_TRANSACTION_SCREEN_TEXT), true,
                "Failed Transaction screen not displayed");
        LOGGER.info("Successfully verified the failed message after purchase!!");
    }

    public void clearCardNumber() {
        safeClear(CARD_NUMBER_FIELD);
        LOGGER.info("Successfully cleared the card number!!");
    }

}
