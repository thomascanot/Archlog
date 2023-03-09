package TD2;

public class exo1 {
    public static void main (String [] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        long resultat = Multipli(a, b);

        System.out.println(a + " x " + b + " = " +resultat);
        
    }

    //exo 2 
    public static long Multipli(int a, int b){
        long resultat = 0;
        for(int i=0; i < b; i++){
            resultat = resultat + a;
        }
        return resultat;
    }
}
