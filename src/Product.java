public class Product {
    private double cost;
    private String name;
    private double weight;

    public Product(String name,double cost, double weight) {
        this.cost = cost;
        this.weight = weight;
        this.name = name;

    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}
