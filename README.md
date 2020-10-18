# Clojure Noob

My personal cheat sheet when learning this weird language [Clojure](https://clojure.org/), along with easy packaging system [Leiningen](https://leiningen.org/). Like, see this weird philosophy:

> It is better to have 100 functions operate on one data structure than 10 functions on 10 data structures.
>
> —Alan Perlis

## Prerequisites

- Java OpenJDK version 8 (minimum)
- Leiningen 2.9.4 (Clojure is already included) -- The easiest way is to use `brew install leiningen` (macOS)

## Learning Guide

- Follow step-by-step guides from [Clojure for the Brave and True](https://www.braveclojure.com/)

## Setup

```bash
git clone https://github.com/ianadiwibowo/clojure-noob.git
cd clojure-noob
```

## Run

Dry run:

```bash
lein run
```

Clojure Lein REPL:

```bash
lein repl
```

Compile to JAR:

```bash
java -jar target/uberjar/clojure-noob-0.1.0-SNAPSHOT-standalone.jar
```
