# Clean Architecture Gradle Scaffold

A simple gradle plugin providing module structures according to the clean architecture pattern

## Open Problems

The build does not work in IntelliJ:
- `internal` things inside a custom sourceSet are visible from other custom sourceSets, but not from the *test* sourceSet, even though an association has been specified and the gradle build works on the command line. This is probably due to the following problem: https://youtrack.jetbrains.com/issue/KTIJ-23114/
- when using *IntelliJ IDEA* to build instead of delegated build (Gradle), `internal` things are not even visible from custom sourceSets. **This is probably a showstopper in many projects, since the IntelliJ Build typically is much faster than the gradle build.**
