package Day17;

public class Use {
    public static void main(String[] args) {
         //Student A = new Student();
        Student A = new Student(1,"Rahul",18,5);
//         A.id =1;
//        A.name ="Nilesh";
//        A.age =15;
//        A.nos =5;
        Student B = new Student(A);
        System.out.println(B.id);
        System.out.println(B.name);
        System.out.println(B.age);
        System.out.println(B.nos);
A.bunk();
A.sleep();
A.study();


    }


}
