import java.util.ArrayList;
import java.util.Scanner;

public class StartMenu {


    public void login(){

        ArrayList<String> Menu = new ArrayList<>();
        Menu.add("Login");
        Menu.add("Register");
        Menu.add("Exit");

        if (Menu.getFirst().equals("Login")){
            Scanner sc = new Scanner(System.in);
            displayMsg("Type Email & Password");
         String user = sc.nextLine();
         String pass = sc.nextLine();

         //todo den skal gemme, oplysningerne ?

        }


    }



    public String displayMsg(String msg){
        return msg;
    }
}
