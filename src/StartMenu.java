import java.io.*;
import java.util.Scanner;

public class StartMenu {
    TextUI UI = new TextUI();
    User user = new User();

    public void loginAndSignUp() {
        Scanner scan = new Scanner(System.in);

        while (true) {
           String userInput = UI.greetingMessage();

            if ("1".equals(userInput)) {
              String email =  UI.messageGetUserEmail();
                String password = UI.messageGetUserPassword();

                if (user.getAccountInfo(email, password)) {
                    UI.displayMsg("Login successful!");
                } else {
                    UI.displayMsg("Invalid login. Please try again.");
                }
            } else if ("2".equals(userInput)) {
               String newEmail = UI.messageGetRegisterEmail();
               String newPassword = UI.messageGetRegisterPassword();

                if (!user.DoesUserExist(newEmail)) {
                    user.createAccount(newEmail, newPassword);
                    UI.displayMsg("User registered successfully!");
                } else {
                    UI.displayMsg("Email already registered!");
                }

            } else if ("3".equals(userInput)) {
                break;
            } else {
                UI.displayMsg("Invalid option. Please enter 1, 2, or 3.");
            }
        }

        scan.close();
    }
}
