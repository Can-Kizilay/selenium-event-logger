package com.cankizilay.listeners;

import com.cankizilay.SeleniumEventsManager.SettingsManager;
import com.cankizilay.logger.Logger;
import com.cankizilay.utils.Parser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

import java.net.URL;

public class DriverEventHandler implements WebDriverListener {


    public void beforeGet(WebDriver driver, String url) {
        if (SettingsManager.eventManagement().getBeforeGet().contains("true")) {
            Logger.subStepLog("Getting URL: " + url);
            WebDriverListener.super.beforeGet(driver, url);
        }
    }

    public void beforeGetCurrentUrl(WebDriver driver) {
        if (SettingsManager.eventManagement().getBeforeGetCurrentUrl().contains("true")) {
            Logger.subStepLog("Getting current url");
            WebDriverListener.super.beforeGetCurrentUrl(driver);
        }
    }

    public void beforeGetTitle(WebDriver driver) {
        if (SettingsManager.eventManagement().getBeforeGetTitle().contains("true")) {
            Logger.subStepLog("Getting page title");
            WebDriverListener.super.beforeGetTitle(driver);
        }
    }

    public void beforeFindElement(WebDriver driver, By locator) {
        if (SettingsManager.eventManagement().getBeforeFindElement().contains("true")) {
            Logger.elementLog("Finding element: ", locator);
            WebDriverListener.super.beforeFindElement(driver, locator);
        }
    }

    public void beforeFindElements(WebDriver driver, By locator) {
        if (SettingsManager.eventManagement().getBeforeFindElements().contains("true")) {
            Logger.elementLog("Finding elements: ", locator);
            WebDriverListener.super.beforeFindElements(driver, locator);
        }
    }

    public void beforeGetPageSource(WebDriver driver) {
        if (SettingsManager.eventManagement().getBeforeGetPageSource().contains("true")) {
            Logger.subStepLog("Getting page source");
            WebDriverListener.super.beforeGetPageSource(driver);
        }
    }

    public void beforeClose(WebDriver driver) {
        if (SettingsManager.eventManagement().getBeforeClose().contains("true")) {
            Logger.subStepLog("Closing browser");
            WebDriverListener.super.beforeClose(driver);
        }
    }

    public void beforeQuit(WebDriver driver) {
        if (SettingsManager.eventManagement().getBeforeQuit().contains("true")) {
            Logger.subStepLog("Quitting browser");
            WebDriverListener.super.beforeQuit(driver);
        }
    }

    public void beforeClick(WebElement element) {
        if (SettingsManager.eventManagement().getBeforeClick().contains("true")) {
            Logger.subStepLog("Clicking element: " + Parser.elementParser(element));
            WebDriverListener.super.beforeClick(element);
        }
    }

    public void beforeSubmit(WebElement element) {
        if (SettingsManager.eventManagement().getBeforeSubmit().contains("true")) {
            Logger.subStepLog("Submitting element: " + Parser.elementParser(element));
            WebDriverListener.super.beforeSubmit(element);
        }
    }

    public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {
        if (SettingsManager.eventManagement().getBeforeSendKeys().contains("true")) {
            Logger.elementLog("Writing text: '" + String.join("", keysToSend) + "' ", element);
            WebDriverListener.super.beforeSendKeys(element);
        }
    }

    public void beforeClear(WebElement element) {
        if (SettingsManager.eventManagement().getBeforeClear().contains("true")) {
            Logger.subStepLog("Clearing element: " + Parser.elementParser(element));
            WebDriverListener.super.beforeClear(element);
        }
    }

    public void beforeGetTagName(WebElement element) {
        if (SettingsManager.eventManagement().getBeforeGetTagName().contains("true")) {
            Logger.subStepLog("Getting tag name of element: " + Parser.elementParser(element));
            WebDriverListener.super.beforeGetTagName(element);
        }
    }

    public void beforeGetAttribute(WebElement element, String name) {
        if (SettingsManager.eventManagement().getBeforeGetAttribute().contains("true")) {
            Logger.subStepLog("Getting " + name + " attribute of element: " + Parser.elementParser(element));
            WebDriverListener.super.beforeGetAttribute(element, name);
        }
    }

    public void beforeIsSelected(WebElement element) {
        if (SettingsManager.eventManagement().getBeforeIsSelected().contains("true")) {
            Logger.subStepLog("Checking element is selected: " + Parser.elementParser(element));
            WebDriverListener.super.beforeIsSelected(element);
        }
    }

    public void beforeIsEnabled(WebElement element) {
        if (SettingsManager.eventManagement().getBeforeIsEnabled().contains("true")) {
            Logger.subStepLog("Checking element is enabled: " + Parser.elementParser(element));
            WebDriverListener.super.beforeIsEnabled(element);
        }
    }

    public void beforeGetText(WebElement element) {
        if (SettingsManager.eventManagement().getBeforeGetText().contains("true")) {
            Logger.subStepLog("Getting text of element: " + Parser.elementParser(element));
            WebDriverListener.super.beforeGetText(element);
        }
    }

    public void beforeIsDisplayed(WebElement element) {
        if (SettingsManager.eventManagement().getBeforeIsDisplayed().contains("true")) {
            Logger.subStepLog("Checking element is displayed: " + Parser.elementParser(element));
            WebDriverListener.super.beforeIsDisplayed(element);
        }
    }

    public void beforeTo(WebDriver.Navigation navigation, String url) {
        if (SettingsManager.eventManagement().getBeforeTo().contains("true")) {
            Logger.subStepLog("Navigating to: " + url);
            WebDriverListener.super.beforeTo(navigation, url);
        }
    }

    public void beforeTo(WebDriver.Navigation navigation, URL url) {
        if (SettingsManager.eventManagement().getBeforeTo().contains("true")) {
            Logger.subStepLog("Navigating to: " + url);
            WebDriverListener.super.beforeTo(navigation, url);
        }
    }

    public void beforeBack(WebDriver.Navigation navigation) {
        if (SettingsManager.eventManagement().getBeforeBack().contains("true")) {
            Logger.subStepLog("Navigating back");
            WebDriverListener.super.beforeBack(navigation);
        }
    }

    public void beforeForward(WebDriver.Navigation navigation) {
        if (SettingsManager.eventManagement().getBeforeForward().contains("true")) {
            Logger.subStepLog("Navigating forward");
            WebDriverListener.super.beforeForward(navigation);
        }
    }

    public void beforeRefresh(WebDriver.Navigation navigation) {
        if (SettingsManager.eventManagement().getBeforeRefresh().contains("true")) {
            Logger.subStepLog("Refreshing page");
            WebDriverListener.super.beforeRefresh(navigation);
        }
    }


}