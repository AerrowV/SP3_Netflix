import java.io.*;
import java.util.Scanner;

public class StartMenu {

    User user = new User();

    public void login() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("1) Login");
            System.out.println("2) Register");
            System.out.println("3) Exit");
            System.out.print("Choose an option: ");
            String userInput = scan.nextLine();

            if ("1".equals(userInput)) {
                System.out.println("Type Email:");
                String email = scan.nextLine();
                System.out.println("Type Password:");
                String password = scan.nextLine();

                if (user.getAccountInfo(email, password)) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Invalid login. Please try again.");
                }
            } else if ("2".equals(userInput)) {
                System.out.println("Register new user");
                System.out.println("Type Email:");
                String newEmail = scan.nextLine();
                System.out.println("Type Password:");
                String newPassword = scan.nextLine();

                if (!user.isUserExists(newEmail)) {
                    user.createAccount(newEmail, newPassword);
                    System.out.println("User registered successfully!");
                } else {
                    System.out.println("Email already registered!");
                }
            } else if ("3".equals(userInput)) {
                break;
            } else {
                System.out.println("Invalid option. Please enter 1, 2, or 3.");
            }
        }

        scan.close();
    }
}
