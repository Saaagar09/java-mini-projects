import java.util.Scanner;

class QuizGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int total = 0;

        // Array of quiz questions
        String[] questions = {
                "1. What is JVM?",
                "2. Which keyword is used to create an object?",
                "3. Which loop is guaranteed to run at least once?",
                "4. Which data type stores true or false?",
                "5. Which company developed Java?"
        };

        // 2D Array of options
        String[][] options = {

                {
                        "1. Java Virtual Machine",
                        "2. Java Vendor Machine",
                        "3. Joint Virtual Memory",
                        "4. Java Visual Manager"
                },

                {
                        "1. class",
                        "2. object",
                        "3. new",
                        "4. create"
                },

                {
                        "1. for loop",
                        "2. while loop",
                        "3. do while loop",
                        "4. enhanced for loop"
                },

                {
                        "1. int",
                        "2. boolean",
                        "3. double",
                        "4. char"
                },

                {
                        "1. Google",
                        "2. Microsoft",
                        "3. Sun Microsystems",
                        "4. IBM"
                }
        };

        // Array of correct answers
        int[] answers = {1, 3, 3, 2, 3};

        // Display Message
        System.out.println("** Quiz Game **\n");

        // Loop through questions
        for (int i = 0; i < questions.length; i++) {

            // Print question
            System.out.println(questions[i]);

            // Print matching options
            for (String option : options[i]) {
                System.out.println(option);
            }

            // User input
            System.out.print("Enter option number : ");
            int ans = scanner.nextInt();

            // Check answer
            if (ans == answers[i]) {

                System.out.println(
                        "Correct! " + options[i][answers[i] - 1]
                ); // Dynamic Accessing

                total++;

            } else {

                System.out.println(
                        "Incorrect! Correct Answer is : "
                                + options[i][answers[i] - 1]
                );
            }

            System.out.println();
        }

        // Final Score
        System.out.println(
                "Total point is " + total + " Out of " + questions.length
        );

        scanner.close();
    }
}