# Experiments on broadleaf-6.1.4-GA

## Extracted methods:

2929

## Instrumentation candidates:

32

## Covered by the workload:

11

## Number of generated test cases:

158

## Result of executing the test cases:

- failures: 52
- errors: 0
- passed: 106

## Test improvement

- pseudo-tested -> tested: 2
- pseudo-tested -> partially-tested: 3
- pseudo-tested -> pseudo-tested: 6

## Notes

Some manual work needs to be done on the generated tests:

- Because of xStream's serialization strategy for a Date class, a converter needs to be registered in the tests. For example: [TestOrderImplPanktiGen.java](https://github.com/gluckzhang/BroadleafCommerce/blob/broadleaf-6.1.4-GA-pankti/core/broadleaf-framework/src/test/java/org/broadleafcommerce/core/order/domain/TestOrderImplPanktiGen.java)