import java.util.ArrayList;
import java.util.Scanner;

public class TextUI{
    Scanner sc = new Scanner(System.in);
    private ArrayList<String> genreList;
    Genre g = new Genre();
    Movie movie = new Movie("",null,"",0, 0);
    NetflixMenu menu= new NetflixMenu();

    public void displayMsg(String msg) {
        System.out.println(msg);
    }

    public String greetingMessage() {
        System.out.println("***********************");
        System.out.println("Welcome to GFlix!");
        System.out.println("***********************");
        System.out.println("1) Login");
        System.out.println("2) Register");
        System.out.println("3) Exit");
        System.out.print("Choose an option: ");
        String userInput = sc.nextLine();
        return userInput;
    }

    public String messageGetUserEmail() {
        System.out.println("Type Email:");
        String email = sc.nextLine();
        return email;
    }

    public String messageGetUserPassword() {
        System.out.println("Type Password:");
        String password = sc.nextLine();
        return password;
    }

    public String messageGetRegisterEmail() {
        System.out.println("Register new user");
        System.out.println("Type email:");
        String newEmail = sc.nextLine();
        return newEmail;
    }

    public String messageGetRegisterPassword() {
        System.out.println("Type password:");
        String newPassword = sc.nextLine();
        return newPassword;
    }


    public void askForGenre() {
        System.out.println("Choose your category below:");
        menu.displayGenreList();

    }


    public String greetingFromMenu() {
        System.out.println("***********************");
        System.out.println("|      GFlix Menu     |");
        System.out.println("***********************");
        System.out.println("1) Search media");
        System.out.println("2) Search category");
        System.out.println("3) Movies");
        System.out.println("4) Series");
        System.out.println("5) Exit");
        System.out.print("Choose an option: ");
        String userInput = sc.nextLine();
        return userInput;

    }

    public String userInput() {
        return sc.nextLine();
    }







}










