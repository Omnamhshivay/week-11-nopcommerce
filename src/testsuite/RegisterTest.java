package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        WebElement registerButton= driver.findElement(By.linkText("Register"));//register button locator
        registerButton.click();//click register button
        WebElement registerText= driver.findElement(By.linkText("Register"));//register text locator
        String actualMessage=registerText.getText();// get text
        String expectedMessage="Register";// stored expected msg
        Assert.assertEquals("Register Text not visible",expectedMessage,actualMessage);// validation of actual and expected
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        WebElement registerButton= driver.findElement(By.linkText("Register"));//register button locator
        registerButton.click();//click register button
        driver.findElement(By.id("gender-male")).click();// click on radio button
        driver.findElement(By.id("FirstName")).sendKeys("mark");// send keys to firstname filed
        driver.findElement(By.id("LastName")).sendKeys("tiger");// send keys to lastname filed
        Select sel=new Select(driver.findElement(By.name("DateOfBirthDay")));// creating select class
        sel.selectByIndex(8);//select date by index number
        Select sel1=new Select(driver.findElement(By.name("DateOfBirthMonth")));
        sel1.selectByVisibleText("April");//select month by visible text
        Select sel2=new Select(driver.findElement(By.name("DateOfBirthYear")));
        sel2.selectByVisibleText("2013");// select year by visible text
        WebElement emailField=driver.findElement(By.id("Email"));// email field locator
        emailField.click();// click email field
        Random randomGenerator = new Random();// random generator class
        int randomInt = randomGenerator.nextInt(1000);
        emailField.sendKeys("username"+ randomInt +"@gmail.com");// creating random email generator
        driver.findElement(By.id("Password")).sendKeys("1234567");// send keys to password field
        driver.findElement(By.id("ConfirmPassword")).sendKeys("1234567");// send keys to confirm password filed
        driver.findElement(By.id("register-button")).click();// click register button
        String actualMsg=driver.findElement(By.xpath("//div[@class='page-body']//div[@class='result']")).getText();
        String expectedMsg="Your registration completed";
        Assert.assertEquals("Registration completed text not visible",expectedMsg,actualMsg);// validation
    }

    @After
    public void tearDown(){
        closeBrowser();
    }



}
