# Maven

- dependency & path/environments manager for Java apps
- like gomod, godeps, etc
- pom.xml --> config file, Project Object Model file, in the root of the project, 
    - contains {project meta data, dependencies, plugins},
        - groupId, artifactid, version(GAV), packaging, etc ;;
            - use the SNAPSHOT version suffix to suggest that the project is under active development 
        - dependencies > dependency
        - plugins: such as Junit runners
    - check the [maven-central](https://search.maven.org)
- mvnw --> mavenwrapper files, like gradlew scripts
- gets JARs from the local mvn repo & then mvn central repo
- root-dir = {pom.xml, src/main/{java, resources, webapp, test/{java, resources}}, target}
