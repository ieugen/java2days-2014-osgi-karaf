Modular OSGi applications with Apache Karaf
===========================================

Commands
--------

To build a bundle project with maven use this archetype:
~~~
    mvn archetype:generate\
    -DarchetypeGroupId=org.apache.karaf.archetypes\
    -DarchetypeArtifactId=karaf-command-archetype\
    -DarchetypeVersion=4.0.0.M1\
    -DgroupId=ieugen.java2days\
    -DartifactId=java2days-command-bundle
    -Dversion=1.0-SNAPSHOT\
    -Dpackage=ieugen.java2days.bundle
~~~

Note: You can find a list of archetypes on [Maven Central](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22org.apache.karaf.archetypes%22) search for karaf archetypes.