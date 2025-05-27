package org.example;

/**
 * This class demonstrates both correct and incorrect loop usages
 * in compliance (and non-compliance) with Checkstyle rules.
 */
public class LoopControl {

    /**
     * Incorrect usage: Violates VariableDeclarationUsageDistance.
     * Declares 'index' long before its actual use.
     */
    public void incorrectVariableUsage() {
        int index; // declared far from usage → violation
        System.out.println("Preparing to loop...");
        index = 0;
        for (; index < 5; index++) {
            System.out.println(index);
        }
    }

    /**
     *  Correct usage: Avoids EmptyBlock by handling all branches.
     */
    public void avoidEmptyBlock() {
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("Midpoint at: " + j);
            } else {
                System.out.println("Not midpoint: " + j); // avoids empty block
            }
        }
    }

    /**
     *  Incorrect usage: Violates ModifiedControlVariable rule.
     * Control variable 'm' is modified inside the loop.
     */
    public void modifiedControlVariable() {
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                System.out.println("Adjusting loop index from " + m);
                m += 3; // violation: modifies loop control variable
                System.out.println("to " + m);
            }
        }
    }

    /**
     *  Correct usage: sum of squares of first 10 positive integers.
     * Complies with VariableDeclarationUsageDistance.
     */
    public void correctVariableUsage() {
        int sum = 0; // declared and used in proper scope
        for (int i = 1; i <= 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares = " + sum);
    }

    /**
     *  Correct usage: modifies control variable outside the loop.
     */
    public void correctlyModifiedControlVariable() {
        for (int k = 0; k < 5; k++) {
            System.out.println("Index: " + k);
        }
        // modification after loop
        int finalValue = 5;
        System.out.println("Loop ended, control variable now: " + finalValue);
    }
}
