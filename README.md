# Mutation Testing [![Awesome](https://awesome.re/badge-flat.svg)](https://awesome.re)

## :clipboard: Introduction

Most developers are familiar with the concept of unit testing, and how this is useful to ensure the validity of your code, and guard against bugs creeping up in the future. Java developers will typically use [JUnit](https://junit.org/junit5/) to write their unit tests. Many projects use test coverage tools such as [Jacoco](https://www.eclemma.org/jacoco/) to ensure that the code as written has tests to validate it. But how strong are the tests? Will they stand up against bugs introduced by future code changes? 

[Mutation testing](https://en.wikipedia.org/wiki/Mutation_testing) helps ensure that that tests themselves are of high quality by introducing random bugs, or mutations, and checking if any of the unit tests can catch the bug. While this concept has been around for a while, it is just recently that good tools are becoming available for this purpose. One such tool is [PIT](https://pitest.org/).

## :cloud: Getting Started

Follow along this notes. You will need to have at least [Java 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) installed or some openJDK distribution, and [Gradle](https://gradle.org/) on the PATH. 

You can use some package management tool for windows. E.g. [Chocolatey](https://chocolatey.org/install)

*	[OpenJDK8 Zulu](https://azul.com) - Java Development Kits (OpenJDK build)

```
choco install zulu8 -y
```

*	[Gradle](https://gradle.org/) - Constructor and manager dependencies

```
choco install gradle --version 5.6.4 -y
```

Clone this repository, and fire up a command-line tool.

> To know the testing technique mutation tests, It necessary check diff between _fake-coverage_ and _true-coverage_

## :computer: Commands to execute

Must be enabled unit test _OperationMutationTest_ to compare results and execute:

```
gradle build
gradle pitest
```

## :clipboard: Existing libraries according to programing language

* C/C++
  * [mutate_cpp](https://github.com/nlohmann/mutate_cpp)
* C#
  * [stryker-mutator/stryker-net](https://github.com/stryker-mutator/stryker-net)
* Clojure
  * [mutant](https://github.com/jstepien/mutant)
* Go
  * [zimmski/go-mutesting](https://github.com/zimmski/go-mutesting)
* Haskell
  * [mucheck](https://hackage.haskell.org/package/MuCheck)
* Java/JVM
  * [hcoles/pitest](https://github.com/hcoles/pitest)
        * [PIT : A Practical Mutation Testing Tool for Java (Demo)](https://dl.acm.org/citation.cfm?id=2948707)
        * [An Experimental Evaluation of PIT’s Mutation Operators](http://www.diva-portal.org/smash/get/diva2:1161760/FULLTEXT01.pdf)
    * [Introduction to Mutation Testing](https://blog.frankel.ch/introduction-to-mutation-testing/)
    * [Faster Mutation Testing (in Java)](https://blog.frankel.ch/faster-mutation-testing/)
        * [Voxxed Athens 2017 :: Mutation Testing to the rescue of your Tests • Nicolas Fränkel](https://www.youtube.com/watch?v=E4UuxVWYCVQ)
  * [aliparsai/LittleDarwin](https://github.com/aliparsai/LittleDarwin)
    * [LittleDarwin: a Feature-Rich and Extensible Mutation Testing Framework for Large and Complex Java Systems](https://www.parsai.net/files/research/LittleDarwin%20a%20Feature-Rich%20and%20Extensible%20Mutation%20Testing%20Framework%20for%20Large%20and%20Complex%20Java%20Systems%20(pre-print).pdf)
  * [metamutator](https://github.com/SpoonLabs/metamutator)
  * [Major](http://mutation-testing.org)
    * [Publications related to the Major mutation framework](http://mutation-testing.org/publ/)
* JavaScript
  * [stryker-mutator/stryker](https://github.com/stryker-mutator/stryker)
* PHP
  * [infection/infection](https://github.com/infection)
* Python
  * [sixty-north/cosmic-ray](https://github.com/sixty-north/cosmic-ray)
* Ruby
  * [mbj/mutant](https://github.com/mbj/mutant)
    * [Kill all the mutants - a deep dive into mutation testing and how the Mutant gem works](https://troessner.svbtle.com/kill-all-the-mutants-a-deep-dive-into-mutation-testing-and-how-the-mutant-gem-works)
* Rust
  * [llogiq/mutagen](https://github.com/llogiq/mutagen)
* Scala
  * [sugakandrey/scalamu](https://github.com/sugakandrey/scalamu)
  * [stryker4s](https://stryker-mutator.io/stryker4s/)
* Swift
  * [SeanROlszewski/muter](https://github.com/SeanROlszewski/muter) 
* Other
  * [boggart](https://github.com/squaresLab/boggart)

## :octocat: Can you support me?

I will continue to do things and expose notes, but existing many ways to support what I do:
* Pull requests are welcome a :dizzy:
* Don't forget to give this Repository a :star2:
* <a href="https://www.buymeacoffee.com/pedringcoding" title="Donate to this content using BuyMeACoffee">Buy me a :coffee:</a>
