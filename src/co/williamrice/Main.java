/*******************************************************************************
 *  Name: William Rice
 *  Created Date: 9/16/2021
 *  Instructor: Krishna Nandanoor
 *  Class: CIT 149
 *  Purpose: The purpose of this program is to display information about 
 *  food trucks and events at a local Lexington park. The user will enter a number
 *  that represents which day they would like the display to start at then each sequential
 *  day that follows up to Saturday would be displayed. For example, if the user was to 
 *  select option 4 for Wednesday, the program would display the food trucks and events from 
 *  Wednesday through Saturday. 
 *
 *******************************************************************************
 */

/*******************************************************************************
 * Package section
 *******************************************************************************
 */
package co.williamrice;

/*******************************************************************************
 * Import section
 *******************************************************************************
 */
import java.util.Scanner;

/*******************************************************************************
 * The following is a Main class that will contain the main method
 *******************************************************************************
 */
class Main{
    /*******************************************************************************
     * Main method section
     * This Main method is the entry point for this Java application
     *******************************************************************************
     */
    public static void main(String[] args)
    {
        /*******************************************************************************
         * Declaration and assignment of constant values used in the program
         *******************************************************************************
         */
        final String NAME_OF_PARK = "Keeneland";

        /*******************************************************************************
         * Declaration and assignment of variables used in the program. Although this program
         * is static in nature, I felt like it was best to declare the names of the food trucks
         * and the themes in variables to leave the code open to future upgrades in case the names
         * of the trucks or themes needed to be changed, our logic that displays the information 
         * can remain untouched. 
         *******************************************************************************
         */
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

        /*******************************************************************************
         * Instantion of objects used in program
         *******************************************************************************
         */
        Scanner scanner = new Scanner(System.in);

         /*******************************************************************************
         * Data prompts and user input section
         * 
         * Special Notes: The greeting and instructions for the program. This section 
         * also accepts user input that is stored in an integer value to be later used
         * to determine what output is appropriate.  
         *******************************************************************************
         */
        System.out.println("Welcome to " + NAME_OF_PARK);
        System.out.println("\n\tWe are delighted you are interested in the food trucks coming to our park and our special events.");
        System.out.print("\nPlease enter a day of the week (1 for Sunday, 2 for Monday, … ,7 for Saturday): ");
        Integer dayNumber = scanner.nextInt();

         /*******************************************************************************
         * Main Program Logic
         * 
         * Special Notes: We run input validation on the user input to ensure that they 
         * followed the instructions and entered a value between 1 and 7. If they entered a 
         * value outside of these bounds, the switch case is skipped and a message is displayed
         * informing the user of their mistake. In the switch case, since the instructions require
         * all sequential days to be printed from the user selection, we increment the dayNumber value 
         * after each days output without a break statement so the switch statement will fall through to the next 
         * case. Since we incremented the dayNumber variable, the following case will now display and then 
         * repeat the process until it gets to the last day(Saturday), then the program terminates.   
         *******************************************************************************
         */
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