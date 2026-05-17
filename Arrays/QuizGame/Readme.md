# Quiz Game in Java

A simple console-based Quiz Game built using Java.  
This project helps practice:

- Arrays
- 2D Arrays
- Loops
- Conditional Statements
- User Input using Scanner
- Dynamic Accessing in Arrays

---

# Features

- Multiple technical quiz questions
- Multiple-choice options
- Score tracking system
- Correct answer checking
- Displays correct answer if user enters wrong option
- Uses dynamic 2D array accessing

---

# Technologies Used

- Java
- Scanner Class
- Arrays
- 2D Arrays
- Loops
- If-Else Conditions

---

# Project Structure

## Questions Array

Stores all quiz questions.

```java
String[] questions
```

## Options 2D Array

Stores options for each question.

```java
String[][] options
```

## Answers Array

Stores correct option numbers.

```java
int[] answers
```

---

# Dynamic Accessing Example

```java
options[i][answers[i] - 1]
```

Explanation:

- `i` → current question index
- `answers[i] - 1` → correct option index
- Dynamically accesses correct answer from 2D array

---

# Example Output

```text
** Quiz Game **

1. What is JVM?
1. Java Virtual Machine
2. Java Vendor Machine
3. Joint Virtual Memory
4. Java Visual Manager

Enter option number : 1
Correct!

2. Which keyword is used to create an object?
1. class
2. object
3. new
4. create

Enter option number : 2
Incorrect! Correct Answer is : 3. new
```

---

# Learning Concepts

This project helped practice:

- Nested Loops
- Enhanced For Loop
- Simple For Loop
- Dynamic Array Accessing
- Index Mapping
- Console Input Handling

---

# Author

Created by SAGAR 🚀