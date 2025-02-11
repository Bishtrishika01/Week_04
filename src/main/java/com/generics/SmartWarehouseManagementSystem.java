/*1. Smart Warehouse Management System
Concepts: Generic Classes, Bounded Type Parameters, Wildcards
Problem Statement:
You are developing a Smart Warehouse System that manages different types of items like Electronics, Groceries, and Furniture. The system should be able to store and retrieve items dynamically while maintaining type safety.
Hints:
Create an abstract class WarehouseItem that all items extend (Electronics, Groceries, Furniture).
Implement a generic class Storage<T extends WarehouseItem> to store items safely.
Implement a wildcard method to display all items in storage regardless of their type (List<? extends WarehouseItem>).
*/
package com.generics;

import java.util.ArrayList;
import java.util.List;

// Abstract class representing a generic warehouse item
abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Each item type must provide its own implementation for displaying details
    public abstract void displayInfo();
}

// Electronics class extending WarehouseItem
class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics: " + getName());
    }
}

// Groceries class extending WarehouseItem
class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Groceries: " + getName());
    }
}

// Furniture class extending WarehouseItem
class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Furniture: " + getName());
    }
}

// Generic Storage class with bounded type to store only WarehouseItem types
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    // Method to add an item to storage
    public void addItem(T item) {
        items.add(item);
    }

    // Method to retrieve all stored items
    public List<T> getItems() {
        return items;
    }
}

// Utility class with a wildcard method to display any type of WarehouseItem
class WarehouseUtility {
    public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayInfo(); // Calls the overridden method of the respective class
        }
    }
}

public class SmartWarehouseManagementSystem {
    public static void main(String[] args) {
        // Creating storage for different item categories
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apples"));
        groceriesStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        // Displaying stored items using the wildcard method
        System.out.println("=== Displaying Electronics ===");
        WarehouseUtility.displayAllItems(electronicsStorage.getItems());

        System.out.println("\n=== Displaying Groceries ===");
        WarehouseUtility.displayAllItems(groceriesStorage.getItems());

        System.out.println("\n=== Displaying Furniture ===");
        WarehouseUtility.displayAllItems(furnitureStorage.getItems());
    }
}
