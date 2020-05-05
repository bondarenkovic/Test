package senla.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * The type Task 3.
 */
public class Task3 {
    /**
     * Start task 3.
     */
    public static void startTask3() {
        System.out.println("Please input any sentence:");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        List<String> inputList = new ArrayList<>(convert(input));
        System.out.println("Word count is: " + inputList.size());
        sort(inputList).forEach(s -> System.out.print(s + " "));
        System.out.println();
        toUpper(inputList).forEach(s -> System.out.print(s + " "));
    }

    private static ArrayList<String> convert(String input) {
        input = input.replaceAll("[^A-Za-zА-Яа-яё\\s]", "");
        if (input.isBlank()) {
            return new ArrayList<>();
        } else {
            return new ArrayList<>(Arrays.asList(input.split("\\s+")));
        }
    }

    private static List<String> sort(List<String> inputList) {
        return inputList.stream().map(String::toLowerCase)
                .sorted().collect(Collectors.toList());
    }

    private static List<String> toUpper(List<String> inputList) {
        List<String> upperList = new ArrayList<>();
        for (String s : inputList) {
            s = s.substring(0, 1).toUpperCase() + s.substring(1);
            upperList.add(s);
        }
        return upperList;
    }
}
