public class person {
    int age;
    String name;

    person(String name,int age){
        this.name = name;
        this.age = age;
        
    }
    void show(){
        System.out.println("Your name is " + this.name + " And You are " + this.age+" Years Old");
    }
    
}
