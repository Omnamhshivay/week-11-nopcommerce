package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginInTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //find login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //this is from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        //find the welcome text element and get the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]\n"));
        String actualMessage = actualMessageElement.getText();
        //validate actual and expected message
        Assert.assertEquals("Not navigte to login page", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //find login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();// click login button
        WebElement emailField = driver.findElement(By.id("Email"));// email field locator
        emailField.sendKeys("markie2112@gmail.com");// send keys to emailfield
        WebElement passwordField=driver.findElement(By.id("Password"));//password filed locator
        passwordField.sendKeys("1234567");// send keys to password field
        WebElement signInBtn = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        signInBtn.click();// click on signin button
        String actualMsg=driver.findElement(By.className("ico-logout")).getText();// get text
        String expectedMsg="Log out";// expected message
        Assert.assertEquals("Logout text is not visible",expectedMsg,actualMsg);// validation
    }
    @Test
    public void verifyTheErrorMessage(){
        //find login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();// click login button
        WebElement emailField = driver.findElement(By.id("Email"));// email field locator
        emailField.sendKeys("markie@gmail.com");// send keys to emailfield
        WebElement passwordField=driver.findElement(By.id("Password"));//password filed locator
        passwordField.sendKeys("1234567");// send keys to password field
        WebElement signInBtn = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        signInBtn.click();// click on signin button
        String actualMsg=driver.findElement(By.xpath("//form[@method='post']//div[@class='message-error validation-summary-errors']")).getText();
        String expectedMsg="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals("Error message not validate",expectedMsg,actualMsg);//validation
    }

    @After
    public void tearDown(){
        closeBrowser();
    }








}
