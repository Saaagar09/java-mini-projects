@FunctionalInterface
interface MyInterface {
    void display();
}

class LambdaExpression {
    public  static void main(String[] args) {

        MyInterface obj = () -> System.out.print("This is an example of lambda Expression");
        obj.display();
    }
}