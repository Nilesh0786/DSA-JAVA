//10/11/2026
package Day9;
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* System.out.println("Enter your AGE");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Your eligible to vote");

        } else {
            System.out.println("You aren't eligible to vote");
        }


// Ternary operator
        int streakDays = 5;
        String status = (streakDays >= 30) ? "consistent" : "not consistent";
        System.out.println(status);*/
        System.out.println("Your  day " );
        char day= sc.nextLine().charAt(0);
        switch (day) {
            case 'm':System.out.println("Monday");
            break;
            case 'T':System.out.println("Tuesday");
            break;
            case 'w':System.out.println("Wednesday");
            break;
            case 't':System.out.println("Thursday");
            break;
            case 'f':System.out.println("Friday");
            break;
            case 's':System.out.println("Saturday");
            break;
            case 'S':System.out.println("Sunday");
            break;
            default:System.out.println("Invalid day");
            break;

        }



    }
}