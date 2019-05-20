import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N:");// User should enter N. N is quantity of pairs of brackets
        System.out.println(CatalanFunction.getCatalanNumbers(scanner.nextInt()));
    }
}
