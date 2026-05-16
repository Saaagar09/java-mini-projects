# Array Search Program in Java

A simple Java program that:

* Takes array size input from the user
* Stores string elements inside an array
* Prints all array elements
* Searches for a target element
* Displays the index if found
* Shows `Element Not Found` if the element does not exist

---

## Features

* User input using `Scanner`
* Dynamic array size
* String array handling
* Linear Search implementation
* Boolean flag usage
* Enhanced `for-each` loop
* Proper search termination using `break`

---

## Code

```java
import java.util.Scanner;

class ArraySearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");

        int sizeofarray = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter " + sizeofarray + " Elements :\n");

        String[] arrays = new String[sizeofarray];

        for (int i = 0; i < arrays.length; i++) {

            arrays[i] = scanner.nextLine();
        }

        System.out.print("Array Elements Are:\n");

        for (String array : arrays) {

            System.out.print(array + " ");
        }

        /* Searching elements in array */

        boolean found = false;

        System.out.print("\nEnter Element Name To Search : ");

        String target = scanner.nextLine();

        for (int i = 0; i < arrays.length; i++) {

            if (arrays[i].equals(target)) {

                System.out.print("Target Found at Index [ " + i + " ]");

                found = true;

                break;
            }
        }

        if (!found) {

            System.out.print("Element Not Found");
        }

        scanner.close();
    }
}
```

---

## Example Output

```text
Enter Size of Array : 3
Enter 3 Elements :
Apple
Mango
Banana

Array Elements Are:
Apple Mango Banana

Enter Element Name To Search : Mango

Target Found at Index [ 1 ]
```

---

## Concepts Used

* Arrays
* Loops
* Conditions
* Boolean Variables
* Linear Search
* Scanner Class
* User Input Handling

---

## How to Run

Compile:

```bash
javac ArraySearch.java
```

Run:

```bash
java ArraySearch
```

---

## Author

Created while practicing Java Arrays and Searching Logic.
