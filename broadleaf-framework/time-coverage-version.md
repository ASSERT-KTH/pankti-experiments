### Execution time - average of 5 runs of `mvn clean test`
- Original test suite:
  - Number of tests: 197
  - Wall-clock: 23.2 seconds
  - CPU (user): 90.2 seconds
- Test suite with pankti tests added:
  - Number of tests: 548
  - Wall-clock: 34.6 seconds
  - CPU (user): 120.3 seconds

### Method, branch, and line coverage - computed with JaCoCo
- Original test suite
  - Test method coverage: 23.9% (1,478 / 6,173)
  - Test line coverage: 23.7% (5,846 / 24,667)
  - Test branch coverage: 18.4% (2,140 / 11,650)
- Test suite with pankti tests added
  - Method coverage: 23.9% (1,478 / 6,173)
  - Line coverage: 23.7% (5,847 / 24,667)
  - Branch coverage: 18.4% (2,142 / 11,650)

### Version
- Tests across releases N and N+1
  - Passing: 244 (same as before)
  - Failing: 0 (all passing tests in broadleaf-6.1.4-GA also pass inbroadleaf-6.1.5-GA)

