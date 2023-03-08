package java.arry;

public class length {
    public static void main(String[] args) {
        int[] arry = new int[5];
        arry[0] = 1;
        arry[1] = 2;
        arry[2] = 3;
        arry[3] = 4;
        arry[4] = 5;
            
        for(int i = 0 ; i < arry.length ; i++){
            System.out.println(arry[i]);
        }
        System.out.println("-----------------------------------------------------------------------");
        for(int u = 0 ; u < arry.length- 2; u++){
            System.out.println(arry[u]);
        }
    }
}
