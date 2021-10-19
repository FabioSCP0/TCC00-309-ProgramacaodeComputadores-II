package introductionToJava;
import java.util.*;

public class Q01 {
    public static void main (String [] args){
        int[] ballot = {100,50,20,10,5,2,1};
        int[] ballots = new int[7];
        int number;
        
        @SuppressWarnings("resource")
		Scanner entry = new Scanner (System.in);
        number = entry.nextInt();
        System.out.println(number);
        
        for (int i=0; i<7 ; i++){
            if (number >= ballot[i]){
                ballots[i] = number/ballot[i];
                number = number%ballot[i];
            }
            System.out.println(ballots[i]+" nota(s) de R$ "+ballot[i]+",00");
        }
    }
}
