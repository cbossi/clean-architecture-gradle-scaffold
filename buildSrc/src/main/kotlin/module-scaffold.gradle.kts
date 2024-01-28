plugins {
    idea
    kotlin("jvm")

}

repositories {
    mavenCentral()
}

val domainCompilation = kotlin.target.compilations.create("domain")

val applicationCompilation = kotlin.target.compilations.create("application") {
    associateWith(domainCompilation)
}

val infrastructureCompilation = kotlin.target.compilations.create("infrastructure") {
    associateWith(domainCompilation)
    associateWith(applicationCompilation)
}

kotlin.target.compilations.getByName("test") {
    associateWith(domainCompilation)
    associateWith(applicationCompilation)
    associateWith(infrastructureCompilation)
}

// this is necessary in order to specify a dependency to the domain from within another module
val domainSourceSet = sourceSets.getByName("domain")
val domainConfiguration = configurations.create("domain")
dependencies {
    domainConfiguration(domainSourceSet.output)
}
