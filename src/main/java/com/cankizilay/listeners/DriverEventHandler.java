package com.cankizilay.listeners;

import com.cankizilay.logger.SettingsManager;
import com.cankizilay.configuration.EventList;
import com.cankizilay.logger.Logger;
import com.cankizilay.utils.Parser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

import java.net.URL;

public class DriverEventHandler implements WebDriverListener {
    EventList eventList = SettingsManager.eventManagement();

    public void beforeGet(WebDriver driver, String url) {
        if (eventList.getBeforeGet()) {
            Logger.subStepLog("Getting URL: " + url);
            WebDriverListener.super.beforeGet(driver, url);
        }
    }

    public void beforeGetCurrentUrl(WebDriver driver) {
        if (eventList.getBeforeGetCurrentUrl()) {
            Logger.subStepLog("Getting current url");
            WebDriverListener.super.beforeGetCurrentUrl(driver);
        }
    }

    public void beforeGetTitle(WebDriver driver) {
        if (eventList.getBeforeGetTitle()) {
            Logger.subStepLog("Getting page title");
            WebDriverListener.super.beforeGetTitle(driver);
        }
    }

    public void beforeFindElement(WebDriver driver, By locator) {
        if (eventList.getBeforeFindElement()) {
            Logger.elementLog("Finding element: ", locator);
            WebDriverListener.super.beforeFindElement(driver, locator);
        }
    }

    public void beforeFindElements(WebDriver driver, By locator) {
        if (eventList.getBeforeFindElements()) {
            Logger.elementLog("Finding elements: ", locator);
            WebDriverListener.super.beforeFindElements(driver, locator);
        }
    }

    public void beforeGetPageSource(WebDriver driver) {
        if (eventList.getBeforeGetPageSource()) {
            Logger.subStepLog("Getting page source");
            WebDriverListener.super.beforeGetPageSource(driver);
        }
    }

    public void beforeClose(WebDriver driver) {
        if (eventList.getBeforeClose()) {
            Logger.subStepLog("Closing browser");
            WebDriverListener.super.beforeClose(driver);
        }
    }

    public void beforeQuit(WebDriver driver) {
        if (eventList.getBeforeQuit()) {
            Logger.subStepLog("Quitting browser");
            WebDriverListener.super.beforeQuit(driver);
        }
    }

    public void beforeClick(WebElement element) {
        if (eventList.getBeforeClick()) {
            Logger.subStepLog("Clicking element: " + Parser.elementParser(element));
            WebDriverListener.super.beforeClick(element);
        }
    }

    public void beforeSubmit(WebElement element) {
        if (eventList.getBeforeSubmit()) {
            Logger.subStepLog("Submitting element: " + Parser.elementParser(element));
            WebDriverListener.super.beforeSubmit(element);
        }
    }

    public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {
        if (eventList.getBeforeSendKeys()) {
            Logger.elementLog("Writing text: '" + String.join("", keysToSend) + "' ", element);
            WebDriverListener.super.beforeSendKeys(element);
        }
    }

    public void beforeClear(WebElement element) {
        if (eventList.getBeforeClear()) {
            Logger.subStepLog("Clearing element: " + Parser.elementParser(element));
            WebDriverListener.super.beforeClear(element);
        }
    }

    public void beforeGetTagName(WebElement element) {
        if (eventList.getBeforeGetTagName()) {
            Logger.subStepLog("Getting tag name of element: " + Parser.elementParser(element));
            WebDriverListener.super.beforeGetTagName(element);
        }
    }

    public void beforeGetAttribute(WebElement element, String name) {
        if (eventList.getBeforeGetAttribute()) {
            Logger.subStepLog("Getting " + name + " attribute of element: " + Parser.elementParser(element));
            WebDriverListener.super.beforeGetAttribute(element, name);
        }
    }

    public void beforeIsSelected(WebElement element) {
        if (eventList.getBeforeIsSelected()) {
            Logger.subStepLog("Checking element is selected: " + Parser.elementParser(element));
            WebDriverListener.super.beforeIsSelected(element);
        }
    }

    public void beforeIsEnabled(WebElement element) {
        if (eventList.getBeforeIsEnabled()) {
            Logger.subStepLog("Checking element is enabled: " + Parser.elementParser(element));
            WebDriverListener.super.beforeIsEnabled(element);
        }
    }

    public void beforeGetText(WebElement element) {
        if (eventList.getBeforeGetText()) {
            Logger.subStepLog("Getting text of element: " + Parser.elementParser(element));
            WebDriverListener.super.beforeGetText(element);
        }
    }

    public void beforeIsDisplayed(WebElement element) {
        if (eventList.getBeforeIsDisplayed()) {
            Logger.subStepLog("Checking element is displayed: " + Parser.elementParser(element));
            WebDriverListener.super.beforeIsDisplayed(element);
        }
    }

    public void beforeTo(WebDriver.Navigation navigation, String url) {
        if (eventList.getBeforeTo()) {
            Logger.subStepLog("Navigating to: " + url);
            WebDriverListener.super.beforeTo(navigation, url);
        }
    }

    public void beforeTo(WebDriver.Navigation navigation, URL url) {
        if (eventList.getBeforeTo()) {
            Logger.subStepLog("Navigating to: " + url);
            WebDriverListener.super.beforeTo(navigation, url);
        }
    }

    public void beforeBack(WebDriver.Navigation navigation) {
        if (eventList.getBeforeBack()) {
            Logger.subStepLog("Navigating back");
            WebDriverListener.super.beforeBack(navigation);
        }
    }

    public void beforeForward(WebDriver.Navigation navigation) {
        if (eventList.getBeforeForward()) {
            Logger.subStepLog("Navigating forward");
            WebDriverListener.super.beforeForward(navigation);
        }
    }

    public void beforeRefresh(WebDriver.Navigation navigation) {
        if (eventList.getBeforeRefresh()) {
            Logger.subStepLog("Refreshing page");
            WebDriverListener.super.beforeRefresh(navigation);
        }
    }


}