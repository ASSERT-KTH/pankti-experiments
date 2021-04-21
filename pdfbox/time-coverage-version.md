### Execution time - average of 5 runs of `mvn clean test`
- Original test suite
  - Number of tests: 1,675
  - Wall-clock: 104.8 seconds
  - CPU (user): 325.8 seconds
- Test suite with pankti tests added
  - Number of tests: 15,526
  - Wall-clock: 275.4 seconds
  - CPU (user): 612.1 seconds 

### Method, branch, and line coverage - computed with JaCoCo
- Original test suite
  - Test method coverage: 54.8% (6,050 / 11,042)
  - Test line coverage: 53.4% (34,652 / 64,787)
  - Test branch coverage: 47.5% (12,371 / 26,033)
- Test suite with pankti tests added
  - Method coverage:  54.8% (6,054 / 11,042)
  - Line coverage: 53.4% (34,657 / 64,787)
  - Branch coverage: 47.5% (12,371 / 26,033)

### Version
- Pankti-generated tests (for 2.0.21) added to release 2.0.22 (tests that failed in 2.0.21 were also ignored for 2.0.22, because they would not have been suggested to developers)
  - Passing: 13,851 (same as before)
  - Failing: 0 (all passing tests in 2.0.21 also pass in 2.0.22)

