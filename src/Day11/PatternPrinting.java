package Day11;



public class PatternPrinting {
    static void main() {
        //Solid Square Pattern
//        int n=8 ;
//        for(int row=1;row<=n;row++)
//        {
//            for(int col=1;col<=n;col++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        //solid Rectangle Pattern
//        int a=3 ;
//        int m=5;
//        for(int row=1;row<=a;row++)
//        {
//            for(int col=1;col<=m;col++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        int n=5;
//        for(int row=1;row<=5;row++)
//        {
//            for(int col=1;col<=row;col++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        int M=5;
//        for(int row=5;row>=1;row--)
//        {
//            for(int col=1;col<=row;col++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//int n=5;
//for(int row=1;row<=5;row++)
//{ //Space print
//    for(int col=1;col<=5-row;col++)
//{
//    System.out.print(" ");
//}
//    for(int col=1;col<=n;col++)
//    {
//        System.out.print(" *");
//
//    }
//    System.out.println();
//}
//        int n = 5;
//        for (int row = 1; row <= 5; row++) {
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print(" ");
//            }
//            for (int col = 1; col <= 2*n-2*row- 1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//int n=4;
//for(int row=1;row<=n;row++){
//    for(int col=1;col<=6;col++){
//        if(row==1||row==n){
//            System.out.print("*");
//        }else if(col==1){
//            System.out.print("*");
//        }else if(col==6) {
//            System.out.print("* ");
//        } else {
//            System.out.print(" ");
//        }
//
//
//
//    }System.out.println();
//}
//        int n=8;
//        for(int row=1;row<=n;row++)
//        {if(row==1||row==2||row==n){
//            for(int col=1;col<=row;col++){
//                System.out.print("* ");
//            }
//
//        }
//        else{//middle rows
//            System.out.print("* ");
//            for(int col=1;col<=(row-2);col++){
//                System.out.print(" ");
//            }
//

//        int n=5;
//        for(int row=1;row<=n;row++){
//            for(int col=1; col<=n-row; col++){
//                System.out.print(" ");
//            }
//            if(row==1||row==n){
//                for(int col=1;col<=(2*row-1);col++){
//                    System.out.print("* ");
//                }
//            }
//            else{
//             //Middle Rows
//             System.out.print("* ");
//             for(int col=1;col<=(2*row-3);col++){
//                 System.out.print("  ");
//             }
//             System.out.print("* ");
//            }
//            System.out.println();

//        }
//        int n=4;
//        for(int row=1;row<=n;row++) {
//            for(int col=1;col<=n-row;col++) {
//                System.out.print("  ");
//            }
//            for(int col=1;col<=2*row-1;col++) {
//                System.out.print("* ");
//            }System.out.println();
//
//        } for(int row=1;row<=n-1;row++) {
//            for(int col=1;col<=row;col++) {
//                System.out.print("  ");
//            }
//            for(int col=1;col<=2*n-2*row-1;col++) {
//                System.out.print("* ");
//            } System.out.println();
//        }
//

//        int n = 5;
//
//        // Upper Half
//        for(int row=1; row<=n; row++) {
//
//            for(int col=1; col<=n-row; col++) {
//                System.out.print("  ");
//            }
//
//            if(row==1) {
//                System.out.print("* ");
//            }
//            else {
//                System.out.print("* ");
//
//                for(int col=1; col<=2*row-3; col++) {
//                    System.out.print("  ");
//                }
//
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//
//        // Lower Half
//        for(int row=1; row<=n-1; row++) {
//
//            for(int col=1; col<=row; col++) {
//                System.out.print("  ");
//            }
//
//            if(row==n-1) {
//                System.out.print("* ");
//            }
//            else {
//                System.out.print("* ");
//
//                for(int col=1; col<=2*(n-row)-3; col++) {
//                    System.out.print("  ");
//                }
//
//                System.out.print("* ");
//            }
//
//            System.out.println();
//      }
//
//        int n=4;
//        for(int row=1;row<=n;row++) {
//            //Part 1 *
//            for(int col=1;col<=row;col++) {
//                System.out.print("* ");
//            }
//            //Part 2
//            for(int col=1;col<=2*(n-row);col++) {
//                System.out.print("  ");
//            } //Part 3
//            for(int col=1;col<=row;col++) {
//                System.out.print("* ");
//            }
//System.out.println();
//        }
//        //Down part
//        for(int row=1;row<=n;row++) {
//            //Part 4 *
//            for(int col=1;col<=n-row+1;col++) {
//                System.out.print("* ");
//            }
//            //Part 5
//            for(int col=1;col<=2*row-2;col++) {
//                System.out.print("  ");
//            } //Part 3
//            for(int col=1;col<=n-row+1;col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        int n = 4;
//        for (int row = 1; row <= n; row++) {
//            //Part 1 *
//            for (int col = 1; col <= row; col++) {
//                System.out.print(col+" ");
//            }
//            System.out.println();
//        }
//        int n = 5;
//        for (int row = 1; row <= n; row++) {
//            //Part 1 *
//            for (int col = 1; col <= row; col++) {
//                System.out.print((char)(n-col+'A')+" ");
//            }
//            System.out.println();
        //}
//
        int n = 4;
        for (int row = 1; row <= n; row++){
            //Part 1
            for (int col = 1; col <= 4-row; col++){
                System.out.print("  ");

            }
            //Part 2
            for(int col = 1; col <= row*2-1; col++){
            System.out.print(row+" ");}
         System.out.println();
        }

    }
}