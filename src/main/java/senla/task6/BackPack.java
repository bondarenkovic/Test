package senla.task6;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Back pack.
 */
public class BackPack {
    private List<Item> bestItems = null;
    private double capacity;
    private double bestPrice;

    /**
     * Instantiates a new Back pack.
     *
     * @param capacity the capacity
     */
    BackPack(double capacity) {
        this.capacity = capacity;
    }

    private double calcWeight(List<Item> items) {
        double weight = 0;
        for (Item item : items) {
            weight += item.getWeight();
        }
        return weight;
    }

    private double calcPrice(List<Item> items) {
        double price = 0;
        for (Item item : items) {
            price += item.getPrice();
        }
        return price;
    }

    private void checkSet(List<Item> items) {
        if (bestItems == null) {
            if (calcWeight(items) <= capacity) {
                bestItems = items;
                bestPrice = calcPrice(items);
            }
        } else {
            if (calcWeight(items) <= capacity && calcPrice(items) > bestPrice) {
                bestItems = items;
                bestPrice = calcPrice(items);
            }
        }
    }


    /**
     * All sets.
     *
     * @param items the items
     */
    void allSets(List<Item> items) {
        if (items.size() > 0) {
            checkSet(items);

            for (int i = 0; i < items.size(); i++) {
                List<Item> newSet = new ArrayList<>(items);
                newSet.remove(i);
                allSets(newSet);
            }
        }
    }


    /**
     * Gets best items.
     *
     * @return the best items
     */
    List<Item> getBestItems() {
        return bestItems;
    }

    /**
     * Gets capacity.
     *
     * @return the capacity
     */
    public double getCapacity() {
        return capacity;
    }

    /**
     * Sets capacity.
     *
     * @param capacity the capacity
     */
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
