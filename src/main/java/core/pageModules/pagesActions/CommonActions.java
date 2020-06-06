package core.pageModules.pagesActions;

import core.helperActions.HelperActionsUtils;
import core.pageModules.iPageRepository.CommonLocators;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonActions extends HelperActionsUtils implements CommonLocators {

    WebDriver driver;
    protected final Logger LOGGER = LoggerFactory.getLogger(CommonActions.class);

    public CommonActions(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickOnBuyNowButton() {
        softAssert.assertEquals(isDisplayed(BUY_NOW_BUTTON), true,
                "Buy Now button not displayed");
        safeClick(BUY_NOW_BUTTON);
        LOGGER.info("Successfully clicked on Buy Now button!!");
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
}
