
This is an example project which has a dependency on [Couchbase Lite Java](https://github.com/couchbase/couchbase-lite-java).

It was used to verify automated build artifacts.

## Supported platforms

* Linux

## Quick Start

**Build**

```
$ git clone https://github.com/tleyden/HelloCouchbaseLiteJava.git
$ cd HelloCouchbaseLiteJava
$ ./gradlew build
```

**Run**


```
$ cd build/lib
$ java -cp "*" helloworld.HelloWorld
```

**Expected output**

```
manager: com.couchbase.lite.Manager@1b7e5e56
documentFetched: com.couchbase.lite.Document@74ab6b5
documentFetched props: {_rev=1-841e9e63b6b707b2ed8f99afc91c8c0b, _id=849b7b03-8d43-40ee-aa41-ff53188e7167, key=value}
```


