# CucuFramework

How to set up the Framework

The following needs to be Downloaded

Add Gecko driver locally and setup env variable
https://github.com/mozilla/geckodriver/releases/tag/v0.9.0

Read up on Gecko and Firefox
http://toolsqa.com/selenium-webdriver/how-to-use-geckodriver/

Download ChromeDriver locally and setup env variable
https://sites.google.com/a/chromium.org/chromedriver/downloads

Setup Maven on Windows
https://www.youtube.com/watch?v=OfCTUGpWEdE

Download CucuFramework Project

In order to run the Automation Framework with Maven, run the following commands:

Will clean project of temporary data and any given results.
mvn clean

Compile Maven project and run test:
mvn test

Shortcut cli for clean and test run:
mvn test run

Run the Allure reporta after test run:
mvn site

Reports are located on:
target/report/project-reports.html
Open with any compat browser

Failed screenshots located on:
src/test/screenshots
