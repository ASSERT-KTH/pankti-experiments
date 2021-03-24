# Experiments on jitsi-jicofo stable-4857

## Extracted methods:

399

## Instrumentation candidates:

29

## Covered by the workload:

29

## Number of generated test cases:

20

## Result of executing the test cases:

- failures: 0
- errors: 0
- passed: 20

Regarding the 20 passing tests, 14 for methods that return primitive types, 5 for methods that return a wrapper of primitive types, 1 for method that returns a custom object.

## Test improvement

- pseudo-tested -> tested: 9
- pseudo-tested -> partially-tested: 10

*10 out of 29 pseudo-tested methods remain to be pseudo-tested.*

# Experiments on jitsi-jicofo stable-4857 using system tests as workload

## Extracted methods:

399

## Instrumentation candidates:

29

## Covered by the workload:

29

## Number of generated test cases:

20

## Result of executing the test cases:

- failures: 0
- errors: 0
- passed: 20

## Test improvement

- pseudo-tested -> tested: 8
- pseudo-tested -> partially-tested: 10

*11 out of 29 pseudo-tested methods remain to be pseudo-tested.*

# Notes

- There is a dependency issue between the instrumentation plugin and jitsi-videobridge: xstream depends on `xpp3_min` while jvb depends on `xpp3`. In `pankti/pankti-instrument/pom.xml`, we need to add `xpp3` as a dependency as well.

```xml
<dependency>
    <groupId>xpp3</groupId>
    <artifactId>xpp3</artifactId>
    <version>1.1.4c</version>
</dependency>
```