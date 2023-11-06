public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello world");
        //string si usa per le parole
        String hello="Hello world";
        System.out.println(hello);
        //int si usa per i numeri
        int x=3;
        double y=3.14;
        System.out.println(x);
        System.out.println(y);
       System.out.println(x+" "+y); //cosi abbiamo il risultato 3 3.14
       System.out.println(x+" : "+y);//cosi abbiamo il risultato 3 : 3.14
       System.out.println(x+y);//cosi abbiamo il risultato 6.14
       System.out.println(x+"\n"+y);//cosi scrive 3 e 3.14 su due righe
       final int b=3;//questa ora e una costante che non puo piu assumere un altro valore

       // variabili primitive

       byte b1=8; //8 bit signed positivi e negativi
       short s1=200; //16 bit signed positivi e negativi
       int i1=1_000_000_000; //32 bit signed positivi e negativi
       long l1=10_000_000_000L; //64 bit signed positive e negative
       char c1='a'; //16 bit unsigned solo positive
       float f1=3.14F; //32 bit 
       double d1=3.14; //64 bit un double gestisce i numeri con piu cifre significative
       boolean b2=false; 


       boolean isBalanceNegative=true; //se fosse stato false non avremmo visto il testo sotto
       if(isBalanceNegative) {
           System.out.println("sei un barbone");
           System.out.println("sei un grosso barbone"); //questo testo lo vediamo anche se if fosse false 
                                                
           }
            //si mettono le graffe per comprendere lo spazio di IF!!!!

        double height=210;      //else si usa se abbiamo da gestire piu casi 
        double weight=98.7;
        if(height>200){         //la catena parte sempre con un IF poi ELSE IF e si chiude con ELSE
          System.out.println("sei altissimo");
           if(weight>110){
             System.out.println("dovresti giocare a basket ma sei troppo grasso");
           } else {
             System.out.println("devi giocare a basket");
           }
        } else if(height>180) {
             System.out.println("sei alto");
        } else if(height>170) {
             System.out.println("sei di altezza media");
        } else {
             System.out.println("sei basso");
        }
       
  //height && weight questo rappresenta il simbolo and bisogna avere tutte le operazioni confermate          
  // || simbolo OR bisogna avere almeno una delle operazioni confermate
        boolean isSunny=false;
        double temperature=26.5;
        if(isSunny || temperature>25){
            System.out.println("tutti al mare");
        }
        int z1=0;
        int r3=10;
        if(z1 != 0 && r3 / z1 >3 ){     // / vuol dire diviso
            System.out.println("ciao bello");
        }              //!= vuol dire diverso

        for(int i=0; i<4; i++){ // i++vuol dire incrementa di 1 i<4 vuol dire che deve arrivare fino a 4
            System.out.println("siamo i campioni del mondo!");
        }





    }
    
}