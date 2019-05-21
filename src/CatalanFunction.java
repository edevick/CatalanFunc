public class CatalanFunction {
    private int n;

    /* getCatalanNumbers () returns the number of expressions containing n pairs of brackets which are correctly matched
     Catalan formula is C(n) = (2n)!/(n+1)!*n!*/

    public static int getCatalanNumbers(int n) {
        return calculateFactorial(2 * n) / (calculateFactorial(n) * calculateFactorial(n + 1));
    }

    private static int calculateFactorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * calculateFactorial(n - 1);

    }
}
