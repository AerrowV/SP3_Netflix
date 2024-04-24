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
        try (Scanner sc = new Scanner(new FileReader(userDataFile))) {

            List<String> temp = new ArrayList<>();
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                String [] index = line.split(";");
                for (int i = 0; i < index.length; i++) {
                    temp.add(index[i]);
                }
                temp.set(2,watchLater);

                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < temp.size(); i++) {
                    builder.append(temp.get(i));
                    if (i<temp.size()-1) {
                        builder.append(";");
                    }
                }

                try (FileWriter writer = new FileWriter(userDataFile)) {
                    writer.write( builder+"\n");
                    System.out.println("Successfully added to watch later!");
                } catch (IOException e) {
                    System.out.println("Failed to add to watch later");
                }
break;
            }

        } catch (IOException e) {
            System.out.println("Failed to add to watch later");
        }
    }

    public void writerSeenMoviesList(String saveList) {
        try (Scanner sc = new Scanner(new FileReader(userDataFile))) {

            List<String> temp = new ArrayList<>();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] index = line.split(";");
                for (int i = 0; i < index.length; i++) {
                    temp.add(index[i]);
                }
                temp.set(3, saveList);

                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < temp.size(); i++) {
                    builder.append(temp.get(i));
                    if (i < temp.size() - 1) {
                        builder.append(";");
                    }
                }
                try (FileWriter writer = new FileWriter(userDataFile)) {
                    writer.write(builder + "\n");
                    System.out.println("Successfully added to save list!");
                } catch (IOException e) {
                    System.out.println("Failed to add to watch later");
                }
                break;
            }

        } catch (IOException e) {
            System.out.println("Failed to add to watch later");
        }
    }

    }