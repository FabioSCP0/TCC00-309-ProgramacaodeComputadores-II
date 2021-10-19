package introductionToJava;
import java.util.*;

public class Q23 {
    public static void main (String arg[]){
    	
        int number;
        int total = 1;
        
    	@SuppressWarnings("resource")
        Scanner entry = new Scanner (System.in);
        number = entry.nextInt();
        
        for (int i=2;i<=number;i++){
            total = total*i;
        }
        System.out.println(total);
    }
    
}
