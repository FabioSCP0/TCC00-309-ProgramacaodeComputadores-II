package introductionToJava;
import java.util.*;

public class Q04 {
    public static void main (String arg []){
        float[]preco = {4.0f, 4.5f, 5.0f, 2.0f, 1.5f};

        float  valor;
        int pdt,ammount;
        valor = 0.0f;
        
        @SuppressWarnings("resource")
        Scanner entry = new Scanner(System.in);
        pdt = entry.nextInt();
        ammount = entry.nextInt();
        valor = ammount*preco[(pdt-1)];
        System.out.printf("Total: R$ %.2f ",valor);
        System.out.println("");
    }
}
