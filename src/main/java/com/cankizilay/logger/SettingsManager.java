package com.cankizilay.logger;

import com.cankizilay.configuration.EventList;
import com.cankizilay.configuration.Settings;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SettingsManager {
    private static Properties properties = new Properties();

    private static void getProperties() {
        try {
            properties.load(new FileReader(new File(System.getProperty("user.dir") + "/src/main/resources/events.properties")));
        } catch (IOException e) {
            System.out.println("events.properties file is missing.");
        }
    }

    public static EventList eventManagement() {
        getProperties();
        return EventList.builder()
                .beforeGet(getProperty("beforeGet"))
                .beforeGetCurrentUrl(getProperty("beforeGetCurrentUrl"))
                .beforeGetTitle(getProperty("beforeGetTitle"))
                .beforeFindElement(getProperty("beforeFindElement"))
                .beforeFindElements(getProperty("beforeFindElements"))
                .beforeGetPageSource(getProperty("beforeGetPageSource"))
                .beforeClose(getProperty("beforeClose"))
                .beforeQuit(getProperty("beforeQuit"))
                .beforeQuit(getProperty("beforeExecuteScript"))
                .beforeClick(getProperty("beforeClick"))
                .beforeSubmit(getProperty("beforeSubmit"))
                .beforeSendKeys(getProperty("beforeSendKeys"))
                .beforeClear(getProperty("beforeClear"))
                .beforeGetTagName(getProperty("beforeGetTagName"))
                .beforeGetAttribute(getProperty("beforeGetAttribute"))
                .beforeIsSelected(getProperty("beforeIsSelected"))
                .beforeIsEnabled(getProperty("beforeIsEnabled"))
                .beforeGetText(getProperty("beforeGetText"))
                .beforeIsDisplayed(getProperty("beforeIsDisplayed"))
                .beforeTo(getProperty("beforeTo"))
                .beforeBack(getProperty("beforeBack"))
                .beforeForward(getProperty("beforeForward"))
                .beforeRefresh(getProperty("beforeRefresh"))
                .build();
    }

    public static Settings settings() {
        return Settings.builder()
                .logPath(properties.getProperty("logPath"))
                .build();
    }

    private static Boolean getProperty(String property) {
        Boolean value = Boolean.valueOf(properties.getProperty(property));
        if (value == null) {value = false;}
        return value;
    }
}
