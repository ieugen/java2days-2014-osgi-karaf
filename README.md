Modular OSGi applications with Apache Karaf
===========================================

Commands
--------

To build a bundle project with maven use this archetype:
~~~
    mvn archetype:generate\
    -DarchetypeGroupId=org.apache.karaf.archetypes\
    -DarchetypeArtifactId=karaf-bundle-archetype\
    -DarchetypeVersion=4.0.0.M1\
    -DgroupId=ieugen.java2days\
    -DartifactId=java2days-bundle
    -Dversion=1.0-SNAPSHOT\
    -Dpackage=ieugen.java2days.bundle
~~~

