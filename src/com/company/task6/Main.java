package com.company.task6;

import java.util.ArrayList;
import java.util.List;
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
        System.out.println("Please input backpack capacity: ");
        Scanner in = new Scanner(System.in);
        double weight = in.nextDouble();
        List<Item> items = new ArrayList<>();
       /* Здесь можно добавить вещи, указать их цену и вес
       items.add(new Item(10,5));
        items.add(new Item(5,8));
        items.add(new Item(12,10));
        items.add(new Item(8,5));
        items.add(new Item(2,4));*/
        BackPack backpack = new BackPack(weight);
        backpack.allSets(items);
        List<Item> bestSet = backpack.getBestItems();
        if (bestSet == null) {
            System.out.println("No solution");
        } else {
            System.out.println(bestSet.toString());
        }
    }
}
