import java.io.*;
import java.util.Scanner;

public class StartMenu {
    TextUI UI = new TextUI();
    User user = new User();
    NetflixMenu menu = new NetflixMenu();
    Genre genre = new Genre();
    Scanner scan = new Scanner(System.in);

    public void loginAndSignUp() {


        while (true) {
           String userInput = UI.greetingMessage();

            if ("1".equals(userInput)) {
              String email =  UI.messageGetUserEmail();
                String password = UI.messageGetUserPassword();

                if (user.getAccountInfo(email, password)) {
                    UI.displayMsg("Login successful!");
                    userInterface(); //- This is the interFace for the next menu
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

    public void userInterface() {
        while (true) {
            String userInput = UI.greetingFromMenu();

            if ("1".equals(userInput)) {
//Search media WORKS
                UI.displayMsg("Search media now");
                menu.searchMedia(UI.userInput());

//todo Genre doesn't WORK
            }else if ("2".equals(userInput)) {
                UI.displayMsg("Welcome to the list of genres.");
                genre.searchGenre();

            }else if ("3".equals(userInput)) {
                break;
            } else {
                UI.displayMsg("Invalid option. Please enter 1, 2, or 3 etc. ");

            }

        }
        scan.close();
    }



}
