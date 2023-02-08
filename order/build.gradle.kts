plugins {
    `module-scaffold`
}

dependencies {
    domainImplementation(project(path = ":customer", configuration = "domain"))
}
