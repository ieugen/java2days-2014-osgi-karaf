Modular OSGi applications with Apache Karaf
===========================================

Step-by-step branches
---------------------

You can fallow this tutorial step by step by checking out the branches:

~~~
  01-java2days-bundle
  02-blueprint-bundle
  03-api-and-command
  04-karaf-features
  05-karaf-assembly
  06-jax-rs
  07-cdi-with-jax-rs
  master
~~~
*master* branch contains the latest code.

Commands
--------

To build a bundle project with maven use this archetype:
~~~
    mvn archetype:generate\
    -DarchetypeGroupId=org.apache.karaf.archetypes\
    -DarchetypeArtifactId=karaf-bundle-archetype\
    -DarchetypeVersion=4.0.0.M1\
    -DgroupId=ieugen.java2days\
    -DartifactId=java2days-cdi-bundle\
    -Dversion=1.0-SNAPSHOT\
    -Dpackage=ieugen.java2days.cdi
~~~

Note: You can find a list of archetypes on [Maven Central](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22org.apache.karaf.archetypes%22) search for karaf archetypes.

In Apache Karaf you can install the java2days features with:
~~~
feature:repo-add mvn:ieugen.java2days/java2days-feature-bundle/1.0-SNAPSHOT/xml/features
~~~

Sample JAX-RS service published via this url (after step 06) [http://localhost:8181/services/greet?name=Eugen](http://localhost:8181/services/greet?name=Eugen)