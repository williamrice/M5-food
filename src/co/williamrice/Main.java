package co.williamrice;

import java.time.DayOfWeek;
import java.util.Scanner;

class Main{
    public static void main(String[] args)
    {
        final String NAME_OF_PARK = "Keeneland";

        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to " + NAME_OF_PARK);
        System.out.println("\n\tWe are delighted you are interested in the food trucks coming to our park and our special events.");
        System.out.println("\nPlease enter a day of the week (1 for Sunday, 2 for Monday, … ,7 for Saturday): ");
        short dayNumber = scanner.nextShort();

        if (dayNumber >= 1 && dayNumber <= 7){
            System.out.println("\nFood trucks and events for the remainder of the week: ");
            
            switch (dayNumber) {
                case 1:
                    System.out.println("\n\tSunday Night:");
                    System.out.println("\t\tFood Paradise");
                    System.out.println("\t\tThe Cake Shack");
                    dayNumber++;
                case 2:
                    System.out.println("\n\tMonday Night:");
                    System.out.println("\t\tThe Extreme Burger");
                    System.out.println("\t\tThe Grill Queen");
                    dayNumber++;
                case 3:
                    System.out.println("\n\tTuesday Night:");
                    System.out.println("\t\tEat Fest");
                    System.out.println("\t\tFrank's Hot Dogs");
                    dayNumber++;
                case 4:
                    System.out.println("\n\tWednesday Night:");
                    System.out.println("\t\tThe Urban Burger");
                    System.out.println("\t\tMexican Mobile");
                    dayNumber++;
                case 5:
                    System.out.println("\n\tThurday Night:");
                    System.out.println("\t\tSweet Eats");
                    System.out.println("\t\tThe Mobile Bakery");
                    dayNumber++;
                case 6:
                    System.out.println("\n\tFriday Night:");
                    System.out.println("\t\tMr. Burger");
                    System.out.println("\t\tThe Rolling Pizzeria");
                    dayNumber++;
                case 7:
                    System.out.println("\n\tSaturday Night:");
                    System.out.println("\t\tHarry's Burger Bus");
                    System.out.println("\t\tMunch Mobile");
            }
        }
        else{
            System.out.println("\nYou have entered an invalid entry for a day. You should use 1-7.\n\n"); 
        }       
    }
}