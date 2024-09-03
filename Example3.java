import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        System.out.println("Enter your class:");
        String className = scanner.nextLine();
        
        System.out.println("Enter your school name:");
        String schoolName = scanner.nextLine();
        
        System.out.println("\nStudent Biodata:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Class: " + className);
        System.out.println("School: " + schoolName);
    }
}