package java.arry;

import java.util.Scanner;

import javax.swing.InputMap;

public class hrmsh {
    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);
        int n;
        int temp;
        System.out.print("enter your num arry: ");
        n = inout.nextInt();
        int [] arry = new int[n];

        for(int i = 0 ; i < arry.length ; i++){
            System.out.print("enter your num arry "+i);
            arry[i] = inout.nextInt();
        }
        for(int j = 0 ; j < arry.length ; j++){
            System.out.println("arry [" + j + "] = " + arry[j]);
        }
        System.out.println("-----------------------------------------------------------------------");
        for(int i = 0 ; i < arry.length - 1 ; i ++){
            for(int j = i + 1 ; j < arry.length ; j++){
                if(arry[i] > arry[j]){
                    temp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = temp;
                }
            }
        }
        for(int k = 0 ; k < arry.length; k++){
            System.out.println("arry [" + k + "] = " + arry[k]);
        }
    }
}
