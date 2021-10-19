package introductionToJava;

import java.util.Scanner;

public class Q12 {
    public static void main (String arg[]){
        int[] ddd = {11,19,21,27,31,32,61,71};
        String[] city = {"Sao Paulo","Campinas","Rio de Janeiro","Vitoria","Belo Horizonte","Juiz de Fora","Brasilia","Salvador"};
        int num,esc;
        esc = 8;
        
    	@SuppressWarnings("resource")
        Scanner entry = new Scanner (System.in);
        num = entry.nextInt();
        for (int i=0;i<ddd.length;i++){
            if (num == ddd[i]){
                esc = i;
                System.out.println(city[esc]);
            }
        }
        if (esc == 8){
            System.out.println("DDD nao cadastrado");
        }
    }
}
