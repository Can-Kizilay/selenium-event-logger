package com.cankizilay.logger;

import com.cankizilay.listeners.DriverEventHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.slf4j.MDC;

import java.io.File;

public class LogManager {


     static WebDriver addLogger(WebDriver driver) {
        return new EventFiringDecorator(new DriverEventHandler()).decorate(driver);
    }

     static void setLogFileName(String fileName) {
        String logPath = SettingsManager.settings().getLogPath();
        if (logPath == null){logPath = "logs";};
        try {
            File file = null;
            file = new File(fileName + ".log");
            file.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
        MDC.put("fileName", logPath + "/" + fileName);
    }
}
