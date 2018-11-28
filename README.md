# ISDS Downloader
Downloads messages and their attachments into target directory. 
Ignore any message older than one day.

## Requirements
 * Java 10
 * Maven
 * git client

## Install from source
Clone this repository and use maven to build the program.
```
git clone https://github.com/opendata-mvcr/nkod-isds.git
cd nkod-isds
mvn install
```
result of the build is saved into ```dist``` directory.
Update configuration file ```dist/configuration.properties```.
```
cd dist
java -DconfigurationFile=./configuration.properties -jar isds-0.0.0.jar
```

