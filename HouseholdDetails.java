/*          Household Water-Usage & Billing Monitor

1a) Data Types:

Write a Java program to store and display the following details of a household:

Number of family members – integer
Water consumed in litres – decimal value
House number – integer
Water usage status – character
Use appropriate Java data types for each value and display all the details.               */


import java.util.Scanner;

public class HouseholdDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number of family members: ");
        int familyMembers = input.nextInt();

        System.out.print("Enter water consumed in Litres: ");
        double waterConsumed = input.nextDouble();

        System.out.print("Enter the House No. : ");
        int houseNumber = input.nextInt();

        System.out.print("Enter water usage status (character): ");
        char usageStatus = input.next().charAt(0);
        System.out.println("");

        System.out.println("============================================================");
        System.out.println("******************** HOUSEHOLD DETAILS *********************");
        System.out.println("============================================================");
        System.out.println("                                                            ");
        System.out.println("Family members: " + familyMembers);
        System.out.println("Water consumed: " + waterConsumed + " litres");
        System.out.println("House number: " + houseNumber);
        System.out.println("Water usage status: " + usageStatus);
        System.out.println(" ");

         System.out.println("-----------------------> THANK YOU <---------------------------");

        input.close();


    }
}