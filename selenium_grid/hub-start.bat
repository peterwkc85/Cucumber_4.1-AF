@echo on
title Selenium Hub

cd "%~dp0"

java -Dwebdriver.gecko.driver="..\driver\geckodriver.exe" -Dwebdriver.chrome.driver="..\driver\chromedriver.exe" -Dwebdriver.ie.driver="..\driver\IEDriverServer.exe" -jar ..\driver\selenium-server-standalone-3.14.0.jar -role hub -port 4444 



pause