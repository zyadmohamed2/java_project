import java.util.Scanner;
import java.util.function.IntPredicate;

import javax.lang.model.element.Element;

public class p {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int P = 1;
 
        System.out.print("Enter the base number: ");
        a = input.nextInt();
 
        System.out.print("Enter the power number: ");
        b = input.nextInt();
 
        for (int i=1; i<=b; i++)
        {
            P = P * a;
            System.out.println(i);
        }
 
        System.out.print(a+ "^" +b+ " = " +P+ "\n");











        // System.out.print("enter num");

        // int n = input.nextInt();

        // int f ;

        // int s = 1;
        
        // for(int i = 1 ; i <= n ; i++){
        //     f = 1;
        //     f *= i;
        //     if(f % 2 == 0){
        //         s -= f;
        //     }
        //     else{
        //         s += f;
        //     }
        // }
        // System.out.println(s);
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
        // System.out.print("enter your num: ");

        // int num = input.nextInt();

        // int f = 0 ;

        // int o = 1;
        
        // for(int  i = 1 ; i <= num ; i++){
        //     for(int j = 1 ; j <= i ; j++){
        //         f = 
        //     }
        // }
        // System.out.println("factore = "  + f );

























        // System.out.print("enter num: ");
        // int numone = input.nextInt();      
        // System.out.print("enter num: ");
        // int numtow = input.nextInt();
        // System.out.print("enter num: ");
        // int t = input.nextInt();

        // if(numone < numtow && t < numtow){
        //     System.out.println("big num = " + numtow);
        // }
        // else if(numtow < numone && t < numone){
        //     System.out.println("bog num = " + numone); 
        // }
        // else if (numone < t && numtow < t){
        //     System.out.println("bog num = " + t);
        // }
        // else{
        //     System.out.println(numone+" = " + numtow + " = " + t);
        // } 









































// Scanner input = new Scanner(System.in);
// System.out.print("Enter one num: ");
// int N = input.nextInt();
// System.out.print("enter tow num");
// int T = input.nextInt();
// int sum = 0;
// for(int i = N ; i <= T ; i++){
//     if(i % 2 == 0)
//     System.out.println("enen num = "+i);
// }
// System.out.println("sum numder = " + sum);






























//  System.out.print("* \n");
 
//         for (int i=2; i<=7; i++)
//         {
//             System.out.print("* ");
 
//             for (int k=1; k<=i-2; k++)
//             {
//                 System.out.print("- ");
//             }
 
//             System.out.println("* ");
//         }
 
//         for (int j=1; j<=8; j++)
//         {
//             System.out.print("* ");
//         }
 
//         System.out.print("\n");
 



























        // for(int i = 0 ; i < 4 ; i++){
        //     for(int k = 0 ; k < i; k++){
        //         System.out.print("- ");
        //     }
        //     for(int j = 4 ; j >= i + 1 ; j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }
    }
}