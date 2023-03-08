package java.arry;

import java.util.Scanner;

public class thre {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a ; 
        int b ;
        System.out.print("enter your num arry 1 : ");
        a = in.nextInt();
        int[] A = new int [a];
        System.out.print("enter your num arry 2 : ");
        b = in.nextInt();
        int[] B = new int [b];

        int[] C = new int[a+b];

        for(int i = 0 ; i < A.length ; i++){
            System.out.print("enter numder of arry "+i+" : ");
            A[i] = in.nextInt();
        }
        for(int i = 0 ; i < A.length ; i++){
            System.out.print("enter numder of arry "+i+" : ");
            B[i] = in.nextInt();
        }
        int o;
        for(o = 0 ; o < A.length; o++){
            C[o] = A[o];
        }
        for(int c = 0 ; c < B.length ; c++){
            C[c+o] = B[c];
        }
        for(int k = 0 ; k < C.length ; k++){
            System.out.println("C ["+k+"] = "+C[k]);
        }
    }
}
