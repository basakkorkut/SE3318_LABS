package org.example;

import java.util.List;

/**
 * Processes customer orders.
 */
public class OrderProcessor {

    /**
     * Processes a given order ID with item list.
     *
     * @param orderId unique ID of the order
     * @param items   list of item names
     */
    public void processOrder(String orderId, List<String> items) {
        if (orderId == null || orderId.isEmpty()) {
            System.out.println(" Order ID is missing");
            return;
        }

        if (items == null || items.isEmpty()) {
            System.out.println(" Item list is empty or null");
            return;
        }

        if (orderId.length() > 5) {
            System.out.println("Processing complex order: " + orderId);
        } else {
            System.out.println(" Processing basic order: " + orderId);
        }

        for (String item : items) {
            if (item != null && item.contains("item")) {
                System.out.println(" Valid item: " + item);
            } else {
                System.out.println(" Skipping unknown or null item");
            }
        }
    }
}
