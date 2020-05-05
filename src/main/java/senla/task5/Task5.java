package senla.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The type Task 5.
 */
public class Task5 {
    /**
     * Start task 5.
     */
    public static void startTask5 () {
        int input = numberCheck(new Scanner(System.in));
        System.out.println(palindrom(input));
    }

    private static int numberCheck(Scanner scanner) {
        int input;
        while (true) {
            System.out.println("Please input any integer more than 0 and not more than 100 :");
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input > 100) throw new WrongNumberException();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong input");
            } catch (WrongNumberException e) {
                System.out.println("More than 0, but not more than 100");
            }
        }
        return input;
    }

    private static List<Integer> palindrom(int n) {
        List<Integer> palindroms = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            int a = Integer.valueOf(new StringBuilder(String.valueOf(i)).reverse().toString());
            if (a == i) {
                palindroms.add(i);
            }
        }
        return palindroms;
    }
}
