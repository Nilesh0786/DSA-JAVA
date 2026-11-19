package Day12;
// Declaration / definition
public class Methods {
    static void print2KaTable(){
        for(int i=1;i<=10;i++){
            int ans = 2*i;
            System.out.println("-> "+ans);
        }//Parametrized

    }
    static void printSum(int x, int y )//Parameter
     {
        System.out.println("SUM: "+(x+y) );
    }
    static int add(int a, int b)
    {
        return a+b;
    }// Function Overloading
    static int sub(int a, int b)
    {
        return a-b;
    }
    static int sub(int a, int b, int c )
        {
        return a-b-c;
        }// Call By Value
    static void solve(int num){
        System.out.println(" insdie solve : "+num);
        num = num*10;
        System.out.println(" insdie solve : "+num);
    }
    static void  main(){
        int num =5;
        System.out.println("inside main : "+num);
        solve(num);
        System.out.println("inside main : "+num);

        //System.out.println("ans2"+ans2);
//        int result = add(1,2);
//        System.out.println(result);
//        printSum(5,10);//Argument
//        System.out.println("Hi ");
//        print2KaTable();// Method call //Method Invoke
//        System.out.println("BYE");
    }
}
