package TestCases;

import Pages.Base;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SignUpTestCase extends Base {
    @BeforeSuite
    void launchWebsite(){
        launch();
    }

    @Test
    void usersignup(){

    }

    @AfterSuite
    void closeBrowser(){
        driver.close();
    }
}
