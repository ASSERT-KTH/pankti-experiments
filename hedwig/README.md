# Experiments on HedWig

## Extracted methods:

- hedwig-api: 320
- hedwig-server: 345
- TOTAL: 665

## Instrumentation candidates:

- hedwig-api: 205
- hedwig-server: 138
- TOTAL: 343

## Covered by the workload:

- hedwig-api: 47
- hedwig-server: 28
- TOTAL: 75

## Number of generated test cases:

- hedwig-api: 262
- hedwig-server: 47
- TOTAL: 309

## Result of executing the test cases:

- hedwig-api: https://github.com/gluckzhang/hedwig-pankti/tree/pankti-hedwig-api
  - failures: 131
  - errors: 120
  - passed: 11
- hedwig-server: https://github.com/gluckzhang/hedwig-pankti/tree/pankti-hedwig-server
  - failures: 26
  - errors: 10
  - passed: 7

## Notes

- If there is any 'java.lang.NoClassDefFoundError: javax/transaction/TransactionManager' exception after starting HedWig, download [javaee-api-8.0.jar](https://repo1.maven.org/maven2/javax/javaee-api/8.0/javaee-api-8.0.jar) and put it into folder `hedwig-0.7-binary/lib`.
- A try/catch block needs to be added for some of the test cases.