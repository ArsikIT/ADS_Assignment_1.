package tasks;

import java.util.Scanner;

public class Tasks {
    private final Scanner sc = new Scanner(System.in);


    /**
     * This method finds the minimum element in an array.
     * Time complexity: O(n), where n is the size of the array.
     *
     * @param arr an array of integers
     * @return the minimum value in the array
     */
    public int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }



    /**
     * This method calculates the average of the array.
     * Time complexity: O(n), where n is the size of the array.
     *
     * @param arr an array of integers
     * @return the average of the array
     */
    public double avrg(int[] arr) {
        int sum = 0;
        for (int num : arr) { // sum each element of the array
            sum += num;
        }
        return (double) sum / (double) arr.length; //  divide the sum of the elements by the length of the array
    }


    /**
     * This method checks if a number is prime.
     * Time complexity: O(n), where n is the input number.
     *
     * @param n the number to check for primality
     * @return true if the number is prime, false otherwise
     */
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false; //eliminate even numbers and  multiples of 3
        }
        for (int i = 5; i * i < n; i += 6) { // check odd numbers from 5 to sqrt (n) and skip even numbers.
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true; // if number isPrime then return true
    }


    /**
     * This method calculates the factorial of a given number.
     * Time complexity: O(n), where n is the input number.
     * It uses a recursive algorithm.
     *
     * @param n the number to calculate the factorial of
     * @return the factorial of the number
     */
    public int factorial(int n) {
        if (n == 0 || n == 1) return 1;

        return n * factorial(n - 1);
    }


    /**
     * This method calculates the nth Fibonacci number using recursion.
     * Time complexity: O(2^n), where n is the input number.
     *
     * @param n the number to calculate the Fibonacci number for
     * @return the nth Fibonacci number
     */
    public int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }



    /**
     * This method calculates a raised to the power of n.
     * Time complexity: O(n), where n is the input exponent.
     *
     * @param a the base number
     * @param n the exponent
     * @return a^n
     */
    public int power(int a, int n) {
        if (n == 0) return 1;

        return a * power(a, n - 1);
    }



    /**
     * This method recursively prints an array in reverse order.
     * Time complexity: O(n), where n is the length of the array.
     *
     * @param n the length of the array
     */
    public void reverse(int n) {
        if (n == 0) return;

        int num = sc.nextInt();
        reverse(n - 1);
        System.out.println(num + " ");
    }


    /**
     * This method recursively checks if the string consists only of digits.
     * Time complexity: O(n), where n is the length of the string.
     *
     * @param str the string to check
     * @param start the current index in the string
     * @return true if the string consists only of digits, false otherwise
     */
    public boolean isDigit(String str, int start) {
        if (str.length() == start) {
            return true;
        }
        if (!Character.isDigit(str.charAt(start))) {
            return false;
        }

        return isDigit(str, start + 1);
    }


    /**
     * This method recursively computes the Binomial Coefficient.
     * Time complexity: O(2^n).
     *
     * @param n the total number of elements in the set
     * @param k the number of elements to choose
     * @return the binomial coefficient
     */
    public static int binomial(int n, int k) {
        if (k > n) return 0;
        if (n == k || k == 0) {
            return 1;
        }
        int res = binomial(n - 1, k - 1) + binomial(n - 1, k);

        return res;
    }


    /**
     * This method finds the GCD.
     * Time complexity: O(log n).
     *
     * @param a the first number
     * @param b the second number
     * @return the GCD of the two numbers
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
