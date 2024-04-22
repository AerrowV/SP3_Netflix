import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileIO {

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
                    movieList.add(new Movie(name, releaseDate, genre, rating));
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
                        Season season = new Season(seasonInfo);
                        seasons.add(season);

                    }
                    //arraylist af season objekter
                    //for hvert item i seasonEpisode
                    //new Season objekt
                    //tilføj season objekt til liste
                    //for hvert season objekt opret nye episode objekter og tilføj til relevant liste
                    seriesList.add(new Series(name, releaseDate, genre, rating, seasonEpisode));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (NumberFormatException e) {
            System.out.println("Error parsing value");
        }
    }
}
