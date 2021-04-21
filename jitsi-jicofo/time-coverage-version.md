### Execution time - average of 5 runs of `mvn clean test`
- Original test suite
  - Number of tests: 63
  - Wall-clock: 26.8 seconds
  - CPU (user): 49.3 seconds
- Test suite with pankti tests added
  - Number of tests: 83
  - Wall-clock: 28.4 seconds
  - CPU (user): 50.1 seconds

### Method, branch, and line coverage - computed with JaCoCo
- Original test suite
  - Test method coverage: 49.8% (672 / 1,350)
  - Test line coverage: 46.9% (3,554 / 7,571)
  - Test branch coverage: 36.0% (989 / 2,744)
- Test suite with pankti tests added
  - Method coverage: 49.8% (672 / 1,350)
  - Line coverage: 47.0% (3,559 / 7,571)
  - Branch coverage: 36.3% (995 / 2,744)

### Version
- Tests across releases N and N+1
  - Passing: 16 out of 20
  - Failing: 4 out of 20 (This is because the class MaxPacketRateCalculator has been removed in stable/jitsi-meet_4966)

