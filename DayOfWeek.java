import java.util.Scanner;  // Import the Scanner class for user input

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input

        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = scanner.nextInt();  // Read the input number

        // Switch-case to determine the day of the week
        switch (dayNumber) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                break;
        }

        scanner.close();  // Close the scanner to prevent resource leaks
    }
}