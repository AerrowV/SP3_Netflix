import java.util.ArrayList;
import java.util.LinkedList;

public class Users {

    String email;
    String password;
    String selectedMovie;
    String selectedSeries;
    ArrayList<String> watchedMovies;
    ArrayList<String> watchedSeries;
    LinkedList<String> saveList;

    public Users(String email, String password, String selectedMovie, String selectedSeries, LinkedList<String> saveList) {
        this.email = email;
        this.password = password;
        this.selectedMovie = selectedMovie;
        this.selectedSeries = selectedSeries;
        this.saveList = saveList;
        watchedMovies = new ArrayList<>();
        watchedSeries = new ArrayList<>();

    }


    public void createAccount(String email, String password) {
    }

    public void getAccountInfo() {
    }

}
