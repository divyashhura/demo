package Pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.FileInputStream;
import java.io.IOException;


public class SignUpPage extends Base{
    @FindBy(linkText="Sign up")
    WebElement signupbutton;
    @FindBy(id="sign-username")
    WebElement uname;
    @FindBy(id="sign-password")
    WebElement pass;
    @FindBy(xpath = "//*[@class='btn btn-primary'")
    WebElement signup;
    String path;
    int i;
    String username,password;

    public SignUpPage(){PageFactory.initElements(driver,this);}
    public void enterDetails() throws IOException {
        path=System.getProperty("user.dir"+"/ExcelFiles/UserDetails.xlsx");
        signupbutton.click();
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook wb= new XSSFWorkbook(fis);
        XSSFSheet sh= wb.getSheetAt(0);
        for(i=0;i<sh.getLastRowNum();i++){


        }
    }


 }
