package introductionToJava;
import java.util.*;

public class Q21 {
    public static void main (String arg[]){
    	

        int m;
        int n;
        int temp;
        
    	@SuppressWarnings("resource")
        Scanner entry = new Scanner(System.in);
        m = entry.nextInt();
        n = entry.nextInt();
        
        while (m!=0 && n!=0){
            temp = m*n;
            if (temp>0){
                if (m>0){
                    System.out.println("primeiro");                   
                }
                else{
                    System.out.println("terceiro");
                }
            }
            else{
                if (m>0){
                    System.out.println("quarto");
                }
                else{
                    System.out.println("segundo");
                }
            }
                
            m = entry.nextInt();
            n = entry.nextInt();            
        }
        
    }
}
