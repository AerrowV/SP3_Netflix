import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class User {
    private String selectedMovie;
    private String selectedSeries;
    private ArrayList<String> watchedMovies;
    private ArrayList<String> watchedSeries;
    private LinkedList<String> saveList;


    public User() {
        this.selectedMovie = selectedMovie;
        this.selectedSeries = selectedSeries;
        this.saveList = saveList;
        this.watchedMovies = new ArrayList<>();
        this.watchedSeries = new ArrayList<>();
    }

    public boolean DoesUserExist(String email) {
        try (Scanner scanner = new Scanner(new FileReader(userDataFile))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] index = line.split(";");
                if (index[0].equals(email)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("User doesn't exist");
        }
        return false;
    }
}

}