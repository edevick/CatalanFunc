public class CatalanFunction {
    private int n;

    /* getCatalanNumbers () returns the number of expressions containing n pairs of brackets which are correctly matched
     Catalan formula is C(n) = (2n)!/(n+1)!*n!*/

    public static int getCatalanNumbers(int n){
          return calculateFactorial(2*n)/(calculateFactorial(n)*calculateFactorial(n+1));
    }

    private static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }
}
