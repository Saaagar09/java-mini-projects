class Main {
    public static void main(String[] args) {

        Animal animal = ()->"Animal speaking "; // lambda expression used 
        System.out.println(animal.speaks());
    }
}

//Functional interface needed to use lambda expression 
interface Animal{
    String speaks();
}