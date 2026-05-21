class inheritence {

    public static void main(String args[]) {
       person person = new person("Sagar",20);
       student student = new student(27,"Pala",7.9);
       person.show();
       student.show();
       student.showgpa();
    }

}