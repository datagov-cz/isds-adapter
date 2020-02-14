# ISDS Downloader
Downloads messages and their attachments into target directory. 
Ignore any message older than one day.

## Requirements
 * Java 12
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
For production ISDS, put the certificate downloaded according to 
[this post](https://www.datoveschranky.info/-/novy-ssl-certifikat-produkcniho-prostredi-isds) 
into ```dist/certificates```.

## Basic workflow
This program connects to the ISDS service and list all messages, delivered
in last 1440 minutes (can be set in the configuration).
For every message a following conditions are evaluated:
 * Does the title contains (case insensitive) 'nkod' ?
 * Does the message have at least one '.txt' attachment?

If either of the conditions does not hold, an ignore entry is created and 
the message is not further processed. 
Otherwise an accept record for the message is created, the first `.txt` attachment 
is downloaded and the message is _markMessageAsDownloaded_ in the ISDS. 


Tento repozitář je udržován v rámci projektu OPZ č. CZ.03.4.74/0.0/0.0/15_025/0004172.
![Evropská unie - Evropský sociální fond - Operační program Zaměstnanost](https://data.gov.cz/images/ozp_logo_cz.jpg)
