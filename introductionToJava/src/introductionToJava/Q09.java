package introductionToJava;

import java.util.Scanner;


public class Q09 {
    public static void main (String arg[]){
    	
        int hi,mi,hf,mf,tempi,tempf,dh,dm;
        dh = dm = 0;
        
    	@SuppressWarnings("resource")
        Scanner entry = new Scanner (System.in);
    	
        hi = entry.nextInt();
        mi = entry.nextInt();
        hf = entry.nextInt();
        mf = entry.nextInt();
        if (mf>=60){
            System.out.println("Valor inválido");
        }
        if (hf>hi){
            tempi = hi*60+mi;
            tempf = hf*60+mf;
            tempf = tempf - tempi;
            dh = tempf/60;
            dm = tempf%60;
        }
        else{
            if (hf<hi){
                tempi = 24*60 - (hi*60+mi);
                tempf = hf*60+mf;
                tempf = tempf + tempi;
                dh = tempf/60;
                dm = tempf%60;
            }
            else{
                if (hf == hi && mf>mi){
                    dh = 0;
                    dm = mf - mi;
                }
                if (hf == hi && mf<mi){
                    dh = 23;
                    dm = 60 - (mi-mf);
                }
                if (hf == hi && mf==mi){
                    dh = 24;
                    dm = 0;       
                }
            }
        }
        System.out.println("O JOGO DUROU "+dh+" HORA(S) E "+dm+" MINUTO(S)");

    }
}
