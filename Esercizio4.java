package compiti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Create una funzione che riceve un numero n in input che restituisce un array
// che comprende tutti i numeri primi compresi fra 1-n
public class Esercizio4 {
    public static void main(String[] args) {
        System.out.println("scegli il numero");
        Scanner scanner = new Scanner(System.in);
        int numeroMssimo = scanner.nextInt();
        List<Integer> numeriPrimi = new ArrayList<>();
        for(int i = 2; i <= numeroMssimo; i++ ) {
            boolean isPrimo = true;
            for(int j = 2;j <= Math.sqrt(i);j++){
                if(i % j == 0){
                    isPrimo = false;
                    break;
                }
            }
            if(isPrimo){
                numeriPrimi.add(i);
            }
        }
        System.out.println("i numeri primi dell'array sono : " + numeriPrimi);
    }
}


