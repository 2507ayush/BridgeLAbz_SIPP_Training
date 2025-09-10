package Lambda;

import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + " - Price: " + price + ", Rating: " + rating + ", Discount: " + discount;
    }
}

public class CustomSortingECommerce {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 1000, 4.5, 10),
            new Product("Phone", 500, 4.2, 5),
            new Product("Tablet", 300, 4.8, 15)
        );

        // Sort by price using lambda with Comparator
        products.sort(Comparator.comparingDouble(p -> p.price));
        System.out.println("Sorted by price:");
        products.forEach(System.out::println);

        // Sort by rating
        products.sort(Comparator.comparingDouble(p -> p.rating));
        System.out.println("\nSorted by rating:");
        products.forEach(System.out::println);

        // Sort by discount
        products.sort(Comparator.comparingDouble(p -> p.discount));
        System.out.println("\nSorted by discount:");
        products.forEach(System.out::println);
    }
}
