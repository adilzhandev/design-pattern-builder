# Builder Design Pattern — Computer Configurator

A small Java project that shows the Builder design pattern.
Assignment #1 for ShP-2216 (Software Design Patterns), Astana IT University.

## What it builds

The product is a `Computer`. It is a PC configuration with five parts: CPU,
RAM in gigabytes, storage, GPU and the type of the PC.

You build it step by step. The `Computer` object is created only at the end,
inside `build()`, and only if the configuration is correct.

There are two types of PC, and they have different rules:

| Type | Required parts | Minimum RAM | GPU |
|---|---|---|---|
| Gaming | CPU, storage, GPU | 16 GB | you must set it |
| Office | CPU, storage | 8 GB | `Integrated` by default |

## Project structure

```
src/
  Computer.java                 the product
  ComputerBuilder.java          interface with the construction steps
  AbstractComputerBuilder.java  shared fields and setters
  GamingComputerBuilder.java    builds a gaming PC
  OfficeComputerBuilder.java    builds an office PC
  ComputerDirector.java         two standard configurations
  Main.java                     demo
docs/
  uml/                          UML class diagram
```

`AbstractComputerBuilder` keeps the fields and the four setters that both
builders need, so this code is not written twice. Each concrete builder adds
only its own constants and its own checks.

## Build and run

You need JDK 17 or newer.

```bash
javac -d out src/*.java
java -cp out Main
```

## Output

```
Gaming PC: Ryzen 7 7700X, 32 GB RAM, 1 TB SSD, GPU: RTX 4070
Office PC: Intel i5-14400, 16 GB RAM, 512 GB SSD, GPU: Integrated
Gaming PC: Intel i7-14700K, 32 GB RAM, 2 TB SSD, GPU: RTX 4070 Ti
Error: Gaming PC needs CPU, storage and GPU
```

## How to use it

Use the director when you need a standard configuration:

```java
ComputerDirector director = new ComputerDirector();
Computer gaming = director.buildGamingPc(new GamingComputerBuilder());
Computer office = director.buildOfficePc(new OfficeComputerBuilder());
```

Use a builder directly when you need your own configuration:

```java
Computer custom = new GamingComputerBuilder()
        .setCpu("Intel i7-14700K")
        .setRam(32)
        .setStorage("2 TB SSD")
        .setGpu("RTX 4070 Ti")
        .build();
```

Every setter returns the builder, so you can chain the calls.

If something is missing, `build()` throws `IllegalStateException` and the
message says what is wrong:

```java
new GamingComputerBuilder()
        .setCpu("Ryzen 5")
        .setRam(32)
        .setStorage("1 TB SSD")
        .build();
// IllegalStateException: Gaming PC needs CPU, storage and GPU
```

## UML diagram

The class diagram is in `docs/uml/`:

- `computer-builder.puml` — PlantUML source
- `computer-builder.svg` — the same diagram as an image
- `uml-1.png` — PNG version
