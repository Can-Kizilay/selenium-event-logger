package com.cankizilay.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Parser {
    public static String elementParser(WebElement element){
        return String.valueOf(element)
                .substring(String.valueOf(element).indexOf("->"),
                        String.valueOf(element).length() - 1);
    }

    public static String elementParser(By element){
        return String.valueOf(element)
                .substring(String.valueOf(element).indexOf("->"),
                        String.valueOf(element).length() - 1);
    }
}
