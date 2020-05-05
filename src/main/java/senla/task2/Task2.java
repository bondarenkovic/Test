package senla.task2;

import java.util.Scanner;

/**
 * The type Task 2.
 */
public class Task2 {
    /**
     * Start task 2.
     */
    public static void startTask2() {
        int input1 = numberCheck(new Scanner(System.in), "Please input any integer:");
        int input2 = numberCheck(new Scanner(System.in), "Please input one more integer:");
        lcm(input1, input2);
        gcd(input1, input2);
    }

    private static int numberCheck(Scanner scanner, String s) {
        int input;
        while (true) {
            System.out.println(s);
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

    private static void lcm(int a, int b) {
        int c;
        if (a > b) c = a;
        else c = b;
        while (true) {
            if (c % a == 0 && c % b == 0) break;
            else c += 1;
        }
        System.out.println("LCM = " + c);
    }

    private static void gcd(int a, int b) {
        int c;
        while (a != 0 && b != 0)
            if (a > b) {
                c = a % b;
                a = b;
                b = c;
            } else {
                c = b % a;
                b = a;
                a = c;
            }
        System.out.println("GCD = " + (a + b));
    }

}

