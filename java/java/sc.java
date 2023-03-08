import java.util.Scanner;

public class sc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mark = in.nextInt();
        String r= (mark >= 90 && mark <= 100) ? "A" : (mark >= 80 && mark <= 90) ? "B" : (mark >= 70 && mark <= 60) ? "C" : (mark >= 90 && mark <= 100) ? "D" :"eror";
        System.err.println(r);
    }
}