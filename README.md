# Strategy Calculator

A simple calculator project written in Java 17 using the Strategy Design Pattern.

## Features

- Addition
- Subtraction
- Multiplication
- Division
- Runtime strategy switching
- Basic input validation

## Project Structure

- `OperationStrategy.java` - common interface
- `AddStrategy.java` - addition
- `SubtractStrategy.java` - subtraction
- `MultiplyStrategy.java` - multiplication
- `DivideStrategy.java` - division
- `Calculator.java` - context class
- `Main.java` - user menu

## How to Run

Requires Java 17.

Compile:

```bash
javac -d out src/*.java
```

Run:

```bash
java -cp out Main
```

## How It Works

The calculator uses different classes for different operations. All operation classes implement the `OperationStrategy` interface.

The `Calculator` class stores the current strategy. The user can change the operation without creating a new calculator.

## Adding a New Strategy

1. Create a class that implements `OperationStrategy`.
2. Implement the `calculate()` method.
3. Add the new strategy to the menu in `Main.java`.

The `Calculator` class does not need to be changed.