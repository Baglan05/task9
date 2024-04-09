import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sec = new Scanner(System.in);
        int a = sec.nextInt();
        int b = sec.nextInt();

        System.out.println(func(a, b));
    }

    /**
     *
     * @param n The total number of elements.
     * @param k The number of elements to choose (0 <= k <= n).
     * @return The binomial coefficient C(n, k).
     */
    public static int func(int n, int k) {
        if (k == 0 || k == n) {
            return 1; // Base case: C(n, 0) = C(n, n) = 1
        } else {
            return func(n - 1, k - 1) + func(n - 1, k);
        }
    }

}