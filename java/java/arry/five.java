package java.arry;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int [3] [3];
        int s ;

        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print("enter your num matrix ["+i+"] ["+j+"] : ");
                matrix[i][j] = input.nextInt();
            }
        }
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                
                System.out.println(matrix [j][i]);           
            }

            //System.out.println("matrix ["+i+"] = " + s);        
        }

    }
}
