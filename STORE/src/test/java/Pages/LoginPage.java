package Pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.FileInputStream;
import java.io.IOException;


public class LoginPage extends Base{
    @FindBy(linkText = "Log in")
    WebElement logintag;
    @FindBy(id = "loginusername")
    WebElement loguname;
    @FindBy(id="loginpassword")
    WebElement logpass;
    @FindBy(linkText = "Log in")
    WebElement loginbutton;
    String path;
    public LoginPage(){
        PageFactory.initElements(driver,this);}
    public void loginPage() throws IOException {
        path=System.getProperty("user.dir"+"/ExcelFiles/UserDetails.xlsx");
        logintag.click();
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook wb= new XSSFWorkbook(fis);
        XSSFSheet sh= wb.getSheetAt(0);


    }
}
