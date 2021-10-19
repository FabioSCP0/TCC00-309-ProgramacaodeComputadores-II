package introductionToJava;
import java.util.*;

public class Q25 {
    public static void main (String arg[]){

        int[] array = new int[10];
        
    	@SuppressWarnings("resource")
        Scanner entry = new Scanner (System.in);
    	
        for (int i=0;i<10;i++){
            array[i] = entry.nextInt();
            if (array[i] <= 0){
                array[i] = 1;
            }
        }
        for (int i=0;i<10;i++){
            System.out.println("X["+i+"] = "+array[i]);
        }
    }
}
