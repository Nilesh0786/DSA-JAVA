package Day15;

public class BasicMaths {
    static void printDigits(int num) {
        while(num!=0) {
            System.out.println(num%10);
            num/=10;
        }
    }
    static void countDigits(int num) {
        int flag =0;
        int digit=0;
        int Sum=0;
        while(num!=0) {
            digit=(num%10);
            num/=10;
            flag++;
            Sum+=digit;

        }
        System .out.println("total digits: " + flag);
        System .out.println("total Sum: " + Sum);

    }
    static int printReverse(int num) {
        int revNum=0;
        int digit=0;
        while(num!=0) {
            digit=(num%10);
            //revrese num claculate as per formula
            revNum= revNum*10+digit;


            num/=10;

        }
        return revNum;
    }
    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverseNum = printReverse(num);
        if (originalNum == reverseNum) {
            System.out.println("It is Palindrome");
            return true;
        } else {
            System.out.println("It is not Palindrome");

            return false;
        }

    }
    static boolean primeNumber(int num) {
        for (int i = 2; i <= Math.sqrt (num); i++) {
            if (num % i == 0) {
                //  System.out.println("It is Prime Number");
                return false;
            }
        } //System.out.println("It is not Prime Number");
        return true;
    }
    static int getGCD(int a,int b) {
        //gcd(a,b) = gcd(b,a%b);
        while( b!=0) {
            int c=a%b;
            a=b;
            b=c;
        }

        return a;
    }

    static int getLcm(int a,int b) {
        int gcd = getGCD( a, b);
        //gcd(18,12)=6
        int prod =a*b;
        //prod (a,b)->216
        int lcm = prod/gcd;

        return lcm;
    }
    static void isArmstrong(int n) {
        int originalNum=n;
        int digit=0;
        int sum=0;
        while(n!=0) {
            digit=n%10;
            int cubeofdigit=digit*digit*digit;
            sum+=cubeofdigit;
            n/=10;

        }
        if(sum==originalNum) {
            System.out.println("It is Armstrong");
        }
        else {
            System.out.println("It is not Armstrong");
        }
    }
    static void cheackPefrectNumber(int n) {
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                // i ne num lo perfectly divide krdia h
                // toh ab factor pair kya banega
                // 1st factor -> i
                // 2nd factor-> num/i
                int firstFactor = i;
                int secondFactor = n / i;
                sum += firstFactor + secondFactor;
            }
        }
        if(sum==n) {
            System.out.println("perfect number");
        }
        else {
            System.out.println("not perfect number");
        }
    }
    static void printAllPrimes(int n) {
        for(int num=2; num<=n; num++) {
            boolean isPrime= primeNumber(num);
            if(isPrime==true) {
                System.out.print(num+" ");
            }

        }
    }
    static void main () {
        int num= 52314 ;
        printDigits(num);
        countDigits(num);
        System.out.println(printReverse(num));
        isPalindrome(num);
        //primeNumber(num);
        System.out.println(getGCD(18,12));
        int a= getLcm(18,12);
        System.out.println(a);
        isArmstrong(155);
        cheackPefrectNumber(6);
        printAllPrimes(50);
    }
}
