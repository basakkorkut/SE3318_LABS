package org.example;

/**
 * Handles payment processing logic.
 */
public class PaymentService {

    /**
     * Processes a payment transaction.
     *
     * @param cardNumber credit card number
     * @param amount     amount to be charged
     * @param currency   currency of the transaction
     */
    public void processPayment(String cardNumber, double amount, String currency) {
        if (cardNumber == null || cardNumber.isEmpty()) {
            System.out.println(" Card number is missing");
            return;
        }

        if (amount <= 0) {
            System.out.println(" Amount must be positive");
            return;
        }

        if (currency == null || currency.isEmpty()) {
            System.out.println(" Currency is missing");
            return;
        }

        if (cardNumber.length() < 16) {
            System.out.println(" Invalid card number length");
        } else if (cardNumber.startsWith("4")) {
            if ("USD".equals(currency)) {
                System.out.println("✅ Processing Visa USD payment");
            } else {
                System.out.println("✅ Visa payment in other currency");
            }
        } else {
            System.out.println("✅ Non-Visa card detected");
        }
    }
}
