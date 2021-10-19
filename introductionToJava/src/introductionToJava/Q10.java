package introductionToJava;

import java.util.Scanner;
public class Q10 {
    public static void main (String arg[]){

        float wage;
        float [] range = {400.00f,800.00f,1200.00f,2000.00f};
        int [] indice = {15,12,10,7,4};
        int i = 0;
        boolean dec = true;
        
    	@SuppressWarnings("resource")
        Scanner entry = new Scanner (System.in);

        wage = entry.nextFloat();
        while (dec){
            if (i == range.length){
                dec = false;
                i=i+1;
            }
            else{
                if (wage <= range[i]){
                    dec = false;
                }
            i=i+1;
            }
            
        }
        System.out.printf("Novo salario: %.2f \n",(wage+(wage*indice[i-1]/100)));
        System.out.printf("Reajuste ganho: %.2f \n",wage*indice[i-1]/100);
        System.out.println("Em percentual: "+indice[i-1]+" %");
    }
}
