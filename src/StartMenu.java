import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class StartMenu {


    public void login() {


        ArrayList<String> menu = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        menu.add("1) " + "Login");
        menu.add("2) " + "Register");
        menu.add("3) " + "Exit");
        System.out.println(menu.get(0));
        System.out.println(menu.get(1));
        System.out.println(menu.get(2));
        String userInput = scan.nextLine();


        if (menu.getFirst().equals("1) " + "Login")) {
            Scanner sc = new Scanner(System.in);
            System.out.println(("Type Email:"));
            String user = sc.nextLine();
            System.out.println(("Type Password:"));
            String pass = sc.nextLine();


        }

public void FileWriter(){






        }



        public String displayMsg (String msg){
            return msg;
        }
    }
}