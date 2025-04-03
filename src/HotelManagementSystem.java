import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class HotelManagementSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static List<User> users = new ArrayList<>();
    private static User admin = new User("admin", "admin@123"); // Default admin account

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Welcome to Societe by Lyfehaus ===");
            System.out.println("1. Guest Register");
            System.out.println("2. Guest Login");
            System.out.println("3. Admin Login");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    registerGuest();
                    break;
                case 2:
                    loginGuest();
                    break;
                case 3:
                    loginAdmin();
                    break;
                case 4:
                    System.out.println("Thank you for visiting Societe by Lyfehaus. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void registerGuest() {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        
        users.add(new User(username, password));
        System.out.println("Registration successful!");
    }

    private static void loginGuest() {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Login successful!");
                customerMenu();
                return;
            }
        }
        System.out.println("Invalid username or password. Try again.");
    }
    
    private static void loginAdmin() {
        System.out.print("Enter admin username: ");
        String username = scanner.nextLine();
        System.out.print("Enter admin password: ");
        String password = scanner.nextLine();
        
        if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
            System.out.println("Admin login successful!");
            adminMenu();
        } else {
            System.out.println("Invalid! Please enter the correct username or password.");
        }
    }

    private static void customerMenu() {
        while (true) {
            System.out.println("\n=== Customer Menu ===");
            System.out.println("1. Book Room");
            System.out.println("2. Check Availability");
            System.out.println("3. View Booking History");
            System.out.println("4. Make Payment");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.println("Booking Room...");
                    break;
                case 2:
                    System.out.println("Checking Availability...");
                    break;
                case 3:
                    System.out.println("Viewing Booking History...");
                    break;
                case 4:
                    System.out.println("Making Payment...");
                    break;
                case 5:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void adminMenu() {
        while (true) {
            System.out.println("\n=== Admin Menu ===");
            System.out.println("1. Update Room Price");
            System.out.println("2. Add Room Type");
            System.out.println("3. Delete Room");
            System.out.println("4. View Check-in/Check-out");
            System.out.println("5. Manage Housekeeping");
            System.out.println("6. Generate Report");
            System.out.println("7. Logout");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.println("Updating Room Price...");
                    break;
                case 2:
                    System.out.println("Adding Room Type...");
                    break;
                case 3:
                    System.out.println("Deleting Room...");
                    break;
                case 4:
                    System.out.println("Viewing Check-in/Check-out...");
                    break;
                case 5:
                    System.out.println("Managing Housekeeping...");
                    break;
                case 6:
                    System.out.println("Generating Report...");
                    break;
                case 7:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}