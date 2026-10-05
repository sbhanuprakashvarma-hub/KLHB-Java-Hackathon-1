/*          Household Water-Usage & Billing Monitor

1c) Methods:

Write a Java program to calculate the total water consumption of a household using a method.

Create the following method:

calculateTotal(int morningUsage, int eveningUsage)
The method should return the total water consumption. Read the morning and evening water usage from the user, call the method, and display the total consumption.

                                                                                                                                                                  */


import java.util.Scanner;

public class TotalWaterConsumption {
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter morning water usage in litres: ");
        int morningUsage = input.nextInt();

        System.out.print("Enter evening water usage in litres: ");
        int eveningUsage = input.nextInt();

        int total = calculateTotal(morningUsage, eveningUsage);
        System.out.println("Total water consumption: " + total + " litres");

        input.close();
    }
}