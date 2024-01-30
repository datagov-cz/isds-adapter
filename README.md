# ISDS Downloader
Download messages and their attachments into target directory. 
Ignore any message older than one day.

For documentation about ISIS see [Poradna ISDS](https://www.poradnaisds.cz/) or [Provozní řád ISDS](https://info.mojedatovaschranka.cz/info/cs/80.html).

## Requirements
 * Java 21
 * git client

## Install from source
Clone this repository and use maven to build the program.
```
git clone https://github.com/opendata-mvcr/nkod-isds.git
cd nkod-isds
mvnw package
```
result of the build is saved into ```dist``` directory.
Update configuration file ```dist/configuration.properties```.
```
cd dist
java -DconfigurationFile=./configuration.properties -jar isds-adapter.jar
```
You may need to remove certificates in ```dist/certificates``` and download valid production/test certificate.

### Generating WSDL client code
The repository already contains the generated code. The following steps can
be used to update the generated code should the WSDL change.

First [download Metro](https://search.maven.org/search?q=a:metro-standalone) 
and unpack into ```./metro``` (we used version 3.0.2). 

The next step is to run the ```wsimport.bat``` located in ```metro/bin```. 
As we import two files we need to run the script twice:
```
.\wsimport.bat ..\..\src\main\resources\wsdl\dm_info.wsdl -keep -Xnocompile -d ..\..\src\main\java -encoding utf-8 -wsdllocation https://www.czebox.cz/static/wsdl/v20/dm_info.wsdl
.\wsimport.bat ..\..\src\main\resources\wsdl\dm_operations.wsdl -keep -Xnocompile -d ..\..\src\main\java -encoding utf-8  -wsdllocation https://www.czebox.cz/static/wsdl/v20/dm_operations.wsdl
```
We need to specify the ```utf-8``` as there are Czech characters in the definitions.

The WSDL definitions can be downloaded from the [ISDS developer](https://www.poradnaisds.cz/) section *Testovací prostředí* > *Dokumentace a formuláře*.

## Basic workflow
This program connects to the ISDS service and list all messages, delivered
in last 1440 minutes (can be set in the configuration).
For every message a following conditions are evaluated:
 * Does the title contains (case-insensitive) 'nkod' ?
 * Does the message have at least one '.txt' attachment?

If either of the conditions does not hold, an _ignore_ entry is created, and the message is not further processed. 
Otherwise, an _accept_ record for the message is created, the first `.txt` attachment 
is downloaded, and the message is _markMessageAsDownloaded_ in the ISDS. 

## Environment properties
Configuration from the configuration file can be overwritten using environment variables. 
Program support following environment properties:
- ISDS_LOGIN - replace `login`.
- ISDS_PASSWORD - replace `password`.
- ISDS_URL - replace `url`.

Tento repozitář je udržován v rámci projektu OPZ č. CZ.03.4.74/0.0/0.0/15_025/0013983.
![Evropská unie - Evropský sociální fond - Operační program Zaměstnanost](https://data.gov.cz/images/ozp_logo_cz.jpg)
