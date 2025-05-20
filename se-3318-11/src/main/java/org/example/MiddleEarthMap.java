package org.example;
/**
 * Represents the map of Middle Earth.
 */

public final class MiddleEarthMap {
    /**
     * Navigates to the given location, optionally using a secret passage.
     *
     * @param location         name of the destination
     * @param isSecretPassage  true if a secret path should be used
     */
    public void navigate(String location, boolean isSecretPassage) {
        switch (location) {
            case "Mordor":
                System.out.println("Navigating to Mordor");
                if (isSecretPassage) {
                    System.out.println("Taking a secret passage");
                }
                break;
            case "Shire":
                System.out.println("Navigating to the Shire");
                break;
                // FallThrough violation - Missing break
            case "Gondor":
                System.out.println("Navigating to Gondor");
                break;
            default:
                System.out.println("Unknown location");
                break;
        }
        switch (location) {
            case "Lothlórien":
                System.out.println("Navigating to Lothlórien");
        }
        if (isSecretPassage) {

        }

        
        String result = isSecretPassage ? "Secret" : "Normal";
        System.out.println(result);
    }
}
