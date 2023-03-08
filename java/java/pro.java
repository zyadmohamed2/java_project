import java.util.Scanner;

import javax.lang.model.type.ArrayType;

public class pro{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N ; 
        int s = 0 ;
        int k = 0;
        int o = 0;
        
        System.out.print("Enter your num: ");
        N = input.nextInt();

        int[] arry = new int[N];

        System.out.println("your arry: " + arry.length);

        for(int i = 0 ; i < arry.length ; i++){
            arry[i] = input.nextInt();
            if(arry[i] < 0){
                //k = k + arry[i];
                k++;
            }
            else if(arry[i] == 0){
                //o = o + arry[i];
                o++;
            }
            else{
                //s = s + arry[i];
                s++;
            }
        }
        System.out.println("<0  = " + k);
        System.out.println("0>  = " +o);
        System.out.println(" = 0  = "+s);

    }
}