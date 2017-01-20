This is a basic set up of interop builds with java/scala

Groovy is included with test, but not in main. It can access both Scala and Java classes

The gradle wrapper (which is the best way of ensuring all team members use the same gradle instance), is created using the:
gradle wrapper
command. After this, gradle is run from the root of the project using ./gradlew, e.g.
./gradlew clean build

