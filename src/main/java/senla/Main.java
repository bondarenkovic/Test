package senla;


import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String menu = "\n Choose \n 1 - Task 1 \n 2 - Task 2 \n 3 - Task 3 \n 4 - Task 4 \n 5 - Task 5 \n 6 - Task 6 \n 0 - Exit";
        System.out.println(menu);
        int choose = in.nextInt();

        switch (choose) {
            case 1: {
                senla.task1.Task1.startTask1();
                break;
            }
            case 2: {
                senla.task2.Task2.startTask2();
                break;
            }
            case 3: {
                senla.task3.Task3.startTask3();
                break;
            }
            case 4: {
                senla.task4.Task4.startTask4();
                break;
            }
            case 5: {
                senla.task5.Task5.startTask5();
                break;
            }
            case 6: {
                System.out.println("There was no information how the items should be input, as an example I propose you 5 items with price 10, 5, 12, 8, 2 and weight 5, 8, 10, 5, 4 respectively. \nYou can always input your own set of items on senla/task6/Task6.java");
                senla.task6.Task6.startTask6();
                break;
            }
            case 0: {
                break;
            }
        }
    }
}
