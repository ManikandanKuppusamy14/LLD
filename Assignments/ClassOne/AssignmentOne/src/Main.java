import One.Student.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Student student= new Student();
//
//        student.name = "Mani";
//        student.age = 26;
//
//        student.display();
//        student.sayHello("Magi");

        Student s1 = new Student();
        s1.age = 10;
        s1.name = "A";
        s1.display();

        Student s2 = s1;
        s2.age = 20;
        s2.name = "B";

        s2.display();

        s1.display();
    }
}