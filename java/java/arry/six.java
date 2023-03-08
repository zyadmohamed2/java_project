package java.arry;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] [] matrix = new int [3][4];
        int[] vector = new int [3*4];
        int s ;
        int k =0 ;

        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                System.out.print("Enter your numder matrix ["+i+"] ["+j+"] : ");
                matrix [i] [j] = input.nextInt();
            }
        }
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                System.out.println("matrix ["+i+"] ["+j+"] =  "+ matrix[i][j]);
            }
        }
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<4; j++)
            {
                vector[k] = matrix[i][j];
                k = k + 1 ;
            }
        }
 
        for (int i=0; i<vector.length; i++)
        {
            System.out.print(vector[i] + "\t");
        }
    }
}
