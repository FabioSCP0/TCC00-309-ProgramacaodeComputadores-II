package introductionToJava;
import java.util.*;

public class Q11 {
    public static void main (String arg[]){

        String[] bichos = {"aguia","pomba","vaca","homem","pulga","lagarta","sanguessuga","minhoca"};
        int[] array = {111,112,121,122,211,212,221,222};
        int numesc = 0;
        int choice = 0;
        String name;
        
    	@SuppressWarnings("resource")
        Scanner entry = new Scanner(System.in);
    	
        for (int i=0;i<3;i++){
            name = entry.next();
            switch(name){
                case "vertebrado":
                    choice = choice + 100;
                    break;
                case "invertebrado":
                    choice = choice + 200;
                    break;
                case "ave":
                    choice = choice + 10;
                    break;
                case "mamifero":
                    choice = choice + 20;
                    break;
                case "inseto":
                    choice = choice + 10;
                    break;
                case "anelideo":
                    choice = choice + 20;
                    break;
                case "carnivoro":
                    choice = choice + 1;
                    break;
                case "onivoro":
                    choice = choice + 2;
                    break;
                case "hematofago":
                    choice = choice + 1;
                    break;
                case "herbivoro":
                    if (choice == 120){
                       choice = choice + 1; 
                    }
                    else{
                        choice = choice + 2;
                    }
                    break;
            }
        }
        for (int i=0;i<array.length;i++){
            if (choice == array[i]){
                numesc = i;
            }
        }
        System.out.println(bichos[numesc]);
    }      
}
