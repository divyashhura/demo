package PageFactory;

import Pages.LoginPage;
import Pages.SignUpPage;
import org.openqa.selenium.WebDriver;

public class ObjectFactory {
        WebDriver driver;
        private LoginPage loginPage;
        private SignUpPage signUpPage;
//        private homePage;
        public void Page(WebDriver driver){
            this.driver = driver;
        }
        public SignUpPage getSignUp(){
            if(signUpPage==null){
                signUpPage=new SignUpPage();
            }
            return signUpPage;
        }
        public LoginPage getLoginPage() {
            if(loginPage == null){
                loginPage = new LoginPage();
            }
            return loginPage;
        }

//        public void HomePage getHomePage() {
//            if(homePage == null){
//                homePage = new HomePage(driver);
//            }
//            return homePage;
//        }
}
