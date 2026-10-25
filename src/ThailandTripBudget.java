import java.util.Scanner;

public class ThailandTripBudget {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Thailand Trip Budget Calculator!");

        System.out.print("Enter your Thailand vacation budget: $");
        double budget = input.nextDouble();
        input.nextLine();

        double totalSpent = 0;
        String anotherCategory = "yes";

        // WHILE LOOP
        while (anotherCategory.equalsIgnoreCase("yes")) {

            System.out.print("Enter expense category (Flights, Hotel, Food, Activities): ");
            String category = input.nextLine();

            String anotherExpense = "yes";

            // NESTED WHILE LOOP
            while (anotherExpense.equalsIgnoreCase("yes")) {

                System.out.print("Enter expense name: ");
                String expense = input.nextLine();

                System.out.print("Enter expense cost: $");
                double cost = input.nextDouble();
                input.nextLine();

                totalSpent += cost;

                // IF-ELSE STATEMENT
                if (totalSpent > budget) {
                    System.out.println("Warning! You are over your Thailand trip budget!");
                } else {
                    System.out.println("You are still within your vacation budget!");
                }

                System.out.print("Add another expense in " + category + "? (yes/no): ");
                anotherExpense = input.nextLine();
            }

            System.out.print("Add another expense category? (yes/no): ");
            anotherCategory = input.nextLine();
        }

        // FINAL BUDGET SUMMARY
        System.out.println("\n===== THAILAND TRIP BUDGET SUMMARY =====");

        System.out.println("Vacation Budget: $" + budget);
        System.out.println("Total Expenses: $" + totalSpent);

        if (totalSpent <= budget) {
            System.out.println("Money Remaining: $" + (budget - totalSpent));
            System.out.println("You're ready for Thailand!");
        } else {
            System.out.println("Over Budget By: $" + (totalSpent - budget));
            System.out.println("You may need to adjust your vacation expenses!");
        }

        System.out.println("Enjoy your Thailand vacation!");

        input.close();
    }
}