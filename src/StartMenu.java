import java.io.*;
import java.util.Scanner;

public class StartMenu {
    TextUI UI = new TextUI();
    FileIO IO = new FileIO();
    User user = new User();
    NetflixMenu menu = new NetflixMenu();
    Genre genre = new Genre();
    Scanner scan = new Scanner(System.in);
    private boolean isLoggedIn = false;

    public void loginAndSignUp() {
        boolean run = true;
        while (run) {
            String userInput = UI.greetingMessage();

            if ("1".equals(userInput)) {
                String email = UI.messageGetUserEmail();
                String password = UI.messageGetUserPassword();

                if (IO.getAccountInfo(email, password)) {
                    UI.displayMsg("Login successful!");
                    isLoggedIn = true;
                    run = false;
                } else {
                    UI.displayMsg("Invalid login. Please try again.");
                }
            } else if ("2".equals(userInput)) {
                String newEmail = UI.messageGetRegisterEmail();
                String newPassword = UI.messageGetRegisterPassword();

                if (!IO.DoesUserExist(newEmail)) {
                    IO.createAccount(newEmail, newPassword);
                    UI.displayMsg("User registered successfully!");
                } else {
                    UI.displayMsg("Email already registered!");
                }
            } else if ("3".equals(userInput)) {
                run = false;
            } else {
                UI.displayMsg("Invalid option. Please enter 1, 2, or 3.");
            }
        }
    }

    public void userInterface() {
        while (isLoggedIn) {
            String userInput = UI.greetingFromMenu();

            if ("1".equals(userInput)) {
                UI.displayMsg("Search for title of movie/series");
                menu.searchMedia(UI.userInput());
            } else if ("2".equals(userInput)) {
                UI.displayMsg("Please choose a genre");
                genre.searchGenre();
            } else if ("3".equals(userInput)) {
                menu.displayMovieList();
            } else if ("4".equals(userInput)) {
                menu.displaySeriesList();
            } else if ("5".equals(userInput)) {
                UI.displayMsg("Saved list");
                user.displaySavedMovies();
            } else if ("6".equals(userInput)) {
                UI.displayMsg("Exiting the program...");
                isLoggedIn = false;
            } else {
                UI.displayMsg("Invalid option. Please enter 1, 2, 3, etc.");
            }
        }
    }

    public void run() {
        while (true) {
            loginAndSignUp();
            if (isLoggedIn) {
                userInterface();
            } else {
                break;
            }
        }
    }
}
