# adba-mirror

adba-mirror is a GIT mirror for openjdk incubator ADBA: Asynchronous Database Access, a non-blocking database access API that Oracle is proposing as a Java standard

It is a GIT mirror for openjdk Mercurial repository.

**DO NOT open pull-requests here, this just a mirror**

## How to use ADBA from Gradle

Artifact is available in bintray :

```groovy
repositories {
    maven { setUrl("https://dl.bintray.com/pull-vert/adba/") }
}

dependencies {
    compile('jdk.incubator:adba:0.01')
}
```

## ADBA

ADBA is Asynchronous Database Access, a non-blocking database access api that 
Oracle is proposing as a Java standard. ADBA was announced at 
[JavaOne 2016](https://static.rainfocus.com/oracle/oow16/sess/1461693351182001EmRq/ppt/CONF1578%2020160916.pdf) 
and presented again at [JavaOne 2017](http://www.oracle.com/technetwork/database/application-development/jdbc/con1491-3961036.pdf). 
The ADBA source is available for download from the [OpenJDK sandbox](http://hg.openjdk.java.net/jdk/sandbox/file/9d3b0eb749a9/src/jdk.incubator.adba) 
as part of the OpenJDK project and the JavaDoc is available [here](http://cr.openjdk.java.net/~lancea/8188051/apidoc/jdk.incubator.adba-summary.html). 
You can get involved in the ADBA specification effort by following the 
[JDBC Expert Group mailing list](http://mail.openjdk.java.net/pipermail/jdbc-spec-discuss/).

ADBA require JDK 9 or later, it does not have any dependencies outside of Java SE.

## Versions

### 0.01

Built the 10 june 2018


## Build and deployment (note for myself)

* Get ADBA source is available for download from the [OpenJDK sandbox](http://hg.openjdk.java.net/jdk/sandbox/file/9d3b0eb749a9/src/jdk.incubator.adba)
* Put it in this project
* increment 'version' in [build.gradle](build.gradle)
* upload to bintray using 'bintrayUpload' task