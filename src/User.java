import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class User {
    private String selectedMovie;
    private String selectedSeries;
    private ArrayList<String> watchedMovies;
    private ArrayList<String> watchedSeries;
    private LinkedList<String> saveList;
    private String userDataFile = "Files/UserAccountData";

    public User() {
        this.selectedMovie = selectedMovie;
        this.selectedSeries = selectedSeries;
        this.saveList = saveList;
        this.watchedMovies = new ArrayList<>();
        this.watchedSeries = new ArrayList<>();
    }



    public void writerWatchLaterAndWatchList(String watchLater) {
        try (FileWriter writer = new FileWriter(userDataFile, true)) {


            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            String [] index = line.split(";");
            writer.write( watchLater+ ";" + "\n");
            if (index[0].equals(" ") && index[1].equals(" ")) {
                index[3] = watchLater;
            }

            System.out.println("Successfully added to watch later!");
        } catch (IOException e) {
            System.out.println("Failed to add to watch later");
        }
    }

    public void writerSaveList(String saveList) {
        try (FileWriter writer = new FileWriter(userDataFile, true)) {
            writer.write(saveList + ";" + "\n");
        } catch (IOException e) {
            System.out.println("Failed to save list");
        }
    }

}