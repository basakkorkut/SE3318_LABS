package org.example;

/**
 * Validates user information.
 */
public class UserValidator {

    /**
     * Validates name, age, and email of a user.
     *
     * @param name  the user's name
     * @param age   the user's age
     * @param email the user's email
     * @return true if all fields are valid, false otherwise
     */
    public boolean validateUser(String name, int age, String email) {
        boolean isValid = true;

        if (name == null || name.trim().isEmpty()) {
            System.out.println(" Name is missing");
            isValid = false;
        } else if (name.length() < 2) {
            System.out.println(" Name too short");
            isValid = false;
        }

        if (age < 0 || age > 150) {
            System.out.println(" Age is out of valid range (0–150)");
            isValid = false;
        }

        if (email == null || !email.contains("@")) {
            System.out.println(" Email is invalid");
            isValid = false;
        }

        return isValid;
    }
}
