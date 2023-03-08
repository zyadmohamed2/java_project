
import java.util.Scanner;
public class bre {
    public static void main(String[] args) {


       Scanner input = new Scanner(System.in);

       char clas;
       int whgit;
       int whgitless;
       double apluss=0;





        System.out.println("enter your class");
        clas = input.next().charAt(0);

        System.out.println("enter your whgit");
        whgit = input.nextInt();

        switch (clas)
        {
            case 'f':
            case 'F':
                if(whgit>30)
                {
                    whgitless = whgit-30;
                    apluss = whgitless * 10;

                }
                 break;
            case 'b':
            case 'B':
                if(whgit>25)
                {
                    whgitless = whgit - 25 ;
                    apluss = whgitless *10;

                }
                 break;
            case 'e':
            case 'E':
                if (whgit>20)
                {
                    whgitless = whgit - 20;
                    apluss = whgitless * 10;

                }
                break;
            default:
                System.out.println("error");
                break;



                
        }
        System.out.println("the extra money is " +apluss );
    
    }
}
