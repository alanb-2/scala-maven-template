# scala-maven-template

Basic multi-module Maven scala project that implements a simple palindrome utility.

## Prerequisites

* Java 11
* Maven 3

## Compile

```shell
mvn clean compile
```

## Test

```shell
mvn clean verify
```

## Package

```shell
mvn clean package
```

## Run

```shell
java -cp palindrome/target/palindrome-0.1-SNAPSHOT.jar org.aeb.uk.Main deed
```

Output:

```shell
23:05:57.835 [main] INFO  org.aeb.uk.Main$ - Palindrome executing...
23:05:57.940 [main] INFO  org.aeb.uk.Main$ - 'deed' is a palindrome
```