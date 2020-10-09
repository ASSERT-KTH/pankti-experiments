# Experiments on TTorrent v2.0

## Extracted methods:

400

## Instrumentation candidates:

8

## Covered by the workload:

7

## Number of generated test cases:

646

## Result of executing the test cases:

https://github.com/gluckzhang/ttorrent/tree/ttorrent-2.0-pankti
- failures: 36
- errors: 600
- passed: 10

The main reason of a failure: a 'wierd' AssertionError, for example:

```
java.lang.AssertionError: expected: com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage<HAVE #100> but was: com.turn.ttorrent.common.protocol.PeerMessage$HaveMessage<HAVE #100>
	at com.turn.ttorrent.common.protocol.TestHaveMessagePanktiGen.testValidate26(TestHaveMessagePanktiGen.java:1229)
```

The main reason of an error: XStream no converter available, for example:

```
[ERROR] com.turn.ttorrent.client.storage.TestFileCollectionStoragePanktiGen.testRead99  Time elapsed: 0 s  <<< ERROR!
com.thoughtworks.xstream.converters.ConversionException: 
No converter available
---- Debugging information ----
message             : No converter available
type                : java.io.FileCleanable
converter           : com.thoughtworks.xstream.converters.reflection.ReflectionConverter
message[1]          : Unable to make field jdk.internal.ref.PhantomCleanable jdk.internal.ref.PhantomCleanable.prev accessible: module java.base does not "opens jdk.internal.ref" to unnamed module @2c1b194a
class               : java.io.FileDescriptor
required-type       : java.io.FileDescriptor
converter-type      : com.thoughtworks.xstream.converters.reflection.ReflectionConverter
path                : /com.turn.ttorrent.client.storage.FileCollectionStorage/files/com.turn.ttorrent.client.storage.FileStorage/raf/fd/cleanup
line number         : 1
class[1]            : java.io.RandomAccessFile
required-type[1]    : java.io.RandomAccessFile
class[2]            : com.turn.ttorrent.client.storage.FileStorage
required-type[2]    : com.turn.ttorrent.client.storage.FileStorage
class[3]            : java.util.LinkedList
required-type[3]    : java.util.LinkedList
converter-type[1]   : com.thoughtworks.xstream.converters.collections.CollectionConverter
class[4]            : com.turn.ttorrent.client.storage.FileCollectionStorage
required-type[4]    : com.turn.ttorrent.client.storage.FileCollectionStorage
version             : 1.4.12
-------------------------------
	at com.turn.ttorrent.client.storage.TestFileCollectionStoragePanktiGen.testRead99(TestFileCollectionStoragePanktiGen.java:8613)
```

## Test improvement

- pseudo-tested -> tested: 1
- pseudo-tested -> partially-tested: 0
- pseudo-tested -> pseudo-tested: 6

Main reason of the unobvious improvement: too many failed test cases are removed before running descartes.

## Notes

To run descartes on TTorrent, we need [pitmp-maven-plugin](https://github.com/STAMP-project/pitmp-maven-plugin) instead of [pitest-descartes](https://github.com/STAMP-project/pitest-descartes).