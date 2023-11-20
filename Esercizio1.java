package compiti;
//) Calcolare fattoriale di numero n in maniera iterativa e in maniera ricorsiva
public class Esercizio1 {
    // eseguo in maniera ricorsiva
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }
        public static void main (String[]args){
            System.out.println("il fattoriale di 10 in maniera ricorsiva -->" + factorial(10));
            int start = 1;
            int number= 5;
            for(int i = 1;i <= number;i++){
                start=start*i;
            }
            System.out.println("il fattoriale di 5 in maniera iterativa è : " + number + start);


        }
}