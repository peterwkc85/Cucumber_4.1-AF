@echo on
title Selenium Node 1

cd "%~dp0"

java -Dwebdriver.gecko.driver="..\driver\geckodriver.exe" -Dwebdriver.chrome.driver="..\driver\chromedriver.exe" -Dwebdriver.ie.driver="..\driver\IEDriverServer.exe" -jar ..\driver\selenium-server-standalone-3.14.0.jar -role node -hub http://localhost:4444/grid/register -browser "browserName=firefox, maxInstances=10, platform=ANY, seleniumProtocol=WebDriver" -browser "browserName=internet explorer, version=11, platform=WINDOWS, maxInstances=10" -browser "browserName=chrome,version=ANY,maxInstances=10,platform=WINDOWS"




pause