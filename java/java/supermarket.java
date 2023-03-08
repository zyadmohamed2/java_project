import java.util.Scanner;

public class supermarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int x;
        System.err.println("enter cont name");
        x = input.nextInt();
        int arry[] = new int[x];
        int sum = 0;
        for (int i = 1 ; i <= arry.length ; i++){
            System.err.println("enter cont name numder: " + i + "of numder: " + x);
            name = input.next();
            if( name == "botato"){
                arry[i] = 200;
            }
            else if(name == "car"){
               arry[i] = 300; 
            }
        }
        for(int y = 0; y <= arry.length ; y++){
            arry[y] += arry[y];
        }
        System.out.println("sum your name = " +arry);
    }
}