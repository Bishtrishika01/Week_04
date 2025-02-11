/*2. Dynamic Online Marketplace
Concepts: Type Parameters, Generic Methods, Bounded Type Parameters
Problem Statement:
Build a generic product catalog for an online marketplace that supports various product types like Books, Clothing, and Gadgets. Each product type has a specific price range and category.
Hints:
Define a generic class Product<T> where T is restricted to a category (BookCategory, ClothingCategory, etc.).
Implement a generic method to apply discounts dynamically (<T extends Product> void applyDiscount(T product, double percentage)).
Ensure type safety while allowing multiple product categories to exist in the same catalog.
*/
package com.generics;

import java.util.ArrayList;
import java.util.List;

// Abstract class representing a generic product
abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Each product category must implement its own display method
    public abstract void displayProduct();
}

// Book category product
class Book extends Product {
    public Book(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayProduct() {
        System.out.println("Book: " + getName() + " | Price: $" + getPrice());
    }
}

// Clothing category product
class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayProduct() {
        System.out.println("Clothing: " + getName() + " | Price: $" + getPrice());
    }
}

// Gadgets category product
class Gadget extends Product {
    public Gadget(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayProduct() {
        System.out.println("Gadget: " + getName() + " | Price: $" + getPrice());
    }
}

// Generic catalog class that stores various products
class ProductCatalog<T extends Product> {
    private List<T> products = new ArrayList<>();

    // Method to add a product to the catalog
    public void addProduct(T product) {
        products.add(product);
    }

    // Method to retrieve all stored products
    public List<T> getProducts() {
        return products;
    }

    // Method to display all products in the catalog
    public void displayCatalog() {
        for (T product : products) {
            product.displayProduct();
        }
    }

    // Generic method to apply a discount dynamically to a product
    public static <T extends Product> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
        System.out.println("Discount applied! New price of " + product.getName() + ": $" + product.getPrice());
    }
}

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        // Creating catalogs for different product types
        ProductCatalog<Book> bookCatalog = new ProductCatalog<>();
        bookCatalog.addProduct(new Book("Java Programming", 499));
        bookCatalog.addProduct(new Book("Data Structures", 399));

        ProductCatalog<Clothing> clothingCatalog = new ProductCatalog<>();
        clothingCatalog.addProduct(new Clothing("T-Shirt", 1999));
        clothingCatalog.addProduct(new Clothing("Jeans", 4499));

        ProductCatalog<Gadget> gadgetCatalog = new ProductCatalog<>();
        gadgetCatalog.addProduct(new Gadget("Smartphone", 59999));
        gadgetCatalog.addProduct(new Gadget("Headphones", 7999));

        // Displaying catalogs
        System.out.println("=== Books Catalog ===");
        bookCatalog.displayCatalog();

        System.out.println("\n=== Clothing Catalog ===");
        clothingCatalog.displayCatalog();

        System.out.println("\n=== Gadgets Catalog ===");
        gadgetCatalog.displayCatalog();

        // Applying discount dynamically
        System.out.println("\nApplying 10% discount to Java Programming Book...");
        ProductCatalog.applyDiscount(bookCatalog.getProducts().get(0), 10);

        System.out.println("\nApplying 15% discount to Jeans...");
        ProductCatalog.applyDiscount(clothingCatalog.getProducts().get(1), 15);

        System.out.println("\nApplying 20% discount to Smartphone...");
        ProductCatalog.applyDiscount(gadgetCatalog.getProducts().get(0), 20);
    }
}
