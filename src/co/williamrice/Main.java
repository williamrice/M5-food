package co.williamrice;


import java.util.Scanner;

class Main{
    public static void main(String[] args)
    {
        final String NAME_OF_PARK = "Keeneland";

        String sundayTruck1 = "Food Paradise";
        String sundayTruck2 = "The Cake Shack";

        String mondayTruck1 = "The Extreme Burger";
        String mondayTruck2 = "The Grill Queen";

        String tuesdayTruck1 = "Eat Fest";
        String tuesdayTruck2 = "Frank's Hot Dogs";
        
        String wednesdayTruck1 = "The Urban Burger";
        String wednesdayTruck2 = "Mexican Mobile";

        String thursdayTruck1 = "Sweet Eats";
        String thursdayTruck2 = "The Mobile Bakery";

        String fridayTruck1 = "Mr. Burger";
        String fridayTruck2 = "The Rolling Pizzeria";

        String saturdayTruck1 = "Harry's Burger Bus";
        String saturdayTruck2 = "Munch Mobile";

        String triviaTheme = "U.S Presidents";
        String karaokeTheme = "80's Rock N Roll";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to " + NAME_OF_PARK);
        System.out.println("\n\tWe are delighted you are interested in the food trucks coming to our park and our special events.");
        System.out.println("\nPlease enter a day of the week (1 for Sunday, 2 for Monday, … ,7 for Saturday): ");
        Integer dayNumber = scanner.nextInt();

        if (dayNumber >= 1 && dayNumber <= 7){
            System.out.println("\nFood trucks and events for the remainder of the week: ");
            
            switch (dayNumber) {
                case 1:
                    System.out.println("\n\tSunday Night:");
                    System.out.println("\t\t" + sundayTruck1);
                    System.out.println("\t\t" + sundayTruck2);
                    dayNumber++;
                case 2:
                    System.out.println("\n\tMonday Night:");
                    System.out.println("\t\t" + mondayTruck1);
                    System.out.println("\t\t" + mondayTruck2);
                    dayNumber++;
                case 3:
                    System.out.println("\n\tTuesday Night:");
                    System.out.println("\t\t" + tuesdayTruck1);
                    System.out.println("\t\t" + tuesdayTruck2);
                    System.out.println("\t\tSPECIAL EVENT: Trivia Night - " + triviaTheme);
                    dayNumber++;
                case 4:
                    System.out.println("\n\tWednesday Night:");
                    System.out.println("\t\t" + wednesdayTruck1);
                    System.out.println("\t\t" + wednesdayTruck2);
                    dayNumber++;
                case 5:
                    System.out.println("\n\tThursday Night:");
                    System.out.println("\t\t" + thursdayTruck1);
                    System.out.println("\t\t" + thursdayTruck2);
                    dayNumber++;
                case 6:
                    System.out.println("\n\tFriday Night:");
                    System.out.println("\t\t" + fridayTruck1);
                    System.out.println("\t\t" + fridayTruck2);
                    System.out.println("\t\tSPECIAL EVENT: Karaoke Night - " + karaokeTheme);
                    dayNumber++;
                case 7:
                    System.out.println("\n\tSaturday Night:");
                    System.out.println("\t\t" + saturdayTruck1);
                    System.out.println("\t\t" + saturdayTruck2);
            }
        }
        else{
            System.out.println("\nYou have entered an invalid entry for a day. You should use 1-7.\n\n"); 
        }       
    }
}