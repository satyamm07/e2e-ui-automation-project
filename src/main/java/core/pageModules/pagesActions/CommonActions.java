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
}
