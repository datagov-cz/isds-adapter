# ISDS Downloader
Downloads messages and their attachments into target directory. 
Ignore any message older than one day.

## Requirements
 * Java 10
 * Maven
 * git client

## Install from source
Build the script.
```
git clone 
mvn install https://github.com/opendata-mvcr/isds.git
```
Update configuration file ```configuration.properties```.
Run the program in ```target``` directory using.
```
java -DconfigurationFile=../configuration.properties -jar isds-0.0.0.jar
```

