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
| PDFBox        | xx | xx | xx | xx | xx | xx | xx | xx | xx |
| [ttorrent-cli](https://github.com/mpetazzoni/ttorrent/tree/ttorrent-2.0) | 2.0 | Sum: 14,269 <br> Java: 13,573 | 191 | 943 | 268 | 71.4% <br> 673/943 | 68.7% <br> 2,837/4,130<sup>*</sup> | 52.8% <br> 542/1,026 | 50.1% <br> 2535/5064 |
| [jitsi-videobridge](https://github.com/jitsi/jitsi-videobridge/tree/stable/jitsi-meet_4857) | stable-4857 | Sum: 22,826 <br> Java: 18,926 | 154 | 874 | 101 | 40.0% <br> 652/1,627 | 33.6% <br> 2,706/8,048 | 50.4% <br> 842/1,671 | 49.0% <br> 3,995/8,148 |
| [hedwig](http://hwmail.sourceforge.net/) | 0.7 | Sum: 66,539 <br> Java: 21,444 | 446 | 2,287 | 85 | 14.9% <br> 343/2,303 | 12.2% <br> 1,250/10,266 | 36.9% <br> 850/2,303 | 25% <br> 3,002/10,266 |

<sup>*</sup>The metric is statement coverage mesured by OpenClover.

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
