# Java I/O and Exception Handling

### General Description

This project contains several Java practical exercises aimed at mastering:
- Exception handling (standard and custom exceptions)
- Object serialization
- File manipulation
- Code organization using interfaces and business classes
---

## 1. I/O

### Exercise 1: Simulating the ls Command

#### Problem
The goal of this exercise is to create a Java program that replicates the behavior of the system command `ls`, which is used to display the contents of a directory.

#### Solution
A Java class was developed using the `File` class from the `java.io` package.

The program:
- Retrieves the directory path provided by the user
- Checks that the path exists and is indeed a directory
- Lists files and folders using the `list()` method

For each item:
- Determines whether it is a file or a folder
- Checks permissions (read, write, hidden)
- Displays the information in the required format

This approach helps to understand file system manipulation in Java and accessing file properties.
#### Execution

![I/O Ls Command – Exécution](TP5/Screenshots/Screenshot 2026-01-19 223848.png)

---

### Exercise 2: Object Serialization – Product Management

#### Problem

The goal is to create an application that can:
- Manage a list of products
- Save and read products from a `products.dat` file
- Use object serialization
- Provide an interactive menu for the user

#### Solution
The following components were implemented:
- A `Product` class implementing `Serializable`
- An `IProduitMetier` interface defining `CRUD` operations
- A `MetierProduitImpl` class handling business logic and serialization
- An `Application` class containing an interactive menu within a `while` loop

Products are saved and read using:
- `ObjectOutputStream`
- `ObjectInputStream`

#### Execution

![I/O Gestion des produits – Exécution](TP5/Screenshots/Screenshot 2026-01-19 220439.png)
![I/O Gestion des produits – Exécution](TP5/Screenshots/Screenshot 2026-01-19 220452.png)
![I/O Gestion des produits – Exécution](TP5/Screenshots/Screenshot 2026-01-19 220508.png)
![I/O Gestion des produits – Exécution](TP5/Screenshots/Screenshot 2026-01-19 220519.png)
![I/O Gestion des produits – Exécution](TP5/Screenshots/Screenshot 2026-01-19 220540.png)
![I/O Gestion des produits – Exécution](TP5/Screenshots/Screenshot 2026-01-19 220548.png)


---

## 2. Handling Exceptions

### Exercise 1: Exception Handling – Calculator

#### Problem
The goal of this exercise is to create a `Calculator` class capable of handling common calculation errors:
- Division by zero
- Conversion of an invalid string to a number
- Use of unsupported operations

#### Solution
A `Calculator` class was created with three methods:
- `divide(a, b)`: performs division and handles division by zero.
- `convertToNumber(text)`: converts a string to a number and handles format errors.
- `calculate(operation, a, b)`: performs a mathematical operation (+ , - , * , / ) and handles invalid operations.

Exceptions are managed using `try/catch` blocks to prevent the program from crashing and to display clear error messages.

#### Execution

![Handling Exceptions Calculatrice – Exécution](TP5/Screenshots/Screenshot 2026-01-20 000330.png)


---

### Exercise 2: Custom Exception – TooFastException

#### Problem
This exercise involves:
- Creating a custom exception `TooFastException`
- Checking the speed of a vehicle
- Throwing an exception if the speed exceeds 90 km/h
- Displaying the exception call stack

#### Solution
A `TooFastException` class extending `Exception` was created.

The `Vehicle` class includes:
- A `testSpeed(int speed)` method that throws the exception if the speed is over 90.
- A `main` method that tests the method with different values and catches the exception using a `try/catch` block.
- The `printStackTrace()` method is used to display the execution stack.

#### Execution

![Handling Exceptions Calculatrice – Exécution](TP5/Screenshots/Screenshot 2026-01-20 000406.png)

---


