# Selenium Event Logger
This project provides log management for **Selenium** projects. It provides logging of your Selenium events and scenarios based on **logback** library

# Usage

## Config file 
Project needs `events.properties` under `main/resources` for toggling the logs and other settings.

### Config settings

Example properties are: 

```
//Settings
logPath = logs

//WebDriver
beforeGet = true
beforeGetCurrentUrl = true
beforeGetTitle = true
beforeFindElement = true
beforeFindElements = true
beforeGetPageSource = true
beforeClose = true
beforeQuit = true
beforeExecuteScript=true

//WebElement
beforeClick = true
beforeSubmit = true
beforeSendKeys = true
beforeClear = true
beforeGetTagName = true
beforeGetAttribute = true
beforeIsSelected = true
beforeIsEnabled = true
beforeGetText = true
beforeIsDisplayed = true

//Navigation
beforeTo = true
beforeBack = true
beforeForward = true
beforeRefresh = true
```

## Driver Setup
The Logger should be added to the driver.

Example: 

```
Webdriver driver = Logger.setLogger(new ChromeDriver());
```

## Log File

For test-based logging, the log file should be set before the tests step.

```
Logger.setLogFilesName("My scenario");
```

It is recommended to finish tests with:

```
Logger.unsetLogFileName(My scenario);
```

![img.png](images/refactor.png)

## Logging steps
![img.png](images/consoleLogging.png)

`Logger.setLogFilesName(String logFileName)`

`Logger.startTests (String testName)`

`Logger.finishTests (String testName)` 

`Logger.failed (String testName)` 

`Logger.info (String message)` 

`Logger.warning (String message)` 

`Logger.error (String message)` 

`Logger.testStep (String testStep)` 

`Logger.subStepLog (String substep)` 

`Logger.scenario (String scenatioName)` 

