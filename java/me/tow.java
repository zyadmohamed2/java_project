package me;

import java.arry.four;
import java.util.Scanner;

public class tow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n ;
        int h ; 
        System.out.print("enter your num arry : ");
        n = input.nextInt();
         int [] Numbers = new int[n];

         for(int i = 0 ; i < Numbers.length ; i++){
            System.out.print("enter your num : ");
            Numbers[i] = input.nextInt();
        }
        System.out.print("enter numder serch : ");
        h = input.nextInt();
        ifif(Numbers, h);
    }
    public static void ifif(int[] num , int h ){
        for(int i = 0 ; i < num.length ; i++){
            if (h == num[i]){
                System.out.println("your numder serch : " + num[i]);
                break;
            }
        }
        
    }
}
