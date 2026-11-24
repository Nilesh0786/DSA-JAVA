package Day17;

public class Student {
    //Attributes
    public int id;
    public String name;
    public int age;
    public int nos;
    // Default constructor //
    public Student(){
        System.out.println("Student Deafault constructor");
    }

    //Parametrized constructor
        public Student(int id, String name, int age, int nos) {
        System.out.println("Student Parametrized constructor");
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
    }

    // Copy constructor
    public Student(Student srcobj){
        System.out.println("Student Copy constructor");
        this.id = srcobj.id;
        this.name = srcobj.name;
        this.age = srcobj.age;
        this.nos = srcobj.nos;
    }
    public void study(){
        System.out.println(name+" "+"Studing");

    }
    public void sleep(){
        System.out.println(name+" "+"Sleeping");

    }
    public void bunk(){
        System.out.println(name+" "+"Bunking");

    }
}

