package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.fail;

public class Browser {

    public static void wait(int second){
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getScreenshot(String name) {
        name = new Date().toString().replace(" ", "_").replace(":", "-") + "_" + name;
        String path = "";

        if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            path = System.getProperty("user.dir") + "/test-output/screenshots/" + name + ".png";
        } else {
            path = System.getProperty("user.dir") + "\\test-output\\screenshots\\" + name + ".png";
        }

        System.out.println("OS name: " + System.getProperty("os.name"));
        System.out.println("Screenshot is here: " + path);
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(path);
        try {
            FileUtils.copyFile(source, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }

    public static void verifyElementDisplayed(WebElement element) {
        try {
            assertTrue("Element not visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException ex) {
            fail("Element not found: " + element);
        }
    }

    public static void waitForClickability(WebElement element, int second) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(second));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public static void waitForVisibility(WebElement element, int second) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(second));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void doubleCLick(WebElement element) {
        new Actions(Driver.getDriver()).doubleClick(element).build().perform();
    }

    public static void switchTo(String targetWindow) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetWindow))
                return;
        }
        Driver.getDriver().switchTo().window(origin);
    }

    public static void reTry(){
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().forward();

    }
}

