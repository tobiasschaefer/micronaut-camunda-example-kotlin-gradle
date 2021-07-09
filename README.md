# micronaut-camunda with Kotlin and Gradle

Simple application based on Getting Started from https://github.com/camunda-community-hub/micronaut-camunda-bpm

See also https://github.com/tobiasschaefer/micronaut-camunda-example-java-maven for another example

Start the example:
`./gradlew clean run`

A simple process is deployed automatically.

The Camunda Cockpit is available at `http://localhost:8080/`. Login with `admin`/`admin`.

The Camunda REST API is available at the context path `/engine-rest`, e.g. `GET http://localhost:8080/engine-rest/engine`.

[![Continuous Integration](https://github.com/tobiasschaefer/micronaut-camunda-example-kotlin-gradle/workflows/Java%20CI%20with%20Gradle/badge.svg)](https://github.com/tobiasschaefer/micronaut-camunda-example-kotlin-gradle/actions)
