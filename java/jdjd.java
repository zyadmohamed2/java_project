import java.util.Scanner;

public class jdjd {
   public static void main(String[] args) {
    System.out.println(areYouPlayingBanjo("Reanor "));
   }
    public static String areYouPlayingBanjo(String name) {
    String s = "";
      
    switch(name.charAt(0)){
        case 'r':
        case 'R':
            s = " plays banjo" ;
        default:
            s = " does not play banjo";
    }
    return name + s;
}
}