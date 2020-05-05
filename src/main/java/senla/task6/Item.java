package senla.task6;

/**
 * The type Item.
 */
public class Item {
    private double price;
    private double weight;

    /**
     * Instantiates a new Item.
     *
     * @param price  the price
     * @param weight the weight
     */
    Item(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "price=" + price +
                ", weight=" + weight +
                '}';
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    double getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets weight.
     *
     * @return the weight
     */
    double getWeight() {
        return weight;
    }

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
