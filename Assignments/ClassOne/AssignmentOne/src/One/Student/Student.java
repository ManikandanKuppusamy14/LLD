package One.Student;

public class Student {
    public int age;
    public String name;

    public void display()
    {
        System.out.println("My name is " + name + ". I am " + age + " years old");
    }

    public void sayHello(String name1)
    {
        System.out.println(this.name + " says hello to " + name1);
    }
}

