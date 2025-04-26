# CucumberFramework
TestNG with Maven


1. Install Java https://www.oracle.com/java/technologies/downloads/
2. Set JAVA_HOME in your Environmental variables
3. Windows: `/Program Files/Java/<java version>`, Edit Environmental variables, add System Variable `"JAVA_HOME" =  /Program Files/Java/<java version>`, update PATH variable `/Program Files/Java/<java version>/bin`. 
4. macOS: run in Terminal to get path `/usr/libexec/java_home -V`,  add .zshrc `export JAVA_HOME=/Library/Java/JavaVirtualMachines/<jdk-24.jdk>/Contents/Home`, run `source /.zshrc` to update
5. Run command line/terminal check `java --version`
6. Install Eclipse IDE for Java Developers https://www.eclipse.org/downloads/packages/
7. Run Eclipse
8. Install Cucumber Eclipse plugin (https://github.com/cucumber/cucumber-eclipse/wiki/Download-and-Offline-Installation-Of-The-Plugin-From-Zip)
9. Install TestNG plugin for Eclipse (https://github.com/testng-team/testng-eclipse)
10. Open CucumberFramework project in Eclipse
11. Run
* with TestNG, right click on TestNGTestRunner -> Run As --> TestNG Test
     <img width="698" alt="image" src="https://github.com/user-attachments/assets/e699125a-cf1b-4bf6-b3b6-6fffeea4e111" />
* with Maven, right click on TestNGTestRunner -> Run As --> Maven build --> Create a new configuration by at a minimum providing `Goals:test` (this will run in default configuration of TestNGTestRunner, or you can also provide `-Dbrowser=chrome(firefox)` or  `-DCucumber.filter.tags=@<nameofyourtag>)`
 <img width="739" alt="image" src="https://github.com/user-attachments/assets/b5b3746b-3f77-4e58-bb5b-99fcc29ddf6c" />
 


 

