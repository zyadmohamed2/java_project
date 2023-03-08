import java.util.Scanner;

public class hffh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n ;
        int temp = 0;
        n = input.nextInt();
        int[] arry = new int[n];

        for(int i = 0 ; i < arry.length ; i++){
            arry[i] = input.nextInt();
        }
        
        for(int j = 0 ; j < arry.length ; j++){
            System.out.println("arry[" + j + "] = " + arry[j]);
        }
        
        for(int i = 0 ; i < arry.length ; i++){ 

            for(int j = i ; j < arry.length; i++){

                if(arry[i] > arry[j]){
                    temp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = temp;
                }
            }
        }
        
        for(int u = 0 ; u < arry.length ; u++ ){
            System.out.println("arry["+i+"] = " +arry.length);
        }
    }
}
