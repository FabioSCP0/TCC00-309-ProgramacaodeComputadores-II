package introductionToJava;
import java.util.*;

public class Q20 {
    public static void main (String arg[]){
    	
        int m;
        int n;
        int sum = 0;
        int temp = 0;
        
    	@SuppressWarnings("resource")
        Scanner entry = new Scanner (System.in);
    	
        m = entry.nextInt();
        n = entry.nextInt();
        
        while (m>0 && n>0){
            if (m>n){
                temp=m;
                m=n;
                n=temp;
 
            }
            for (int i=m;i<=n;i++){
                sum = sum + i;
                System.out.printf(i+" ");
            }
            System.out.println("Sum="+sum);
            m = entry.nextInt();
            n = entry.nextInt();
            sum = 0;
        }
    }
    
}
