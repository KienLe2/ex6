import java.util.Arrays;

public class ArrayEle {
    public static void main(String[] args) {
        int [] numArray = {10,9,8,7,6,5,4,3,2,1};
        int count = 0;
        //1A
        System.out.println("Before: " + Arrays.toString(numArray));
        for(int i = 0; i <numArray.length - 1; i++)
        {
            if(numArray[i] > numArray[i+1]){
                int greater = numArray[i];
                numArray[i] = numArray[i+1];
                numArray[i+1] = greater;
            }
        }
        //System.out.println("After 1.A: " +Arrays.toString(numArray));
        //1B
        //for(int j = 0; j <numArray.length - 1; j++){
        //    count++;
        //    for(int n = 0; n <numArray.length - 1; n++){
        //        count++;
        //        if(numArray[n] > numArray[n+1]){
        //            count++;
        //            int greater = numArray[n];
        //            numArray[n] = numArray[n+1];
        //            numArray[n+1] = greater;
        //            }
        //        }
        //   }
        //System.out.println("After 1: " +Arrays.toString(numArray));
        //System.out.println("\nNumber of actions: " + count);
        //1C
        for(int j = 0; j <numArray.length; j++) {
            count++;
            for (int n = 0; n < numArray.length - 1; n++) {
                count++;
                if (numArray[n] > numArray[n + 1]) {
                    count++;
                    int greater = numArray[n];
                    numArray[n] = numArray[n + 1];
                    numArray[n + 1] = greater;
                }
            }
            System.out.print("\n" + Arrays.toString(numArray));
            //System.out.println("After 1: " +Arrays.toString(numArray));
        }
        System.out.println("\nNumber of actions: " + count);
    }
}
