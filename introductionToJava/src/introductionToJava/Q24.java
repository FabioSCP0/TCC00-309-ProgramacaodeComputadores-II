package introductionToJava;
import java.util.*;

public class Q24 {
    public static void main (String arg[]){

        int number;
        
    	@SuppressWarnings("resource")
        Scanner entry = new Scanner (System.in);
    	
        number = entry.nextInt();
        for (int i = 1;i<=(number/2);i++){
            if (number%i == 0){
                System.out.println(i);
            }
        }
        System.out.println(number);
    }
}
