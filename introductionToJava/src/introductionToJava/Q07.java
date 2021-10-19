package introductionToJava;
import java.util.*;
public class Q07 {
    public static void main (String arg[]){
        int num1,num2,temp;
        
        @SuppressWarnings("resource")
        Scanner entry = new Scanner(System.in);
        
        num1 = entry.nextInt();
        num2 = entry.nextInt(); 
        if (num1<num2){
            temp = num2;
            num2 = num1;
            num1 = temp;
        }
        if ((num1%num2)==0){
                System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }
    }
}
