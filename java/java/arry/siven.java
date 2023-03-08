package java.arry;

import java.util.Scanner;

public class siven {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[][] matrix = new int[3][5];
            int x = 0;
            int s ;

            for(int i = 0 ; i < 3 ; i++){

                for(int j = 0 ; j < 5 ; j++){
                    System.out.print("enter ypur numder arry matrix ["+i+"] ["+j+"] : ");
                    matrix[i][j] = input.nextInt();
                }
            }
            for(int i = 0 ; i < 3 ; i++){

                for(int j = 0 ; j < 5 ; j++){
                    System.out.println("matrix ["+i+"]["+j+"] = "+matrix[i][j]);
                }
            }
            System.out.println("enter serch numder: ");
            s = input.nextInt();
            for(int i = 0 ; i < 3 ; i++){
                
                for(int j = 0 ; j < 5 ; j++){
                    if(s == matrix[i][j]){
                        x++;
                    }
                }
                System.out.println("your serch numder = " + x);
            }
        }

    }
}
