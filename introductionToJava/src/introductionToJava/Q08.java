package introductionToJava;
import java.util.*;

public class Q08 {
     public static void main (String arg[]){

        double[] sides = new double[3];
        double number,angles;
        int li;
        
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        li=0;
        angles = 0;
        for (int i=0;i<sides.length;i++){
            sides[i] = in.nextDouble();
        }
        for (int j=1; j<sides.length;j++){
            for (int i=1 ; i<sides.length;i++){
                if (sides[i] > sides[i-1]){
                    number = sides[i-1];
                    sides[i-1] = sides[i];
                    sides[i]=number;
                }
            }
        }
        if(sides[0] < sides[1]+sides[2]){
            /* PESQUISA DO TIPO DE TRIÂNGULO QUANTO AOS ÂNGULOS */  
            angles = Math.pow(sides[0],2) - (Math.pow(sides[1],2) + Math.pow(sides[2],2));
            if (angles < 0){
                System.out.println("TRIANGULO ACUTANGULO");
            }
            else{
                if (angles == 0){
                    System.out.println("TRIANGULO RETANGULO");
                }
                else{
                    System.out.println("TRIANGULO OBTUSANGULO");
                }
            }
            /* PESQUISA TIPO DE TRIÂNGULO QUANTO AO LADO */
            for (int i=0;i<(sides.length-1);i++){
                for(int j=i+1;j<sides.length;j++){
                    if (sides[i]==sides[j]){
                        li=li+1;
                    }
                }
            }
            if (li == 3){
                System.out.println("TRIANGULO EQUILATERO");
            }
            else{
                if (li==1){
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
        }   
        else{
            System.out.println("NAO FORMA TRIANGULO");
        }
    }
}
