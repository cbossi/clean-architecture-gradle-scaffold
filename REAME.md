# Clean Architecture Gradle Scaffold

A simple gradle plugin providing module structures according to the clean architecture pattern

## Open Problems

The build does not work in IntelliJ:
- `internal` things inside a custom sourceSet are visible from other custom sourceSets, but not from the *test* sourceSet, even though an association has been specified and the gradle build works on the command line
- when using *IntelliJ IDEA* instead of delegated build, `internal` things are not even visible from custom sourceSets

see also these related issues:
* https://youtrack.jetbrains.com/issue/KTIJ-13638/Intellij-does-not-recognize-an-extra-Kotlin-SourceSet-from-gradle-configuration
* https://youtrack.jetbrains.com/issue/KTIJ-23114/
* https://youtrack.jetbrains.com/issue/KTIJ-7662/IDE-support-internal-visibility-introduced-by-associated-compilations
