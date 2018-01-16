# test-project-example

_This code was adapted from [this repo](https://github.com/pbassiner/sbt-multi-project-example)_

_When I was done with my modifications I was feeling too lazy to fork the original repo and apply the diff patch.
So I decided to write this note instead._

_All the merits goes to his author [Pol Bassiner](https://github.com/pbassiner)_

The example is to provide a multi-project build using `sbt` providing:
* A single `build.sbt` file which allows for centralized configuration, dependency and build management
* Each sub-project contains only its source code
* Sub-projects can depend on other sub-projects
* Only *deliverable* sub-projects produce a *fat-jar* using [sbt-assembly](https://github.com/sbt/sbt-assembly)

# Structure
* test-project-example/
    * common/
        * src/
        * test/
    * mccec/
        * src/
        * test/
    * mccmx/
        * src/
        * test/
    * project/
        * build.properties
        * plugins.sbt
    * build.sbt
