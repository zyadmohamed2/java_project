public class ar {
    public static void main(String[] args) {
        int []attr = {100, 30,92,94,39,93};
        System.out.println(betterThanAverage(attr, 20)); 
    }
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Your code here
        boolean p = true;
        String s ;
        for(int i = 0 ; i < classPoints.length ; i++){
          if(classPoints[i] > yourPoints){
            p = false;
          }
          else if(yourPoints > classPoints[i]){
            p = true;
          }
            
        }
        return p;
        if(s.equals(s))
          
      }
}
