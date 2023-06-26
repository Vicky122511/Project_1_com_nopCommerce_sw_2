package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest
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
    public void userShouldNavigateToRegisterPageSuccessfully()
    {
        // click on the ‘Register’ link
        driver.findElement(By.xpath("//a[text()='Register']")).click();

        //Verify the text ‘Register’
        actualText=driver.findElement(By.xpath("//a[text()='Register']")).getText();
        expectedText="Register";
        Assert.assertEquals("Both are Not Similar Text",expectedText,actualText);

    }

    @Test
    public void userShouldRegisterAccountSuccessfully()
    {
        // click on the ‘Register’ link
        driver.findElement(By.xpath("//a[text()='Register']")).click();

        //Select gender radio button
        driver.findElement(By.xpath("//input[@id='gender-male' or text()='Male'] ")).click();

        //Enter First name
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("abc");

        //Enter Last name
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("xyz");

        // Select Day Month and Year
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("13");
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("June");
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("2023");

        //Enter Email address
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abc.shah@gmail.com");

        //Enter Password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("xyzzyyyy");

        //Enter Confirm password
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("xyzzyyyy");

        //Click on REGISTER button
        driver.findElement(By.xpath("//button[@id='register-button']")).click();

        //Verify the text 'Your registration completed’
        expectedText="Your registration completed";
        actualText=driver.findElement(By.xpath("//div[@class='result']")).getText();
        Assert.assertEquals("Both Text are Similar",expectedText,actualText);
    }


    @After
    public void tearDown()
    {
        //closeBrowser();
    }
}
