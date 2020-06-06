package core.pageModules.iPageRepository;

import org.openqa.selenium.By;

public interface CommonLocators {

    By BUY_NOW_BUTTON = By.cssSelector(".buy");
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
    By ORDER_SUMMARY_MODAL_POPUP = By.id("application");
}
