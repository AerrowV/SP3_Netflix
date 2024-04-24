import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileIO {

    int counter = 1;

    private String userDataFile = "Files/UserAccountData";

    public void loadMoviesFromList(String path, ArrayList<Movie> movieList) {
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(";");
                if (values.length >= 4) {
                    String name = values[0].trim();
                    String releaseDate = values[1].trim();
                    String genre = values[2].trim();
                    float rating = Float.parseFloat(values[3].trim());
                    movieList.add(new Movie(name, releaseDate, genre, rating, counter++));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (NumberFormatException e) {
            System.out.println("Error parsing value");
        }
    }

    public void loadSeriesFromList(String path, ArrayList<Series> seriesList) {
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(";");
                if (values.length >= 5) {
                    String name = values[0].trim();
                    String releaseDate = values[1].trim();
                    String genre = values[2].trim();
                    float rating = Float.parseFloat(values[3].trim());
                    ArrayList<String> seasonEpisode = new ArrayList<>(List.of(values[4].split(",")));
                    ArrayList<Season> seasons = new ArrayList<>();
                    for (String seasonInfo : seasonEpisode) {
                        seasons.add(new Season(seasonInfo.trim()));
                    }
                    seriesList.add(new Series(name, releaseDate, genre, rating, seasons, counter++));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        } catch (NumberFormatException e) {
            System.out.println("Error parsing float");
        }
    }

    public void createAccount(String email, String password) {
        try (FileWriter writer = new FileWriter(userDataFile, true)) {
            writer.write(email + ";" + password + ";" + "temp" + ";" + "temp" +"\n");
        } catch (IOException e) {
            System.out.println("Failed to register user");
        }
    }

    public boolean getAccountInfo(String email, String password) {
        try (Scanner scanner = new Scanner(new FileReader(userDataFile))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] index = line.split(";");
                if (index[0].equals(email) && index[1].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Failed to check credentials");
        }
        return false;
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


