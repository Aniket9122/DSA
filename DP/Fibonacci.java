package DP;

public class Fibonacci {

    public static void getFibonacci(int n) {
        int[] memory = new int[n + 1];
        generate(memory, n);
    }

    private static int generate(int[] memory, int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            if (memory[1] != 0) {
                return 1;
            }
            memory[1] = 1;
            System.out.println("1 : " + 1);
            return 1;
        }
        if (memory[n] != 0) {
            return memory[n];
        } else {
            int nm2 = generate(memory, n - 2);
            int nm1 = generate(memory, n - 1);
            int fib = nm2 + nm1;
            memory[n] = fib;
            System.out.println(n + " : " + fib);
            return fib;
        }
    }

    public static void main(String[] args) {
        getFibonacci(10);
    }
}
