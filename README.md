# pankti-experiments
Generated tests and data by Pankti

## Project Selection Criteria

Regarding the experimental targets, the following criteria is applied:

- The project should be a real-world product which has a certain number of end-users instead of a prototype/toy example
- The project should contain a certain number of GitHub stars and commits, which indicate its popularity and complexity
- The project can be deployed with the research lab's calculation resource, with a relatively realistic workload for experiments

There are 4 projects selected for the experiments. The following table shows the descriptive metrics of each project.

| project       | Version       | LOC   | Classes | App. Methods | Test Methods | TS Method Cov. | TS Line Cov. | WL Method Cov. | WL Line Cov. |
| ------------- | ------------- | ----- | ------- | -------------| ------------ | -------------- | ------------ | -------------- | ------------ |
| [PDFBox](https://github.com/apache/pdfbox/tree/2.0.21) | 2.0.21 | Sum: 728,812 <br> Java: 161,976 | 1,278 | 11,042 | 1,675 | 54.8% <br> 6,049/11,042 | 53.5% <br> 34,653/64,787 | 21.6% <br> 2,390/11,042 | 21.0% <br> 13,630/64,787 |
| [ttorrent](https://github.com/mpetazzoni/ttorrent/tree/ttorrent-2.0) | 2.0 | Sum: 14,269 <br> Java: 13,573 | 162 | 1,046 | 86 | 71.8% <br> 751/1046 | 68.8% <br> 3,542/5,146 | 51.8% <br> 542/1,046 | 49.2% <br> 2,530/5,146 |
| [jitsi-videobridge](https://github.com/jitsi/jitsi-videobridge/tree/stable/jitsi-meet_4857) | stable-4857 | Sum: 22,826 <br> Java: 18,926 | 154 | 874 | 101 | 40.0% <br> 652/1,627 | 33.6% <br> 2,706/8,048 | 50.4% <br> 842/1,671 | 49.0% <br> 3,995/8,148 |
| [jitsi-jicofo](https://github.com/jitsi/jicofo/tree/stable/jitsi-meet_4857) | stable-4857 | Sum: 28,318 <br> Java: 25,165 | 146 | 1,350 | 63 | 49.4% <br> 667/1,350 | 46.7% <br> 3,537/7,571 | 49.3% <br> 665/1,350 | 46.6% <br> 3,528/7,571 |
| [hedwig](http://hwmail.sourceforge.net/) | 0.7 | Sum: 66,539 <br> Java: 21,444 | 446 | 2,287 | 85 | 14.9% <br> 343/2,303 | 12.2% <br> 1,250/10,266 | 36.9% <br> 850/2,303 | 25% <br> 3,002/10,266 |

### The Commands for Descriptive Metrics Measurement

#### lines of code

Command cloc (Count Lines of Code) is used to calculated LOC.

```
cloc .
```

#### Classes, TS Method Cov., and TS Line Cov.

Add the following xml code into the pom file of the target project within `<project></project>`.
```
<build>
  <plugins>
    <plugin>
      <groupId>org.jacoco</groupId>
      <artifactId>jacoco-maven-plugin</artifactId>
      <version>0.8.5</version>
      <executions>
        <execution>
          <id>default-prepare-agent</id>
          <goals>
            <goal>prepare-agent</goal>
          </goals>
        </execution>
        <execution>
          <id>default-report</id>
          <goals>
            <goal>report</goal>
          </goals>
        </execution>
      </executions>
    </plugin>
  </plugins>
</build>
```

Then run `mvn test` and `mvn jacoco:report`. The JaCoCo report will be generated at `./target/site/jacoco`. If the project contains multiple modules, the plugin can be declared in the root pom file. Run `mvn jacoco:report-aggregate` after `mvn test` to get an aggregated report.

##### JaCoCo for Maven Multi-Module Builds

If a project contains multiple sub-modules, some extra work might be needed in order to generate an aggregated JaCoCo report. (https://github.com/jacoco/jacoco/wiki/MavenMultiModule)

- Create a dedicated module in your project for generation of the report. This module should depend on all or some other modules in the project. [Here](https://github.com/gluckzhang/pdfbox/tree/2.0.21-jacoco/aggregate-report) is an example for PDFBox.
- Run `mvn jacoco:report-aggregate` after `mvn test` to get an aggregated report.
- If your project already defines VM arguments for test execution, be sure that they will include property defined by JaCoCo. (https://www.jacoco.org/jacoco/trunk/doc/prepare-agent-mojo.html)

```xml
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-surefire-plugin</artifactId>
  <configuration>
    <argLine>@{argLine} -your -extra -arguments</argLine>
  </configuration>
</plugin>
```

##### Another Workaround for Aggregated Report Generation

- Simply run `mvn test` first, after which a set of `jacoco.exec` files should be generated in each sub-module's folder
- Use `jacococli.jar` to merge all the execution data files, e.g.,

```bash
java -jar jacococli.jar merge sub-module-a/jacoco.exec sub-module-b/jacoco.exec --destfile jacoco-merged.exec
```
- Use `jacococli.jar` to generate an aggregated report manually

```bash
java -jar jacococli.jar report ./jacoco-merged.exec \
--classfiles ./sub-module-a/target/classes \
--classfiles ./sub-module-b/target/classes \
--sourcefiles ./sub-module-a/src/main/java \
--sourcefiles ./sub-module-b/src/main/java \
--html ./jacoco-report
```
This is very straightforward, though a bit tedious.

#### WL (workload) Method Cov. and WL Line Cov.

Download JaCoCo agent jar from here: [https://www.jacoco.org/jacoco/](https://www.jacoco.org/jacoco/)

Add the following options when starting the target application:

```
-javaagent:<path-to-jacoco>/lib/jacocoagent.jar
```

Then feed the application with the workload, the coverage information will be dumped into file `jacoco.exec` when the JVM terminates. Use the following command to generate an html report:

```
java -jar <path-to-jacoco>/lib/jacococli.jar report ./jacoco.exec --classfiles <path-to-application>/target/classes/com --sourcefiles <path-to-application>/src/main/java --html ./jacoco-report

```

Note that `--classfiles` and `--sourcefiles` can be specified multiple times if you want to analyze several specific sub-modules in the project.
___

#### Target method invocations and object profile counts for Jicofo, PDFBox, and BroadLeaf

<p>
  <img src="https://github.com/castor-software/pankti-experiments/blob/master/invocations.jpg" height=360>
</p>
___
