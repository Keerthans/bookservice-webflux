## bookservice-webflux
This is sample Book Service application using web-flux

## bookservice-webflux-functional
The Router and Handler are sample functional endpoints for the bookservice application

## Building and running locally
In order to run this project locally, you will need the following installed
- Java Development Kit (JDK; has been tested with openjdk 11 and 13)

Once the configuration in `src/main/resources/application.properties` is updated to the desired setup needed, run
`./gradlew clean build`
to build. If the build is successful, a JAR file should be created in the `build/libs` directory. It can be run using
`java -jar build/libs/bookservice.jar`
