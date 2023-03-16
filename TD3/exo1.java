package TD3;

public class exo1 {
    public interface Operation {
        Integer addition (Integer a, Integer b);
        Integer multiplication (Integer a, Integer b);
        Integer diviser (Integer a, Integer b);
        Integer factorielle(Integer n);
    }

    public static class OperationImpl implements Operation {

        public Integer addition(Integer a, Integer b){
            return a + b;
        }

        public Integer multiplication(Integer a, Integer b){
            Integer resultat = 0;
        for(int i=0; i < b; i++){
            resultat = addition(resultat, a);
        }
        return resultat;
        }

        public Integer factorielle(Integer n){
            Integer fact = n;
            if (n < 1) return 0;
            else if (n == 1) return 1;
            else if (n > 10000) return Integer.MAX_VALUE;
            else {
                for(Integer i=1; i < n; i++){
                    fact = multiplication(fact, i);
                }
            }
            return fact;
        }

        public Integer diviser(Integer a, Integer b){
            return Math.floorDiv(a, b);
    }
}

    public static class OperationRecImpl implements Operation {
    
            public Integer addition(Integer a, Integer b){
                if (b ==0) return a;
                else return addition(a + 1, b-1);
            }
    
            public Integer multiplication(Integer a, Integer b){
                if (b == 0) return 0;
                else return addition(a, multiplication(a, b - 1));
            }
    
            public Integer factorielle(Integer n){
                if (n < 1) return 0;
                else if (n == 1) return 1;
                else if (n > 10000) return Integer.MAX_VALUE;
                else return multiplication(n, factorielle(n - 1));
            }
    
            public Integer diviser(Integer a, Integer b){
                if (a<b) return 0;
                else return 1 + diviser(a-b, b);
    }
}

    public static void main (String [] args) {
        OperationImpl op = new OperationImpl();
        System.out.println(op.addition(5, 6));
        System.out.println(op.multiplication(5, 6));
        System.out.println(op.factorielle(5));
        System.out.println(op.diviser(8, 4));
        System.out.println("Recursif");
        OperationRecImpl opRec = new OperationRecImpl();
        System.out.println(opRec.addition(5, 6));
        System.out.println(opRec.multiplication(5, 6));
        System.out.println(opRec.factorielle(5));
        System.out.println(opRec.diviser(8, 4));
    }

}