# Experiments on jitsi-videobridge stable-4857

## Extracted methods:

226

## Instrumentation candidates:

3

## Covered by the workload:

3

## Number of generated test cases:

0?

## Result of executing the test cases:

- failures: 
- errors: 
- passed: 

## Notes

- There is a dependency issue between the instrumentation plugin and jitsi-videobridge: xstream depends on `xpp3_min` while jvb depends on `xpp3`. In `pankti/pankti-instrument/pom.xml`, we need to add `xpp3` as a dependency as well.

```xml
<dependency>
    <groupId>xpp3</groupId>
    <artifactId>xpp3</artifactId>
    <version>1.1.4c</version>
</dependency>
```