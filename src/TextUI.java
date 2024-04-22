import java.util.ArrayList;

public class TextUI {
    private ArrayList<String> genreList;


    //metode til at kalde en besked
    public void displayMsg(String msg) {
        System.out.println(msg);

    }


    public void askForGenre(){
        NetflixMenu menu = new NetflixMenu();
        System.out.println("Choose your genre below:");
        System.out.println(menu.getGenreList());



    }

}


