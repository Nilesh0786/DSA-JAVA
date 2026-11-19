package Day13;

import java.util.Scanner;

public class Array {

     static int maximum(int[] a,int b){
        int flag=a[0];
        for(int i=0;i<b;i++)
        {
            if(a[i]>flag)
            {
                flag=a[i];
            }
        }

        return flag;
    }

     static void main(String[] args) {
    //DECLARATION

    // ALLOCATION
        int arr [ ] = new int[6];
      // INITIALISATION
 arr[0]=1;
 arr[1]=2;
 arr[2]=3;
 arr[3]=4;
 arr[4]=5;
 arr[5]=6;
    //int flag=0;int mul=1;
        int max = maximum(arr, arr.length);

        System.out.print("Maximum element: " + max);
/* for(int i=0;i<arr.length;i++) {
//     System.out.println("inside solve : " + arr[i]);
//     flag += arr[i];
//     mul *= arr[i];
// }System.out.println(flag);
//    System.out.println(mul);*/
         /*int arr[];
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the array");
         int size = sc.nextInt();
         arr = new int[size];
         for(int i =0;i<arr.length;i++){
             System.out.println("Enter the value of index"+i);
             arr[i]=sc.nextInt();}

         for(int j =0;j<arr.length;j++){
             System.out.println(" the value of index"+arr[j]);
         }*/
}
}
