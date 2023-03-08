import java.util.Scanner;

public class kk {
 
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int even = 0;
        int odd = 0;
        for(int i = 1 ; i <= 10; i++){
            System.out.print("enter num: ");
            num = in.nextInt();
            if (num % 2 == 0){
                even++;
            }
            else;
             odd++;
        }
        System.out.println("even num = " + even);
        System.out.println("odd num = " + odd);
    }
    
}