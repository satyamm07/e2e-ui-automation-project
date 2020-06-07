package specs;

import core.helperActions.HelperActionsUtils;
import core.pageModules.pagesActions.PurchaseProductActions;
import core.utils.BaseSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class BaseTest extends BaseSetup {

    public WebDriver driver;
    public HelperActionsUtils helperActionsUtils;
    public PurchaseProductActions purchaseProductActions;

    @BeforeClass
    public void createInstance() throws IOException {
        driver = initializeDriver();
        purchaseProductActions = new PurchaseProductActions(driver);
        helperActionsUtils = new HelperActionsUtils(driver);
    }

    @AfterClass
    public void close() {
        driver.close();
    }

}
