# adba-mirror

adba-mirror is a GIT mirror for **openjdk incubator ADBA** Mercurial repository: Asynchronous Database Access, a non-blocking database access API that Oracle is proposing as a Java standard

**DO NOT open pull-requests here, this is just a mirror**

It is accessible on github and will be kept updated as much as possible.
It is used to provide the adba artefact for your Gradle project.

## How to use ADBA from Gradle

Artifact is available in bintray :

```groovy
repositories {
    maven { setUrl("https://dl.bintray.com/pull-vert/adba/") }
}

dependencies {
    compile('jdk.incubator:adba:0.07')
}
```

## ADBA
ADBA is Asynchronous Database Access, a non-blocking database access api that 
Oracle is proposing as a Java standard. ADBA was announced at 
[JavaOne 2016](https://static.rainfocus.com/oracle/oow16/sess/1461693351182001EmRq/ppt/CONF1578%2020160916.pdf) 
and presented again at [JavaOne 2017](http://www.oracle.com/technetwork/database/application-development/jdbc/con1491-3961036.pdf). 
The ADBA source is available for download from the [OpenJDK sandbox](http://hg.openjdk.java.net/jdk/sandbox/file/JDK-8188051-branch/src/jdk.incubator.adba) 
as part of the OpenJDK project and the JavaDoc is available [here](http://cr.openjdk.java.net/~lancea/8188051/apidoc/jdk/incubator/sql2/package-summary.html). 
You can get involved in the ADBA specification effort by following the 
[JDBC Expert Group mailing list](http://mail.openjdk.java.net/pipermail/jdbc-spec-discuss/).

ADBA require JDK 9 or later, it does not have any dependencies outside of Java SE.

## Versions

### 0.07
2018-11-21 : new update from http://hg.openjdk.java.net/jdk/sandbox/file/JDK-8188051-branch/src/jdk.incubator.adba

### 0.06
2018-07-16 : new update from http://hg.openjdk.java.net/jdk/sandbox/file/JDK-8188051-branch/src/jdk.incubator.adba

### 0.05
update to http://hg.openjdk.java.net/jdk/sandbox/file/JDK-8188051-branch/src/jdk.incubator.adba

### 0.04
incomplete version, do not use

### 0.03
update to http://hg.openjdk.java.net/jdk/sandbox/file/045b7db933bd/src/jdk.incubator.adba

### 0.02
Update module-info.java to add `uses jdk.incubator.sql2.DataSourceFactory`

### 0.01
First release based on http://hg.openjdk.java.net/jdk/sandbox/file/9d3b0eb749a9/src/jdk.incubator.adba

Built the 10 june 2018


## Build and deployment (note for myself)

* Get ADBA source is available for download from the **OpenJDK sandbox**
* Put it in this project
* increment 'version' in [build.gradle](build.gradle)
* upload to bintray using 'bintrayUpload' task
* Publish the files from bintray website
