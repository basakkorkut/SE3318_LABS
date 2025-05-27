package org.example;

/**
 * Main application class to demonstrate loop usage and Checkstyle compliance.
 */
public class App {

    /**
     * Entry point of the application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        LoopControl loopControl = new LoopControl();
        ExampleUsage exampleUsage = new ExampleUsage();

        System.out.println("Demonstrating correct variable usage:");
        loopControl.correctVariableUsage();

        System.out.println("\nDemonstrating incorrect variable usage:");
        loopControl.incorrectVariableUsage(); // This method will intentionally cause a Checkstyle violation if not excluded.

        System.out.println("\nDemonstrating empty block handling:");
        loopControl.avoidEmptyBlock();

        System.out.println("\nDemonstrating correctly modified control variable:");
        loopControl.correctlyModifiedControlVariable();

        System.out.println("\nDemonstrating incorrectly modified control variable:");
        loopControl.modifiedControlVariable(); // Intentional Checkstyle violation

        System.out.println("\nDisplaying even numbers:");
        exampleUsage.displayEvenNumbers();

        System.out.println("\nSumming an array:");
        int sum = exampleUsage.sumArray();
        System.out.println("Total Sum: " + sum);

        System.out.println("\nProcessing a matrix:");
        exampleUsage.processMatrix();
    }
}
