package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest
{
    String baseUrl="https://demo.nopcommerce.com/";
    String expectedText;
    String actualText;
    @Before
    public void setUp()
    {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully()
    {
        driver.findElement(By.xpath("//a[text()='Computers ']")).click();
        expectedText="Computers";
        actualText=driver.findElement(By.xpath("//a[text()='Computers ']")).getText();
        Assert.assertEquals("Both are Not Same Text",expectedText,actualText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully()
    {
        driver.findElement(By.xpath("//a[text()='Electronics ']")).click();
        expectedText="Electronics";
        actualText=driver.findElement(By.xpath("//a[text()='Electronics ']")).getText();
        Assert.assertEquals("Both are Not Same Text",expectedText,actualText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully()
    {
        driver.findElement(By.xpath("//a[text()='Apparel ']")).click();
        expectedText="Apparel";
        actualText=driver.findElement(By.xpath("//a[text()='Apparel ']")).getText();
        Assert.assertEquals("Both are Not Same Text",expectedText,actualText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully()
    {
        driver.findElement(By.xpath("//a[text()='Digital downloads ']")).click();
        expectedText="Digital downloads";
        actualText=driver.findElement(By.xpath("//a[text()='Digital downloads ']")).getText();
        Assert.assertEquals("Both are Not Same Text",expectedText,actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully()
    {
        driver.findElement(By.xpath("//a[text()='Books ']")).click();
        expectedText="Books";
        actualText=driver.findElement(By.xpath("//a[text()='Books ']")).getText();
        Assert.assertEquals("Both are Not Same Text",expectedText,actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully()
    {
        driver.findElement(By.xpath("//a[text()='Jewelry ']")).click();
        expectedText="Jewelry";
        actualText=driver.findElement(By.xpath("//a[text()='Jewelry ']")).getText();
        Assert.assertEquals("Both are Not Same Text",expectedText,actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully()
    {
        driver.findElement(By.xpath("//a[text()='Gift Cards ']")).click();
        expectedText="Gift Cards";
        actualText=driver.findElement(By.xpath("//a[text()='Gift Cards ']")).getText();
        Assert.assertEquals("Both are Not Same Text",expectedText,actualText);
    }




    @After
    public void tearDown()
    {
        closeBrowser();
    }
}
