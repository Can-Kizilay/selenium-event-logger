package com.cankizilay.configuration;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EventList {

    //WebDriver
    private Boolean beforeGet;
    private Boolean beforeGetCurrentUrl;
    private Boolean beforeGetTitle;
    private Boolean beforeFindElement;
    private Boolean beforeFindElements;
    private Boolean beforeGetPageSource;
    private Boolean beforeClose;
    private Boolean beforeQuit;
    private Boolean beforeExecuteScript;

    //WebElement
    private Boolean beforeClick;
    private Boolean beforeSubmit;
    private Boolean beforeSendKeys;
    private Boolean beforeClear;
    private Boolean beforeGetTagName;
    private Boolean beforeGetAttribute;
    private Boolean beforeIsSelected;
    private Boolean beforeIsEnabled;
    private Boolean beforeGetText;
    private Boolean beforeIsDisplayed;

    //Navigation
    private Boolean beforeTo;
    private Boolean beforeBack;
    private Boolean beforeForward;
    private Boolean beforeRefresh;
}
