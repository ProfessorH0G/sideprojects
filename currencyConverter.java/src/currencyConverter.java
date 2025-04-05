import java.util.Scanner;


// The goal for today is to do a simple side project creating a currency converter.

public class currencyConverter {

    // Input (static) exchange rates to call upon EQUAL TO $1.00 American
    static double DOLLARS_TO_POUNDS = 0.79;
    static double DOLLARS_TO_RUPEES = 83.2;
    static double DOLLARS_TO_EUROS = 0.92;
    static double DOLLARS_TO_PESOS = 20.44;
    static double DOLLARS_TO_YEN = 145.53;
    static double DOLLARS_TO_FRANCS = 0.86;
    static double DOLLARS_TO_NEWZEALAND = 1.52;
    static double DOLLARS_TO_AUSTRALIA = 1.45;
    static double DOLLARS_TO_CANADA = 1.31;
    static double DOLLARS_TO_DINARS = 1.41;

    // We need to make a public static void main for the strings in which we will be scanning for.
    public static void main(String[] args) {

        // We need to name our scanner here
        Scanner scanner = new Scanner(System.in);

        // We will want to print out what we want to call our small side application
        System.out.println("   ProfessorH0G presents: THE CURRENCY CONVERTER    ");

        // Now, give the user a prompt to INPUT an amount in American Dollars ($)
        System.out.print("PLease, enter a dollar amount:  ");

        // Currency will be given an element type here of double for ease of use/data storage
        double amount = scanner.nextDouble();

        // Seems tedious, but we need to give the user a prompt for all different types of currency they can choose from
        System.out.println("\nSelect which currency you would like to convert to:");
        System.out.println("1. British Pounds");
        System.out.println("2. Euros");
        System.out.println("3. Japanese Yen");
        System.out.println("4. New Zealand Dollar");
        System.out.println("5. Canadian Dollar");
        System.out.println("6. Indian Rupees");
        System.out.println("7. Mexican Pesos");
        System.out.println("8. Swiss Francs");
        System.out.println("9. Australian Dollars");
        System.out.println("10. Kuwaiti Dinar");

        // We can now prompt the user to make a choice based upon the given currencies
        System.out.print(" Choose an option (1-10): ");

        // Now, the scanner has to go over the choice made from the users input
        int choice = scanner.nextInt();

     /* Now, all the different cases need to be accounted for to tell the program which conversion
      to run. We can start by setting a double to hold our amount of currency to zero, and a string of
      all the different names for the currencies.
      */
        double newAmount = 0;
        String nameOfCurrency = "";

        // We can use the switch/case BREAK breakdown to clearly define each potential choice inputed from the user
        switch (choice) {
            case 1:
                newAmount = amount * DOLLARS_TO_POUNDS;
                nameOfCurrency = "British Pounds";
                break;
            case 2:
                newAmount = amount * DOLLARS_TO_EUROS;
                nameOfCurrency = "Euros";
                break;
            case 3:
                newAmount = amount * DOLLARS_TO_YEN;
                nameOfCurrency = "Japanese Yen";
                break;
            case 4:
                newAmount = amount * DOLLARS_TO_NEWZEALAND;
                nameOfCurrency = "New Zealand Dollars";
                break;
            case 5:
                newAmount = amount * DOLLARS_TO_CANADA;
                nameOfCurrency = "Canadian Dollars";
                break;
            case 6:
                newAmount = amount * DOLLARS_TO_RUPEES;
                nameOfCurrency = "Indian Rupees";
                break;
            case 7:
                newAmount = amount * DOLLARS_TO_PESOS;
                nameOfCurrency = "Mexican Pesos";
                break;
            case 8:
                newAmount = amount * DOLLARS_TO_FRANCS;
                nameOfCurrency = "Swiss Francs";
                break;
            case 9:
                newAmount = amount * DOLLARS_TO_AUSTRALIA;
                nameOfCurrency = "Australian Dollars";
                break;
            case 10:
                newAmount = amount * DOLLARS_TO_DINARS;
                nameOfCurrency = "Kuwaiti Dollars";
                break;

            //  Here we add a default statement when the choice made by the user is outside the parameters
            default:
                System.out.println("This choice is not valid. Please choose a number that corresponds to a given currency.");
                System.exit(0);
        }

        // Using the format syntax, Print our given currency for the user.
        System.out.printf("\n%.2f Dollars = %.2f %s%n", amount, newAmount, nameOfCurrency);
        scanner.close();
    }
}