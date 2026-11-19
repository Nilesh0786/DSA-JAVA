package Day8;
import java.util.Scanner;
public class Input {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Name:");
        String flag=sc.nextLine();
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your College Name:");
        String name=sc.nextLine();
        System.out.println("Your favourite programming language");
        String favourite=sc.nextLine();
        System.out.println("Your current semester");
        String semester=sc.nextLine();
        System.out.println("Name "+flag);
        System.out.println("You Age is " + age );
        System.out.println("Your College Name is "+name);
        System.out.println("Your favourite programming language is "+favourite);
        System.out.println("Your current semester is "+semester);
    }
}
