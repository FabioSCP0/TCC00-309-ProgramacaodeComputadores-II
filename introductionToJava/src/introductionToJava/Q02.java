package introductionToJava;
import java.util.*;

public class Q02 {
    public static void main (String [] arg){
        int a,b,c,d;
        boolean test;
        test = false;
        
    	@SuppressWarnings("resource")
        Scanner entry = new Scanner(System.in);
    	
        a = entry.nextInt();
        b = entry.nextInt();
        c = entry.nextInt();
        d = entry.nextInt();
        
        if (b>c){
            if (d>a){
                if ((c+d)>(a+b)){
                    if (c>0){
                        if (d>0){
                            if (a%2 == 0){
                                test = true;
                            }
                        }
                    }
                }
            }
        }
        if (test){
            System.out.println ("Valores aceitos");
        }
        else{
            System.out.println ("Valores nao aceitos");
        }
        
    }
    
}
