package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        WebElement computerTab=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]"));
        computerTab.click();// click computer tab
        String actualMsg=driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();// actual text
        String expectedMsg="Computers";// expected text
        Assert.assertEquals("Computers text not validate",expectedMsg,actualMsg);// validation
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        WebElement electronicsTab=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]"));
        electronicsTab.click();// click Electronics tab
        String actualMsg=driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();// actual text
        String expectedMsg="Electronics";// expected text
        Assert.assertEquals("Electronics text not validate",expectedMsg,actualMsg);// validation
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        WebElement apparelTab=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]"));
        apparelTab.click();// click Apparel tab
        String actualMsg=driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();// actual text
        String expectedMsg="Apparel";// expected text
        Assert.assertEquals("Apparel text not validate",expectedMsg,actualMsg);// validation
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        WebElement digitalDownloadsTab=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]"));
        digitalDownloadsTab.click();// click Digital downloads tab
        String actualMsg=driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();// actual text
        String expectedMsg="Digital downloads";// expected text
        Assert.assertEquals("Digital downloads text not validate",expectedMsg,actualMsg);// validation
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        WebElement booksTab=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[5]"));
        booksTab.click();// click books tab
        String actualMsg=driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();// actual text
        String expectedMsg="Books";// expected text
        Assert.assertEquals("Books text not validate",expectedMsg,actualMsg);// validation
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        WebElement jewelryTab=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]"));
        jewelryTab.click();// click Jewelry tab
        String actualMsg=driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();// actual text
        String expectedMsg="Jewelry";// expected text
        Assert.assertEquals("Jewelry text not validate",expectedMsg,actualMsg);// validation
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        WebElement giftCardsTab=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]"));
        giftCardsTab.click();// click Gift Cards tab
        String actualMsg=driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();// actual text
        String expectedMsg="Gift Cards";// expected text
        Assert.assertEquals("Gift Cards text not validate",expectedMsg,actualMsg);// validation
    }
    @After
    public void tearDown() {
        closeBrowser();
    }



}
