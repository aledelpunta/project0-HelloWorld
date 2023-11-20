package compiti;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//binary search
public class Esercizio5 {
    //generare un array ordinato ed al suo interno generare una ricerca binaria ad un numero a nostra scelta
    public static void main(String[] args) {
        int lunghezzaArray = 100;
        int[] arrayOrdinato = new int[lunghezzaArray];
        for(int i = 0;i < arrayOrdinato.length; i++){
            arrayOrdinato[i] = i;
        }
        System.out.println(Arrays.toString(arrayOrdinato));
        //dato un elemento cerca l'elemento indicato all'interno dell'array
        //e ti torna il suo indice cioe la sua posizione
        Random random = new Random();
        //int numeroCercato = 30;
        int numeroCercato = random.nextInt(arrayOrdinato.length);
        System.out.println("numero cercato :" + numeroCercato);
        int posizioneCercata = Arrays.binarySearch(arrayOrdinato, numeroCercato);
        //Arrays.binarySearch(array dove cercare,numero cercato)
        System.out.println("posizione cercata :" + posizioneCercata);
    }

}




