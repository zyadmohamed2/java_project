import java.util.Scanner;

public class welllop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int sum = 0;
        double ava;
        int caont = 0;
        boolean v = true;
        while(v){
            System.out.print("enter grade " + (caont + 1) + ": ");
            x = in.nextInt();
            if (x != -1){
                sum += x;
                caont++;
               
            }
            else{
                v = false;
            }
            
        }
        System.out.println("ava = " + sum / caont);
    }
}
