## [apache/pdfbox v2.0.21](https://github.com/apache/pdfbox/tree/2.0.21)

### Methods
- Instrumented: 129
- Invoked: 46

### Generated test cases
- total: 13804
- executed: 1840
- passing: 1597 / 1840 (86.8%)
- failing: 243 / 1840 (13.2%)

### Test assessment
- pseudo-tested -> tested : 17 / 46
- pseudo-tested -> partially tested : 11 / 46
- pseudo-tested -> pseudo-tested : 18 / 46

### Remarks
- If build for `2.0.21` fails, see [this](https://issues.apache.org/jira/browse/PDFBOX-5005) issue   
- Running JaCoCo for code coverage might take additional steps
  - try disabling `<argLine>...</argLine>` for maven surefire plugin in all sub-module POMs
  - try adding plugin + configurations for JaCoCo in individual sub-modules if adding to root module does not work
  - `mvn test` should then generate `jacoco.exec` for all relevant sub-modules
  - run `mvn install`
  - merge them and generate report

