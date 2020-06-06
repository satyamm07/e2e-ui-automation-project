package core.utils;

import core.helperActions.HelperActionsUtils;
import core.pageModules.pagesActions.CommonActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class BaseTest extends BaseSetup {

    public WebDriver driver;
    public HelperActionsUtils helperActionsUtils;
    public CommonActions commonActions;

    @BeforeClass
    public void createInstance() throws IOException {
        driver = initializeDriver();
        commonActions = new CommonActions(driver);
        helperActionsUtils = new HelperActionsUtils(driver);
    }

    @AfterClass
    public void close() {
        driver.close();
    }

}
