# 📞 2D Array Dial Pad in Java

This Java program demonstrates how to use a **2D Array (`char[][]`)** to create and display a telephone dial pad layout.

---

## 🚀 Features

* Uses a **2D character array**
* Demonstrates **nested for-each loops**
* Prints a dial pad format like a real phone keypad

---

## 💻 Java Code

```java
public class TwoDArray{
    public static void main(String[] args){

        System.out.print("2 D Array Dial Pad ");
        System.out.println();

        char[][] telephone = {
                {'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'*','0','#'}
        };

        for(char[] pad : telephone){

            for(char pd : pad){
                System.out.print(pd+" ");
            }

            System.out.println();
        }
    }
}
```

---

## 📌 Output

```text
2 D Array Dial Pad
1 2 3
4 5 6
7 8 9
* 0 #
```

---

## 🧠 Concepts Used

* `char[][]` → 2D Array
* Nested loops
* Enhanced `for-each` loop
* Array traversal

---

## 📖 Explanation

### 1️⃣ Creating a 2D Array

```java
char[][] telephone
```

A 2D array stores data in **rows and columns**.

---

### 2️⃣ Outer Loop

```java
for(char[] pad : telephone)
```

This loop accesses each row.

Example:

```text
{'1','2','3'}
```

---

### 3️⃣ Inner Loop

```java
for(char pd : pad)
```

This loop accesses each individual character from the row.

---

## 🎯 Learning Outcome

After completing this project, you will understand:

* How 2D arrays work in Java
* How nested loops operate
* How to print matrix-style data

---

## 🛠️ Future Improvements

You can extend this project by:

* Taking input from the user
* Creating a calculator keypad
* Building a tic-tac-toe board
* Designing simple console games

---

## 📂 File Name

```text
TwoDArray.java
```

---

## 👨‍💻 Author ( SAGAR )

Made while learning Java fundamentals and 2D arrays.
