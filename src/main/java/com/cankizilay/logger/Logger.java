package com.cankizilay.logger;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.LoggerFactory;

import java.util.List;


public class Logger {
    protected static org.slf4j.Logger logger = LoggerFactory.getLogger(Logger.class);

    public static void startTests (String testName) {logger.info("Test is starting... " + testName);}
    public static void finishTests (String testName) {logger.info("Test is ending... " + testName);}
    public static void failed (String testName) {logger.info("Test failed... " + testName);}
    public static void info (String message) {logger.info("->     " + message);}
    public static void warning (String message) {logger.warn(message);}
    public static void error (String message) {logger.error(message);}
    public static void testStep (String stepDefinition) {logger.info("===> " + stepDefinition);}
    public static void subStepLog (String stepDefinition) {logger.info("-->    " + stepDefinition);}
    public static void scenario (String stepDefinition) {logger.info("       ==== " + stepDefinition+" ====       ");}

    public static void elementLog (String action, WebElement element) {
        try{
            String elementSub = String.valueOf(element).substring(String.valueOf(element).indexOf("->"), String.valueOf(element).length()-1);
            subStepLog(action + elementSub);

        }catch (Exception e) {
            subStepLog(action + element);
        }
    }

    public static void elementLog (String action, By element) {
        try{
            String elementSub = String.valueOf(element).substring(String.valueOf(element).indexOf("->"), String.valueOf(element).length()-1);
            subStepLog(action + elementSub);

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