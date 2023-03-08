package me;

import java.util.Scanner;

import javax.lang.model.element.Element;

public class one {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int n ;
        // int c;
        String [] Methods = {"android" , "lunix" , "windows" , "algorim" , "ios"};
        double[] Notes = new double[5];

        for(int i = 0 ; i < Methods.length ; i++){
            System.out.print("enter your num : ");
            Notes[i] = input.nextInt();
        }
        for(int j = 0 ; j < Notes.length ; j++){

        }

        ava(Notes);
    }
    public static void ava(double[] av){
        double s = 0;

        for(int i = 0 ; i < av.length ; i++){
            s = s+av[i];
        }
        s = s / av.length;
        System.out.println("your avarig = " + s);

        if(s >= 10 && s <= 20){
            System.out.println("nah");
        }
        else if(s >= 0 && s <= 9){
            System.out.print("raseb");
        }
        else{
            System.out.println("eroro");
        }
    }
}
