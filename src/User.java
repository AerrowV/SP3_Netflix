import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class User {
    private String email;
    private String password;
    private String selectedMovie;
    private String selectedSeries;
    private ArrayList<String> watchedMovies;
    private ArrayList<String> watchedSeries;
    private LinkedList<String> saveList;
    private String dataFile = "Files/UserAccountData";

    public User() {
        this.email = email;
        this.password = password;
        this.selectedMovie = selectedMovie;
        this.selectedSeries = selectedSeries;
        this.saveList = saveList;
        this.watchedMovies = new ArrayList<>();
        this.watchedSeries = new ArrayList<>();
    }

    public void createAccount(String email, String password) {
        try (FileWriter writer = new FileWriter(dataFile, true)) {
            writer.write(email + ";" + password + "\n");
        } catch (IOException e) {
            System.out.println("Failed to register user: " + e.getMessage());
        }
    }

    public boolean getAccountInfo(String email, String password) {
        try (Scanner scanner = new Scanner(new FileReader(dataFile))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                if (parts[0].equals(email) && parts[1].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Failed to check credentials: " + e.getMessage());
        }
        return false;
    }

    public boolean isUserExists(String email) {
        try (Scanner scanner = new Scanner(new FileReader(dataFile))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                if (parts[0].equals(email)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("User doesn't exist: " + e.getMessage());
        }
        return false;
    }
}
