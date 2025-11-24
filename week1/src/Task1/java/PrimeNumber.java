package Task1.java;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;


        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Prime numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            int x = numbers[i];
            boolean isPrime = true;

            if (x <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j < x; j++) {
                    if (x % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(x + " ");
                count++;
            }
        }
        System.out.println("\nTotal count: " + count);
    }
}