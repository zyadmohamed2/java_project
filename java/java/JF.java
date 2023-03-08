import java.util.Scanner;

public class JF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n ;
        System.out.print("enter your num: ");
        n = input.nextInt();
        int[] arrytemp = new int[n];
        int temp;
        for(int i = 0 ; i < arrytemp.length; i++){
            System.out.print("arrytemp [" + i + "] = ");
            arrytemp[i] = input.nextInt();
        }
        System.out.println("------------------------------------------------------------------------------");
        for(int g = 0 ; g <= arrytemp.length ; g++){
            System.out.println("arrytemp [" + g + "] = " + arrytemp[g]);
        }
        System.out.println("nefkeiawihwe;rllfgnseogh");
        for(int i = 0 ; i < arrytemp.length; i++){
            for(int j = i ; j < arrytemp.length; j++){
                if(arrytemp[i] > arrytemp[j]){
                    temp = arrytemp[i];
                    arrytemp[i] = arrytemp[j];
                    arrytemp[i] = arrytemp[j];
                }
            }
        }
        System.out.println("------------------------------------------------------------------------------");

        for(int l = 0 ; l < arrytemp.length; l++){
            System.out.println("arrytemp [" + l + "] = " + arrytemp[l]);

        }
    }

}
