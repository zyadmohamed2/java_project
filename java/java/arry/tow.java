package java.arry;

import java.util.Scanner;

public class tow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n ;
        System.out.print("enter your num arry : ");
        n = input.nextInt();
        int[] arry = new int[n];
        
        for(int i = 0 ; i < arry.length ; i++){
            System.out.print("enter arry : ");
            arry[i] = input.nextInt();
        }
        for (int j = 0 ; j < arry.length ; j++){
            System.out.println("arry [" +j+ "] = " + arry[j]);
        }
        System.out.println("--------------------------------------------------------------------------------------");
        for(int i = 0 ; i < arry.length ; i++){
            if(arry[i] > 0){
                arry[i] = 1;
            }
            else {
                arry[i] = -1;
            }
        }
        for(int j = 0 ; j < arry.length ; j++){
            System.out.println("arry [" +j+ "] = " + arry[j]);
        }
    }
}
