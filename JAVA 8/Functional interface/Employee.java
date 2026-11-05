/*Functionalinterface : A functional interface is an interface that contains exactly one abstract method. It is mainly used with lambda expressions in Java 8.
*/

interface Employee {

    void salary(); // exactly one abstract method

    default void profile() {
        System.out.println("Functional interface can have  deafulat method and can be overridden ");
    }

    static void empid() {
        System.out.println("This method cannot be overridden");
    }
}

    class Main {
    public static void main(String[] args) {

        Employee emp = new Employee() {  //annonymous inner class used for overriding methods (do not need to create an implementation class )

            @Override
            public void salary() {
                System.out.println("Salary is 30,000");
            }

            @Override
            public void profile() {
                System.out.println("Backend Developer");
            }
        };

        emp.salary();
        emp.profile();
        Employee.empid();
    }
}