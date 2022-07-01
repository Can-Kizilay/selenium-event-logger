package com.cankizilay.logger;


import com.cankizilay.utils.Parser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.List;


public class Logger {
    protected static org.slf4j.Logger logger = LoggerFactory.getLogger(Logger.class);
    public static WebDriver setLogger(WebDriver driver){return LogManager.addLogger(driver);}
    public static void setLogFilesName(String logFileName){LogManager.setLogFileName(logFileName);}
    public static void unsetLogFileName(String logFileName){MDC.remove(logFileName);}
    public static void failed (String testName) {logger.info("Test failed... " + testName);}
    public static void info (String message) {logger.info("->     " + message);}
    public static void warning (String message) {logger.warn(message);}
    public static void error (String message) {logger.error(message);}
    public static void testStep (String testStep) {logger.info("===> " + testStep);}
    public static void subStepLog (String substep) {logger.info("-->    " + substep);}
    public static void scenario (String scenatioName) {logger.info("       ==== " + scenatioName + " ====       ");}
    public static void startTests (String testName) {logger.info("Test is starting... " + testName);}
    public static void finishTests (String testName) {logger.info("Test is ending... " + testName);}

    public static void elementLog (String action, WebElement element) {
        try{
            subStepLog(action + Parser.elementParser(element));
        }catch (Exception e) {
            subStepLog(action + element);
        }
    }

    public static void elementLog (String action, By element) {
        try{
            subStepLog(action + Parser.elementParser(element));

        }catch (Exception e) {
            subStepLog(action + element);
        }
    }

    public static void elementListLog (String action, List<WebElement> element) {
        try{
            String elementSub = String.valueOf(element);
            subStepLog(action + elementSub);

        }catch (Exception e) {
            subStepLog(action + element);
        }
    }


}