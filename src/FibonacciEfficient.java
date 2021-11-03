import java.util.*;

public class FibonacciEfficient {
    private static long getFibonacci (int n) {
        long[] fibonacci = new long[n];
        if( n <= 2 ){
            return 1;
        }
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        fibonacci[n-1] = getFibonacci(n-1) + getFibonacci(n-2);

        return fibonacci[n-1];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        int c = (int) getFibonacci((int) n);
        System.out.println(c);
    }
}

