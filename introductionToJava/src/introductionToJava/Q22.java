package introductionToJava;
import java.util.*;

public class Q22 {
    public static void main (String arg[]){

        int g =0;
        int a = 0;
        int d = 0;
        int fuel;
        
    	@SuppressWarnings("resource")
        Scanner entry = new Scanner(System.in);
    	
        do{
            do{
                fuel = entry.nextInt();
            }while (fuel<1 || fuel >4);
            switch (fuel){
                case (1):
                    a=a+1;
                    break;
                case (2):
                    g=g+1;
                    break;
                case (3):
                    d=d+1;
                    break;
            }
        }while (fuel > 0 && fuel < 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+a);
        System.out.println("Gasolina: "+g);
        System.out.println("Diesel: "+d);
    }
}
