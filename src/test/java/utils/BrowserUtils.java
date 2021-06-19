package utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertFalse;

public class BrowserUtils {

    /**
     * Verifies whether the element matching the provided locator is NOT displayed on page
     *
     * */
    public static void verifyElementNotDisplayed(WebElement element) {
        try {
            Assert.assertFalse(element.isDisplayed());
                   } catch (NoSuchElementException e) {
            Assert.assertFalse(false);

        }
    }
}

