# StudentDetailsBoot

Student Details maintaining application which uses springboot and H2 DB.
.
|-- HELP.md
|-- mvnw
|-- mvnw.cmd
|-- pom.xml
|-- src
|   |-- main
|   |   |-- java
|   |   |   `-- com
|   |   |       `-- study
|   |   |           |-- StudentDetailsBootApplication.java
|   |   |           |-- controller
|   |   |           |   `-- StudentController.java
|   |   |           |-- exception
|   |   |           |   `-- ResourceNotFoundException.java
|   |   |           |-- model
|   |   |           |   `-- Student.java
|   |   |           |-- repository
|   |   |           |   `-- StudentRepository.java
|   |   |           `-- service
|   |   |               `-- StudentService.java
|   |   `-- resources
|   |       `-- application.properties
|   `-- test
|       `-- java
|           `-- com
|               `-- study
|                   `-- StudentDetailsBootApplicationTests.java
`-- target
    |-- classes
    |   |-- META-INF
    |   |   |-- MANIFEST.MF
    |   |   `-- maven
    |   |       `-- com.study
    |   |           `-- StudentDetailsBoot
    |   |               |-- pom.properties
    |   |               `-- pom.xml
    |   |-- application.properties
    |   `-- com
    |       `-- study
    |           |-- StudentDetailsBootApplication.class
    |           |-- controller
    |           |   `-- StudentController.class
    |           |-- exception
    |           |   `-- ResourceNotFoundException.class
    |           |-- model
    |           |   `-- Student.class
    |           |-- repository
    |           |   `-- StudentRepository.class
    |           `-- service
    |               `-- StudentService.class
    |-- generated-sources
    |   `-- annotations
    |-- generated-test-sources
    |   `-- test-annotations
    `-- test-classes
        `-- com
            `-- study
                `-- StudentDetailsBootApplicationTests.class
