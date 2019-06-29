Exercise 2 :
• Can be either a window or a console application
• Preferred usage of C# in automated tests but Python or other languages can be
used for developing the application
• In case you choose to use any third party libraries, make sure the license is not
restrictive
• Feel free to use testing framework(s) of your choice. 
• Feel free to write in Windows or MAC Platform
Notes:
• Focus on code quality and getting the &quot;big picture&quot; to work
• Provide instructions on how to compile/run the code and the test suites


Project Details: 
****************
Framework used: BDD 
Language used: Cucumber, Junit , Java 
Type of Application Automated: Web Application
Link of the Web application: http://automationpractice.com/index.php
	Consider a test web application from internet, doesn’t want to use any 3party web application because of private rights.
	Please check do you have access to this test application.

Instructions:
*************
1. Please make sure you have Java 1.8 version  installed
2. The project is a Mavan project 
3. Import the code to Eclipse or Intellij and then resolve the POM dependencies 
4. Make sure all the dependencies are visible in your Maven Dependencies

Initial Setup :
****************
The project needs config.properties files to be edited.
1. Open the config.properties file from Path (/config/)
2.Edit the driverPath=D:/selenium with Java/driver/chromedriver.exe (Set it to driver path from your machine)
	You can download the driver for chrome from website https://sites.google.com/a/chromium.org/chromedriver/downloads
	Note : Please verify your chrome browser version  before you download it .
		   My chrome Version is  75.0.3770.100 (Official Build) (64-bit)

How to Run /Read the project:
1. Now open the feature file from path src/test/resources/SampleFeature/Sample_Test.feature
	This file describes all the steps that we are going to perform as part of this test 
	
2. inside the folder src/test/java 
	You will see 3 folders with 3 files 
		CucumberTests->Sample_Test.java - Ignore this file (It was created to test the project)
		runner->SampleTestRunner.java- Actual runner file to run the test (Run the Script from here )
					********right click -> Run as JunitTests*******
		stepDefinition-> sampleSteps.java - For all the steps defined in feature file (Step 1 ) we have the java +selenium code defined in this file

3. How to check the Sample Test Report
	As part this Automation Suite, there is also an Report created automatically (The Report has various section like Dashboard, Status, Category)
	After you run this project, Successful or Failed (test) a folder called target should be created 
	***please right click on report.html page and open in chrome browser 

Explanation on test Automation Suite:
*************************************
1. Can be explained separated in a call or can share a document with details if required.	

		
