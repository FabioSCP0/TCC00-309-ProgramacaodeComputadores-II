package introductionToJava;

import java.util.Scanner;

public class Q06 {
    public static void main (String arg[]){
    	
    	@SuppressWarnings("resource")
        Scanner entry = new Scanner(System.in);
        float a,b,c,num1,num2,num3,per,area;

        a = entry.nextFloat();
        b = entry.nextFloat();
        c = entry.nextFloat();
            
        num1 = Math.abs(b-c);
        num2 = Math.abs(a-c);
        num3 = Math.abs(a-b);
        if(num1<a && num2<b && num3<c){
            per = a+b+c;
            System.out.printf("Perimetro = %.1f \n",per);
        }
        else{
            area = (a+b)*c/2;
            System.out.printf("Area = %.1f \n",area);
        }
    }
    
}
