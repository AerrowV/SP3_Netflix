import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
    Scanner sc = new Scanner(System.in);
    private ArrayList<String> genreList;


    //metode til at kalde en besked
    public void displayMsg(String msg) {
        System.out.println(msg);


    }

    public String greetingMessage() {
        System.out.println("***********************");
        System.out.println("Velkommen Til Netflix!");
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
        System.out.println("Type Email:");
        String newEmail = sc.nextLine();
        return newEmail;
    }

    public String messageGetRegisterPassword() {
        System.out.println("Type Password:");
        String newPassword = sc.nextLine();
        return newPassword;
    }


    public void askForGenre() {
        NetflixMenu menu = new NetflixMenu();
        System.out.println("Choose your genre below:");
        System.out.println(menu.getGenreList());


    }


        public String greetingFromMenu () {
            System.out.println("***********************");
            System.out.println("Velkommen Til Netflix Menu!");
            System.out.println("***********************");
            System.out.println("1) Search Media");
            System.out.println("2) Search Genre");
            System.out.println("3) Exit");
            System.out.print("Choose an option: ");
            String userInput = sc.nextLine();
            return userInput;

        }

        public String userInput (){
        return sc.nextLine();
        }



}










