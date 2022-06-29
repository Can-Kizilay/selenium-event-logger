package com.cankizilay.SeleniumEventsManager;

import com.cankizilay.configuration.Settings;
import com.cankizilay.configuration.EventList;

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
            e.printStackTrace();
        }
    }

    public static EventList eventManagement() {
        getProperties();
        return EventList.builder()
                .beforeGet(properties.getProperty("beforeGet"))
                .beforeGetCurrentUrl(properties.getProperty("beforeGetCurrentUrl"))
                .beforeGetTitle(properties.getProperty("beforeGetTitle"))
                .beforeFindElement(properties.getProperty("beforeFindElement"))
                .beforeFindElements(properties.getProperty("beforeFindElements"))
                .beforeGetPageSource(properties.getProperty("beforeGetPageSource"))
                .beforeClose(properties.getProperty("beforeClose"))
                .beforeQuit(properties.getProperty("beforeQuit"))
                .beforeQuit(properties.getProperty("beforeExecuteScript"))
                .beforeClick(properties.getProperty("beforeClick"))
                .beforeSubmit(properties.getProperty("beforeSubmit"))
                .beforeSendKeys(properties.getProperty("beforeSendKeys"))
                .beforeClear(properties.getProperty("beforeClear"))
                .beforeGetTagName(properties.getProperty("beforeGetTagName"))
                .beforeGetAttribute(properties.getProperty("beforeGetAttribute"))
                .beforeIsSelected(properties.getProperty("beforeIsSelected"))
                .beforeIsEnabled(properties.getProperty("beforeIsEnabled"))
                .beforeGetText(properties.getProperty("beforeGetText"))
                .beforeIsDisplayed(properties.getProperty("beforeIsDisplayed"))
                .beforeTo(properties.getProperty("beforeTo"))
                .beforeBack(properties.getProperty("beforeBack"))
                .beforeForward(properties.getProperty("beforeForward"))
                .beforeRefresh(properties.getProperty("beforeRefresh"))
                .build();
    }

    public static Settings settings() {
        getProperties();
        return Settings.builder()
                .logPath(properties.getProperty("logPath"))
                .build();
    }
}
