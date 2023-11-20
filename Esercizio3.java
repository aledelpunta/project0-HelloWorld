package compiti;

import java.util.Random;
import java.util.Scanner;

// Una funzione che trovi dato un numero n se è primo o no
public class Esercizio3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        //System.out.println("quale numero vuoi sapere?");
        //int domanda = scanner.nextInt();
        int domanda = random.nextInt(100);
        //int domanda = 70;
        boolean risposta = false;
        for(int i = 2; i <= domanda/2; ++i){
            if(domanda % i == 0){
                risposta = true;
                break;
            }
        }
        if (!risposta)
            System.out.println(domanda + " è un numero primo");
        else
            System.out.println(domanda + " non è un numero primo");
    }
}

