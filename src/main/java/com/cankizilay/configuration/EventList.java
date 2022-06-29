package com.cankizilay.configuration;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EventList {

    //WebDriver
    private String beforeGet;
    private String beforeGetCurrentUrl;
    private String beforeGetTitle;
    private String beforeFindElement;
    private String beforeFindElements;
    private String beforeGetPageSource;
    private String beforeClose;
    private String beforeQuit;
    private String beforeExecuteScript;

    //WebElement
    private String beforeClick;
    private String beforeSubmit;
    private String beforeSendKeys;
    private String beforeClear;
    private String beforeGetTagName;
    private String beforeGetAttribute;
    private String beforeIsSelected;
    private String beforeIsEnabled;
    private String beforeGetText;
    private String beforeIsDisplayed;

    //Navigation
    private String beforeTo;
    private String beforeBack;
    private String beforeForward;
    private String beforeRefresh;
}
