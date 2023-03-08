package java.arry;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a ;
        int b;
        int sum1 = 0 ;
        int sum2 = 0 ;
        int sum3 = 0 ;
        do{
            System.out.print("Enter the number of lines: ");
            a = input.nextInt();
            System.out.println("");
            System.out.print("Enter the number of columns: ");
            b = input.nextInt();
            System.out.println("");
            //int [] [] arry = new int [a][b];
        }while(a<0 && b<0);
        int [][] matrix = new int [a][b];


        for(int i = 0 ; i < a ; i++){


            for(int j = 0 ; j < b; j++){
                System.out.print("enter : ");
                matrix[i][j] = input.nextInt();
            }
        }
            // for(int i = 0 ; i < a ; i++)
                for(int s = 0 ; s < b ; s++){
                    sum1 += matrix[a][b];
                } 
                for(int k = 0; k < b ; k++){
                    sum2 += matrix[a][b];
                }
                for(int k = 0 ; k < b ; k++){
                        sum3 += matrix[a][b];
                }
        // for(int i = 0 ; i < a ; i++){
        //     for(int j = 0 ; j < b; j++){
        //         System.out.print(matrix[i][j] + "\t");
                
        //     }
        //     System.out.println("\n");
        // }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

    }
}