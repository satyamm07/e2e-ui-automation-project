package core.pageModules.iPageRepository;

import org.openqa.selenium.By;

public interface PurchaseProductLocators {

    By BUY_NOW_BUTTON = By.cssSelector(".buy");
    By PRODUCT_NAME = By.cssSelector(".title");
    By SHOPPING_CART_MODAL_POPUP = By.cssSelector(".cart-content");
    By TOTAL_AMOUNT_FIELD = By.xpath("//td[text()='Total']/following-sibling::td");
    By AMOUNT_FIELD = By.xpath("//td[text()='Midtrans Pillow']/..//input");
    By NAME_FIELD = By.xpath("//td[text()='Name']/following-sibling::td/input");
    By EMAIL_FIELD = By.xpath("//td[text()='Email']/following-sibling::td/input");
    By PHONE_NUMBER_FIELD = By.xpath("//td[text()='Phone no']/following-sibling::td/input");
    By CITY_FIELD = By.xpath("//td[text()='City']/following-sibling::td/input");
    By ADDRESS_FIELD = By.xpath("//td[text()='Address']/following-sibling::td/textarea");
    By POSTAL_CODE_FIELD = By.xpath("//td[text()='Postal Code']/following-sibling::td/input");
    By CHECKOUT_BUTTON = By.cssSelector(".cart-checkout");
    By ORDER_SUMMARY_MODAL_POPUP = By.cssSelector(".app-container");
    By PRODUCT_AMOUNT = By.cssSelector(".text-amount-amount");
    By ITEM_NAME = By.cssSelector(".item-name");
    By SHIPPING_DETAILS_TAB = By.linkText("shipping details");
    By SHIPPING_DETAILS_USER_NAME = By.xpath("//div[text()='Name']/following-sibling::div");
    By SHIPPING_DETAILS_ADDRESS = By.xpath("//div[text()='Address']/following-sibling::div");
    By SHIPPING_DETAILS_PHONE_NUMBER = By.xpath("//div[text()='Phone number']/following-sibling::div");
    By SHIPPING_DETAILS_EMAIL = By.xpath("//div[text()='Email']/following-sibling::div");
    By CONTINUE_BUTTON = By.cssSelector(".button-main-content");
    By CREDIT_CARD_PAYMENT_OPTION = By.xpath("//div[text()='Credit Card']");
    By CARD_NUMBER_FIELD = By.xpath("//input[@name='cardnumber']");
    By CARD_NUMBER_CVV_FILED = By.xpath("//input[@name='cardnumber']/../following-sibling::div[2]/input");
    By CARD_NUMBER_EXPIRY_DATE = By.xpath("//input[@name='cardnumber']/../following-sibling::div[1]/input");
    By PAY_NOW_BUTTON = By.xpath("//span[text()='Pay Now']/../..");
    By OTP_FIELD = By.xpath("//input[@type='password']");
    By BANK_PAGE_OK_BUTTON = By.xpath("//button[@name='ok']");
    By TRANSACTION_SUCCESS = By.cssSelector(".trans-success");
    By RETRY_BUTTON = By.xpath("//button[@title='Reset the timer']");
}
