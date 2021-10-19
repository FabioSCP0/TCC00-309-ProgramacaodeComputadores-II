package introductionToJava;
import java.util.*;

public class Q19 {
    public static void main (String arg[]){

        int n;
        int c = 0;
        int s = 0;
        int r = 0;
        int itotal;

        float pc;
        float pr; 
        float ps;
        float total = 0;
        
    	@SuppressWarnings("resource")
        Scanner in = new Scanner (System.in);
    	
        n=in.nextInt();
        int [] ammount = new int[n];
        String [] animal = new String[n];
        for (int i=0;i<n;i++){
            ammount[i] = in.nextInt();
            animal[i] = in.next();
            total = total + ammount[i];
            switch (animal[i]){
                case "R":
                    r = r + ammount[i];
                    break;
                case "S":
                    s = s + ammount[i];
                    break;
                case "C":
                    c = c + ammount[i];
                    break;
            }
        }
        pc = 100*c/total;
        ps = 100*s/total;
        pr = 100*r/total;
        itotal = (int)total;
        System.out.println("Total: "+itotal+" cobaias");
        System.out.println("Total de coelhos: "+c);
        System.out.println("Total de ratos: "+r);
        System.out.println("Total de sapos: "+s);
        System.out.printf("Percentual de coelhos: %.2f",pc);
        System.out.println(" %");
        System.out.printf("Percentual de ratos: %.2f",pr);
        System.out.println(" %");
        System.out.printf("Percentual de sapos: %.2f",ps);   
        System.out.println(" %");
    }
}
