package senla.task1;

import java.util.Scanner;

/**
 * The type Task 1.
 */
public class Task1 {
    /**
     * Start task 1.
     */
    public static void startTask1() {
        int input = numberCheck(new Scanner(System.in));
        isEven(input);
        isPrime(input);
    }

    private static int numberCheck(Scanner scanner) {
        int input;
        while (true) {
            System.out.println("Please input any integer:");
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input == 0) throw new ZeroException();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong input");
            } catch (ZeroException e) {
                System.out.println("Not zero please");
            }
        }
        return input;
    }

    private static void isEven(int n) {
        if (n % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is not even");
        }
    }

    private static void isPrime(int n) {
        int quantityOfDivisors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                quantityOfDivisors++;
            }
        }
        if (quantityOfDivisors > 2) {
            System.out.println("The number is not prime");
        } else {
            System.out.println("The number is prime");
        }
    }
}
