import java.util.ArrayList;
import java.util.Scanner;

public class Series extends MediaData implements Media {
    private ArrayList<Season> seasonEpisode;
    private int currentEpisode;
    private int seasonSize;
    private int currentSeason;


    public Series(String name, String releaseYear, String genre, float rating, ArrayList<Season> seasonEpisode, int ID) {
        super(name, genre, releaseYear, rating, ID);
        this.seasonEpisode = seasonEpisode;

    }

    public ArrayList<Season> getSeasonEpisode() {
        return seasonEpisode;
    }

    @Override
    public void resumePlay() {
        System.out.println("Resuming series: " + getName());
    }

    @Override
    public void stopPlay() {
        System.out.println("Stopping series: " + getName());
    }

    @Override
    public void pausePlay() {
        System.out.println("Pausing series: " + getName());
    }

    @Override
    public void play() {
        System.out.println("Playing series: " + getName() + " Season " + currentSeason + " Episode " + currentEpisode);
    }

    public void nextEpisode() {
        if (currentEpisode >= seasonSize) {
            selectEpisode();
            seriesOptions();
        } else {
            currentEpisode++;

        }
    }

    public void seasonsInitializer() {
        TextUI ui = new TextUI();
        ui.displayMsg("Select a season: ");
        for (Season season : seasonEpisode) {
            System.out.println(season);
        }

    }

    public void selectEpisode() {
        TextUI ui = new TextUI();
        Season sc = selectSeason();
        ui.displayMsg("Select an episode:");
        for (Episode ep : sc.episodes) {
            System.out.println(ep);
        }

        String choice = ui.userInput();
        currentEpisode = Integer.parseInt(choice);
        if (Integer.parseInt(choice) < sc.episodes.size()) {
            ui.displayMsg(sc.episodes.get(Integer.parseInt(choice) - 1) + " selected");
            for (int i = 0; i < sc.episodes.size(); i++) {
                seasonSize++;
            }
        } else {
            ui.displayMsg("Invalid selection");
            selectEpisode();
        }

    }

    public Season selectSeason() {
        TextUI ui = new TextUI();
        seasonsInitializer();
        ui.displayMsg("\nType season number to select a season");
        String userChoice = ui.userInput();
        currentSeason = Integer.parseInt(userChoice);
        if (Integer.parseInt(userChoice) <= seasonEpisode.size()) {
            ui.displayMsg(seasonEpisode.get(Integer.parseInt(userChoice) - 1) + " selected");
            return seasonEpisode.get(Integer.parseInt(userChoice) - 1);

        } else {
            ui.displayMsg("Invalid selection");
            return selectSeason();

        }
    }

    public void seriesOptions() {
        boolean whileKey = true;
        TextUI ui = new TextUI();
        StartMenu startMenu = new StartMenu();
        FileIO fileIO = new FileIO();
        ui.displayMsg("1: Play episode "+ currentEpisode + "\n" + "2: Resume\n" + "3: Stop\n" + "4: Pause\n" + "5: Next episode\n" + "6: Return to menu");
        while (whileKey) {
            String userChoice = ui.userInput();
            switch (userChoice) {
                case "1":
                    play();
                    break;
                case "2":
                    resumePlay();
                    break;
                case "3":
                    stopPlay();
                    break;
                case "4":
                    pausePlay();
                    break;
                case "5":
                    nextEpisode();
                    break;
                case "6":
                    startMenu.userInterface();
                    whileKey = false;
                    break;
            }
        }

    }

    @Override
    public String toString() {
        return super.ID + ":" + " / " + getName() + " / " + getReleaseYear() + " / " + getGenre() + " / " + getRating();
    }

    @Override
    public int compareTo(MediaData o) {
        return this.getName().compareTo((o).getName());
    }
}
