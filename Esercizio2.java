package compiti;
//Una funzione che stampa tutti i primi n numeri di fibonacci calcolando in maniera iterativa
public class Esercizio2 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int n3;
        int stopCiclo = 20;
        System.out.print(n1+" "+n2);
        for(int i=2; i<stopCiclo; ++i){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        }




    }
}
