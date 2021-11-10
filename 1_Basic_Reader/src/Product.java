import java.util.Scanner;

public class Product {

    public static Product read(String line) {
        Scanner scanner = new Scanner(line).useDelimiter(",");
        return new Product(scanner.next(), scanner.next(), scanner.nextDouble());
    }

    private String name;
    private String category;
    private double price;

    /**
     * Creates a product.
     *
     * @param name The name of the product
     * @param category The category of the product
     * @param price The price of the product
     */
    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    /**
     * Gets the name of the product.
     *
     * @return This product's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the category of the product.
     *
     * @return This product's category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Gets the price of the product.
     *
     * @return This product's price
     */
    public double getPrice() {
        return price;
    }

}
