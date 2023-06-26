package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest
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
     public void userShouldNavigateToLoginPageSuccessfully()
    {
        //click on the ‘Login’ link
        driver.findElement(By.linkText("Log in")).click();

        //Verify the text ‘Welcome, Please Sign In!’
        expectedText="Welcome, Please Sign In!";
        actualText=driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]")).getText();
        Assert.assertEquals("Error Massage Not Displayed",expectedText,actualText);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials()
    {
        //click on the ‘Login’ link
        driver.findElement(By.linkText("Log in")).click();

        //Enter valid username
        driver.findElement(By.id("Email")).sendKeys("abc.shah@gmail.com");

        //Enter valid password
        driver.findElement(By.id("Password")).sendKeys("abc.shah19");

        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        //Verify the ‘Log out’ text is display
        expectedText = "Log out";
        //actualText=
        Assert.assertEquals("Login Not Successfully",expectedText,actualText);


    }

    @Test
    public void verifyTheErrorMessage()
    {
        //click on the ‘Login’ link
        driver.findElement(By.linkText("Log in")).click();

        //Enter Invalid username
        driver.findElement(By.id("Email")).sendKeys("abc.shah@gmail.com");

        //Enter Invalid password
        driver.findElement(By.id("Password")).sendKeys("abc.shah19");

        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        //Verify the error message
        expectedText="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        actualText=driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error Message Not Display",expectedText,actualText);


    }

    @After
    public void tearDown()
    {
        closeBrowser();
    }
}

