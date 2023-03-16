package TD2;

public class exo4 {
    public static void main(String [] args){
        int[] tab = {10,52,3,8,74,45};
        int[] tab2 = trierTableau(tab);
        for(int i= 0; i < tab2.length; i++){
            System.out.println(tab2[i]);
        }
    }

    public static int[] trierTableau(int[] tab){
        for(int i = 0; i < tab.length; i++){
            int iMax = max(tab, i);
            int max = tab[iMax];
            tab[iMax] = tab[i];
            tab[i] = max;
        }
        return tab;
    }
    
    public static int max(int[] tab, int i){
        int max = tab[i];
        int iMax = i;
        for(int j = i; j < tab.length; j++){
            if(tab[j] > max){
                max = tab[j];
                iMax = j;
            }
        }
        return iMax;
    }
}