# Clean Architecture Gradle Scaffold

A simple gradle plugin providing module structures according to the clean architecture pattern.

## Open Problems

The setup does not work in IntelliJ:
- `internal` things inside a custom sourceSet are visible from other custom sourceSets, but not from the *test* sourceSet, even though an association has been specified and the gradle build works on the command line. This is probably due to the following problem: https://youtrack.jetbrains.com/issue/KTIJ-23114/
- when using *IntelliJ IDEA* to build instead of delegated build (Gradle), `internal` things are not even visible from custom sourceSets.

## Remarks
Kotlin has the concept of *friend-path*'s, which is not really documented. I don't know whether friend-path's is used under the hood when using associated compilations, or if this is a separate (deprecated?) concept. Some links about the topic:
* https://youtrack.jetbrains.com/issue/KT-20760/Kotlin-Gradle-Plugin-doesnt-allow-for-configuring-friend-paths-through-API
* https://github.com/bazelbuild/rules_kotlin/issues/211

## Conclusion
* If you want to use IntelliJ Build, this approach will NOT work. If you use the delegate Gradle build you have to live with the fact that you cannot mark a source set as test sources when you want to access internal code from an associated compilation (see issue linked above).
* an alternative for that can be to use ArchUnit to define/enforce the clean architecture / onion architecture structure.
